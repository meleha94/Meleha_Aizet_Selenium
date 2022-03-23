package meleha_Selenium.Java.ArrayPractice;

public class PrintTheElementOfAnArray {
    public static void main(String[] args) {
        // this is a simple printing out an array
        int [] arr = new int[7];
        arr[0]= 10;
        arr[1] = 11;
        arr[2] = 1;
        arr[3]=7;
        arr[4]=45;
        arr[5]=arr[0];
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
