/*Q6) Find Maximum Element in an Array.//Done
Q7) Find Minimum element in an array.//Done
 */

import java.util.Scanner;

public class MaxAndMin{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: ");
        for(int a : arr){
            System.out.print(a+" ");
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("\nMaximun Number : "+max);
        System.out.println("Minimun Number : "+min);
        sc.close();
    }
}