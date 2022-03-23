package meleha_Selenium.Java.ArrayPractice;

public class PrintingLargestNumberInARRAY {
    public static void main(String[] args) {
        int [] arr = {12,231,43,1234,12,123};
        int max = arr[0];
        for (int each : arr){
            if (max<each){
                max=each;
            }
        }
        System.out.println(max);
    }
}
