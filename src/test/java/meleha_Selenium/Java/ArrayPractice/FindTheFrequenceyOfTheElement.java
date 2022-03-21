package meleha_Selenium.Java.ArrayPractice;

public class FindTheFrequenceyOfTheElement {
    public static void main(String[] args) {
        //Java Program to find the frequency of each element in the array
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
    }
}
