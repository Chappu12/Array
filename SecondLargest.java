import java.util.Scanner;

public class SecondLargest{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

        int largest = arr[0];
        int secondLargest = -1;
        // for(int i = 0; i < n; i++){
        //     if(arr[i] > largest){
        //         largest = arr[i];
        //     }
        // }

        // for(int i = 0; i < n; i++){
        //     if(arr[i] > secondLargest && arr[i] != largest){
        //         secondLargest = arr[i];
        //     }
        // }

        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("\nLargest : "+largest);
        System.out.println("Second Largest : "+secondLargest);
        sc.close();
    }
}