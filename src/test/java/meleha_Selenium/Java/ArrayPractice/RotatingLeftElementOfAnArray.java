package meleha_Selenium.Java.ArrayPractice;

import java.util.Arrays;

public class RotatingLeftElementOfAnArray {
    public static void main(String[] args) {
        //Program to left rotate the elements of an array
        int [] arr1 ={1,3,5,9,10,2,4};
        int [] arr2 = new int [arr1.length];
        //  int last = arr1[0];
        for(int i = 1; i<arr1.length;i++){
            arr2[i-1]=arr1[i];
        }
        arr2[arr2.length-1] = arr1[0];
        System.out.println(Arrays.toString(arr1));
        System.err.println(Arrays.toString(arr2));
    }
}
