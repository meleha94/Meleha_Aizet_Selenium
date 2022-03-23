package meleha_Selenium.Java.ArrayPractice;

public class ReverseOrderForArray {
    public static void main(String[] args) {
        int [] arr = {6,5,7,8,4,9,12,65,78,4,8,54};
         // we need to start write the array, then loop through them by making the intial same as array
        // length and then decrement it by one, LOOP THROUGH UNTIL IT I IS NOT LESS THAN 0

        for(int i=arr.length-1;i>=0;i-- ){
         System.out.print(arr[i]+" ");
        }
    }
}
