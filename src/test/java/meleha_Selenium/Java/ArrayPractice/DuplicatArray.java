package meleha_Selenium.Java.ArrayPractice;

public class DuplicatArray {
    public static void main(String[] args) {
        int [] arr = {1,2,2,8,45,8,45};
        //In this program, we need to print the duplicate elements present in the array.
        // This can be done through two loops. The first loop will select an element and
        // the second loop will iteration through the array by comparing the selected element
        // with other elements. If a match is found, print the duplicate element.
        for(int i=0; i<arr.length; i++){
            for ( int j= i+1; j<arr.length ; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
