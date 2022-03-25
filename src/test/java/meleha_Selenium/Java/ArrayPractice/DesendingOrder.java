package meleha_Selenium.Java.ArrayPractice;

import java.util.Arrays;

public class DesendingOrder {
    public static void main(String[] args) {

        // when decending order
        // 1. creat one Array
        // 2. create a vraible where it is = 0;
        // 3. creat a for loop where i is starting with 0
        // 4. create another for loop where the inital j is starting at i+1
        // 5. create an if statment where index of arr i is less then index of array j
        // 6. then place the value in the created vraiable
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
