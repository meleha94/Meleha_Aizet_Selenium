package meleha_Selenium.Java.ArrayPractice;

import java.util.Arrays;

public class AssendingOrderOfArray {
    public static void main(String[] args) {
        //
        int [] originalArray = {5,2,8,7,1};
        int seting = 0;
        Arrays.sort(originalArray);
        //int [] accedningOrder = new int [originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i+1; j < originalArray.length; j++) {
                if(originalArray[i] > originalArray[j]) {
                    seting = originalArray[i];
                    originalArray[i] = originalArray[j];
                    originalArray[j] = seting;
                }
            }
        }
        System.out.println("assending "+ Arrays.toString(originalArray));
     //   System.out.println("Assending: "+Arrays.toString(accedningOrder));
    }
}
