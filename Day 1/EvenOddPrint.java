import java.util.Scanner;

public class EvenOddPrint {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Elements ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        // System.out.println("Even elements: ");
		// for (int i = 0; i < arr.length; i++) {
		// 	if (arr[i] % 2 == 0)
		// 		System.out.print(arr[i] + " ");
		// }
		// System.out.println();
		// System.out.println("Odd elements: ");
		// for (int i = 0; i < arr.length; i++) {
		// 	if (arr[i] % 2 != 0)
		// 		System.out.print(arr[i] + " ");
		// }

        //OR

        System.out.println();
        System.out.print("Even Elements : ");
        for(int x : arr){
            if(x % 2 == 0){
                System.out.print(" "+x);
            }
        }

        System.out.print("\nOdd Elements : ");
        for(int x : arr){
            if(x % 2 != 0){
                System.out.print(" "+x);
            }
        }
        sc.close();
    }
}
