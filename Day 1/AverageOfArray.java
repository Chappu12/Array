import java.util.Scanner;

public class AverageOfArray {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("\nSum of Array : "+sum);
        System.out.println("Average of Array : "+sum / arr.length);
        sc.close();
    }
}
