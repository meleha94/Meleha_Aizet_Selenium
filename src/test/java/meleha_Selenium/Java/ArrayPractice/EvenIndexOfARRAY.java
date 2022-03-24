package meleha_Selenium.Java.ArrayPractice;

public class EvenIndexOfARRAY {
    public static void main(String[] args) {
        /*
        If i would need to strat with index of 1 and then increase with 2 inorder to
        getting the even posting of an array
         */


        //              1  2 3    4  5    6  7  8 9
        int [] again = {23,1,2321,54,2314,23,12,2,5};
        //              0, 1 ,2,  3,  4   5  6  7 8
        for (int i = 1; i<again.length; i++,i++){
            System.out.print(again[i]+" ");
        }
    }
}
