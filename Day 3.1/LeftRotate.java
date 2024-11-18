/*
 * Given an array of N integers, left rotate the array by one place.
Example 1:
Input:
 N = 5, array[] = {1,2,3,4,5}
Output:
 2,3,4,5,1
Explanation:
 
Since all the elements in array will be shifted 
toward left by one so ‘2’ will now become the 
first index and and ‘1’ which was present at 
first index will be shifted at last.
 */

import java.util.Arrays;

public class LeftRotate {
    public static void leftRotate(int arr[], int steps){
        steps = steps % arr.length;
        while (steps != 0) {
            int temp = arr[0];
            for(int i = 1; i < arr.length; i++){
                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = temp;
            steps--;
        }
    }

    public static void main(String ar[]){
        int arr[] = {1, 2, 3, 4, 5};
        leftRotate(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}
