/*
 * You are given an sorted array containing n-1 unique integers in the range from 1 to n. There is exactly one integer missing. Write a method to find and return the missing integer.

Input:
nums = [1, 2, 4, 5, 6]     int x = 1
Output: 3

 */

public class PrintMissing {
    public static void printMissing(int arr[]){
        int x = 1;
        for(int i = 0; i < arr.length; i++){
            while(x < arr[i]){
                System.out.print(x + " ");
                x++;
            }
            x++;
        }
    }

    public static void main(String ar[]){
        int arr[] = {1, 2, 3, 6, 8};

        printMissing(arr);
        // System.out.println(Arrays.toString(arr));
    }
}
