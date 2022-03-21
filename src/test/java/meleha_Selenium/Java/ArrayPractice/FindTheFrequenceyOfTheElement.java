package meleha_Selenium.Java.ArrayPractice;

import java.util.Arrays;

public class FindTheFrequenceyOfTheElement {
    public static void main(String[] args) {
        //Java Program to find the frequency of each element in the array
        System.out.println("First you would need create an Array where you will be store an array,\n" +
                "2. You would need to create another where you need to provide the size of the first array ");
        int [] arr = {1,2,8,3,2,2,2,5,1};
        int [] fr = new int [arr.length];
        int visited = -1;
        for (int  i = 0; i<arr.length ; i++){
            int count = 1;
            for (int j = i+1 ; j<arr.length; j++){
                if( arr[i] == arr[j]){
                    count++;

                    fr[j] =visited;
                }
                if (fr [i] !=visited){
                    fr[i] = count;
                }
            }

        }
        System.out.println("arr = "+Arrays.toString(arr));
        System.out.println("arr = "+Arrays.toString(fr));
        System.out.println("Element   |   frequency");
        for (int i=0; i<fr.length; i++){
            if(fr[i]!=visited){
                System.err.println(arr[i]+"          |          "+fr[i]);
            }
        }
    }
}
