package meleha_Selenium.Java.ArrayPractice;

public class ReverseOrderForArray {
    public static void main(String[] args) {
        int [] arr = {6,5,7,8,4,9,12,65,78,4,8,54};
        //int [] reverseArr = new int[arr.length];
        for(int i=arr.length-1;i>=0;i-- ){
         System.out.print(arr[i]+" ");
        }
    }
}
