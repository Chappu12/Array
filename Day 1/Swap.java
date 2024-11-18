import java.util.Scanner;

public class Swap{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter elements you want to enter : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[0];
        arr[0] = temp;

        System.out.println("After Swaping");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}