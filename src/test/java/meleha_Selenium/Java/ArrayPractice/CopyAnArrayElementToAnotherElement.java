package meleha_Selenium.Java.ArrayPractice;

import java.util.Arrays;

public class CopyAnArrayElementToAnotherElement {
    public static void main(String[] args) {
        // Java Program to copy all elements of one array into another array
        int [] arr = new int[5];

        arr[0] = 5;
        arr[1] = 15;
        arr [2] = 65;
        arr [3] = 25;
        arr [4] = 74;
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));// [5, 15, 65, 25, 74]

        int [] arr1 = new int[arr.length];
        for (int i=0; i<arr.length ; i++){
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));

    }
}
