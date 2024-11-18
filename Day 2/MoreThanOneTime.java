/*Write a java program to count how many elements are present more than one time.

Input  : arr = [1,2,1,3,4,6,2,5,4]
Output : 3 elements are present more than one time 
 */

import java.util.Scanner;

public class MoreThanOneTime {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        int totalCount = 0;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 2){
                totalCount++;
            }
        }
        System.out.println();
        System.out.println(totalCount+" elements are present more than one time.");
        sc.close();
    }
}
