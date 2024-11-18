/*
 * You are given an array of integers and a number of steps. Implement a method to rotate the array to the right by the given number of steps.

Input:
nums = [1, 2, 3, 4, 5] // 5 1 2 3 4 --> 4 5 1 2 3
                    
steps = 2
Output:
[4, 5, 1, 2, 3]
Input :
nums = [1,2,3,4,5]
steps = 5
Output : 
[1,2,3,4,5]

Input: 
nums = [1,2,3,4,5]
steps = 7
Output :
[4, 5, 1, 2, 3]

 */

import java.util.Arrays;

public class RotateArrayRight {
    public static void rotateArray(int arr[], int steps) {
        steps = steps % arr.length;
        while (steps != 0) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            steps--;
        }
    }

    public static void main(String ar[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        rotateArray(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
