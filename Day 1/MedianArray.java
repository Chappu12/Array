import java.util.Scanner;

public class MedianArray {
    public static double findMedian(int[] a) {
		if (a.length % 2 == 0) {
			return (a[a.length / 2] + a[a.length / 2 - 1]) / 2.0;
		}
		return a[a.length / 2];
	}

    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("HOw many elements ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nMedian of an Array : ");
        System.out.println(findMedian(arr));
        sc.close();
        
    }
}
