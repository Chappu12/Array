/*
 * You are given an array of integers and an index number. Implement a method to rotate left from the given index.

arr = [1,2,3,4,5,6]  -> 2 3 4 5 6 1 -> 3 4 5 6 1 2 -> 4 5 6 1 2 3
int index = 3
Output : 4 5 6 1 2 3

arr = [1,2,3,4,5,6,7,8] -> 2 3 4 5 6 7 8 1->
int index = 3
output: 4 5 6 7 8 1 2 3

 */

import java.util.Arrays;

public class RotateArrayLeft {
    public static void rotateArray(int arr[], int steps) {
        steps = steps % arr.length;
        while (steps != 0) {
            int temp = arr[0];

            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
            steps--;
        }
    }

    public static void main(String ar[]) {
        int arr[] = { 1, 2, 3, 4, 5 };

        rotateArray(arr,4);
        System.out.println(Arrays.toString(arr));
    }
}
