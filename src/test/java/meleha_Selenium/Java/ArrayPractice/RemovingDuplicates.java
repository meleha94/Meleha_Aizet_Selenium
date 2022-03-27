package meleha_Selenium.Java.ArrayPractice;

import java.util.Arrays;

public class RemovingDuplicates {
    public static void main(String[] args) {
        int intial = 10;
        int [] removing = new int [intial];
        removing[0] = 10;
        removing[1] = 10;
        removing[2] = 20;
        removing[3] = 20;
        removing[4] = 40;
        removing[5] = 40;
        removing[6] = 50;
        removing[7] = 30;
        removing[8] = 50;
        removing[9] = 30;
        Arrays.sort(removing);
        int [] j = new int[intial];
        int temp= 0;
        for(int i=0; i<intial-1 ; i++){
            if(removing[i]!=removing[i+1]){
                j[temp++]=removing[i];
            }
        }
        j[temp]=removing[temp];
        intial = temp;


        for (int i=0; i<temp; i++){
            removing[i]=j[i];
        }
        for (int i =0; i<intial; i++){
            System.out.print(removing[i]+" ");
        }

    }
}
