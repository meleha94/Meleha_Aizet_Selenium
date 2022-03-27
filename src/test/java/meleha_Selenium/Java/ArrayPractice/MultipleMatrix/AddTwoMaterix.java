package meleha_Selenium.Java.ArrayPractice.MultipleMatrix;

import java.util.Arrays;

public class AddTwoMaterix {
    public static void main(String[] args) {
/*        int [] oneDeminsionOfMateric = new int[3];
        oneDeminsionOfMateric[0]= 1;
        oneDeminsionOfMateric[1]=2;
        oneDeminsionOfMateric[2]=3;
       // System.out.println(Arrays.toString(oneDeminsionOfMateric));// [1, 2, 3]
        int [][] twoDemension = new int[2][2]; /// I am saing i need 3 rows and 3 cloums*/

/*        //        [cloumn][row]
        twoDemension[0][0] = 12;
        twoDemension[1][0] = 24;
       // twoDemension[2][0] = 36;
        */
        /*
        [12, 0, 0]
        [24, 0, 0]
        [36, 0, 0]
         */
        /*
   *//*     for (int[] each : twoDemension){
            System.out.println(Arrays.toString(each));
        }*/
        /*
        //        [cloumn][row]
        twoDemension[0][1] = 240;
        twoDemension[1][1] = 360;
        //twoDemension[2][1] = 480;
        */
        /*
        [12, 240, 0]
        [24, 360, 0]
        [36, 480, 0]
         *//*
        for (int[] each : twoDemension){
            System.out.println(Arrays.toString(each));
        }*/
    /*    twoDemension [0]=new int[]{12,56};
        int arr2[] =  new int[3];
        arr2 =new int[] {1,2};
        for (int[] each : twoDemension){
            System.out.println(Arrays.toString(each));
        }
*/
        //  create a 2d 2 arrays
        int [][] firstArray = {{1,2,3},{2,3,4},{1,2,3}};
        System.out.println("======= first array +++++++++++++++");
        for (int [] each: firstArray) {

            System.out.println(Arrays.toString(each)+" ");
        }
        System.out.println("======= end of the first array +++++++++++++++\n\n");
        int []secondArray [] = {{2,4,5},{1,5,7},{2,4,5}};
        System.out.println("======= Second array +++++++++++++++");
        for (int [] each: secondArray) {

            System.out.println(Arrays.toString(each)+" ");
        }
        System.out.println("======= end of the Second array +++++++++++++++\n\n");
        // now creating another array that will be the
        int [][]c = new int[3][3];
        System.out.println("======= Third Empty array +++++++++++++++");
        for (int [] each: c) {

            System.out.println(Arrays.toString(each)+" ");
        }
        System.out.println("======= end of the Third Empty array +++++++++++++++\n\n");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                c[i][j]=firstArray[i][j]+secondArray[i][j];
                System.out.print( c[i][j] +" ");
            }
            System.out.println();
        }
    }
}
