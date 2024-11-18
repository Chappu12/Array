/*
 * Write a java program to find the middle elements of a given array. If array is odd then print only the middle element, if array is even then print both the middle elements.[searching based on index]

 */

import java.util.Scanner;

public class MiddleElement{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        int mid;
        if(arr.length % 2 == 0){
            mid = arr.length / 2;
            System.out.println("\nMiddle Element : "+arr[mid]+", "+arr[mid - 1]);
        }
        else{
            mid = arr.length / 2;
            System.out.println("\nMiddle Element : "+arr[mid]);
        }
        sc.close();
    }
}