package meleha_Selenium.Java.ArrayPractice;

import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        // An Array will be rotated one position to the right
        // one of  the way is to actually using the for loop,
        // Also making the last element of the original ARRAY to the new first element Array in the rotated element
        int [] orignal = {1,2,3,4,5};
        int [] rightRotatedOrignalArray = new int[orignal.length];
        rightRotatedOrignalArray[0]=orignal.length;
        for(int i=0; i<orignal.length-1 ; i++){
            rightRotatedOrignalArray[i+1] = orignal[i];
        }
        System.out.println("original Array:  "+Arrays.toString(orignal));
        System.out.println("Right Rotate Array: "+Arrays.toString(rightRotatedOrignalArray));

    }
}
