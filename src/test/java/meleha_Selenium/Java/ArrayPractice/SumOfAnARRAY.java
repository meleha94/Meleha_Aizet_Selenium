package meleha_Selenium.Java.ArrayPractice;

public class SumOfAnARRAY {
    public static void main(String[] args) {
        int sArr [] ={12,2,5,64,45,12,45};
        int sumOfAnArray = 0;
        for (int each : sArr){
            sumOfAnArray+=each;
        }
        System.out.println(sumOfAnArray);
    }
}
