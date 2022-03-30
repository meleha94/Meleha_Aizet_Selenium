@login
Feature: As user I want to be able to login under different roles
  Background: common steps
    Given user is on the login page

  @smoke
  Scenario: Login as a sales manger
    When user logs in
    Then user should see dashboard page


  @s_o
  Scenario Outline: Parametrized login as <role>
    When user logs in as a "<role>"
    Then user should see dashboard page

    Examples:
      | role          |
      | sales manager |
      | store manager |
      | driver        |

  @s_o @with_two_columns
  Scenario Outline: Parametrized login as <role>
    When user logs in as a "<role>"
    Then user should see "<page_title>" page

    Examples:
      | role          | page_title      |
      | sales manager | Dashboard       |
      | store manager | Dashboard       |
      | driver        | Quick Launchpad |

  @negative_login @smoke
  Scenario: Invalid password
    When user logs in with "storemanager85" username and "wrong" password
    Then user verifies that "Invalid user name or password." message is displayed

  @negative_scenario_outline
  Scenario Outline: Invalid login with <username> and <password>
    When user logs in with "<username>" username and "<password>" password
    Then user verifies that "<message>" message is displayed

    Examples: data set
      | username | password | message                        |
      | wrong    | bad      | Invalid user name or password. |
      | wrong213 | bad      | Invalid user name or password. |
      | wrong32  | bad      | Invalid user name or password. |
      | wrong12  | bad      | Invalid user name or password. |


