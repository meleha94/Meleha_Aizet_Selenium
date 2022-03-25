package meleha_Selenium.Java.ArrayPractice;

import java.util.Arrays;

public class DesendingOrder {
    public static void main(String[] args) {

        // when decending order
        // 1. create one Array
        // 2. create a variable where it is = 0;
        // 3. create a for loop where i is starting with 0
        // 4. create another for loop where the initial j is starting at i+1
        // 5. create an if statement where index of arr i is less than index of array j
        // 6. then place the value in the created variable
        // 7. then assign index if i to the j
        // 8. then assign index of j to stored variable

        int [] arr = {5,2,8,7,1};
        int min = 0;
        for(int i=0; i<arr.length; i++){
            for (int j =i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    min = arr[i];
                    arr[i]=arr[j];
                    arr[j]= min;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
