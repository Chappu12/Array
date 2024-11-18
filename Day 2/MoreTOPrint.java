/*Write a java program to print all duplicate elements from a given array.
Input  : arr = [1,2,1,3,4,6,2,5,4]
Output : 1 2 4 
 */
import java.util.Scanner;

public class MoreTOPrint {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i + 1;j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
