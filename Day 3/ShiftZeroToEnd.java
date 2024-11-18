/*
 * Write a java program to shift all the zeros to the end of the given array without changing the order of non-zero elements.
Input as : {1,0,0,4,5,0,0,1};
Output as : {1,4,5,1,0,0,0,0}

 */

import java.util.Arrays;

public class ShiftZeroToEnd{
    public static void main(String ar[]){
        int arr[] = {1,0,0,4,5,0,0,1};
        int[] temp = new int[arr.length];
        int x = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                temp[x++] = arr[i];
            }
        }

        // for(int i = 0; i < temp.length; i++){
        //     if(temp[i] == 0){
        //         arr[i] = temp[i];
        //     }
        // }

        System.out.println(Arrays.toString(temp));
    }
}