package meleha_Selenium.Java.ArrayPractice;

import java.util.Arrays;

public class Largest3Number {
    public static void main(String[] args) {
        // we can do that by sorting
        int [] arr = {12,45,68,45,75,35,45};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------LARGEST Number In ARRAY ---------------");
        System.out.println("3rd largest number in array: "+arr[arr.length-3]);
        System.out.println("2nd largest number in array: "+arr[arr.length-2]);
        System.out.println("largest number in array: "+arr[arr.length-1]);
        System.out.println("-----------Lowest Number In ARRAY ---------------");
        System.out.println("Lowest number in This Array: "+arr[0]);
        System.out.println("Second Lowest number in this Array: "+arr[1]);
        System.out.println("Third Lowest number in this Array: "+arr[2]);
    }
}
