/*
 * You are given a sorted array containing n-1 unique integers in the range from 1 to n. There may be one or more integers missing from the array. Write a method to find and print all missing integers.

Example:
Input:
nums = [1, 2, 4, 7, 19]
Output:
[3, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]

 */

public class PrintMissingMore {
    public static void printMissing(int arr[]){
        int x = 1;

        for(int i = 0; i < arr.length; i++){
            while (x < arr[i]) {
                System.out.print(x+" ");
                x++;
            }
            x++;
        }
    }    

    public static void main(String ar[]){
        int arr[] = {1, 2, 4, 7, 19};
        printMissing(arr);
    }
}
