import java.util.Scanner;

public class SearchElement {
    public static void main(String ar[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter elements you want to enter : ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            
            // System.out.println("Array");
            // for(int i = 0; i < arr.length; i++){
            //     System.out.print(arr[i]+" ");
            // }

            System.out.print("\nEnter element to search : ");
            int search = sc.nextInt();

            // for(int i = 0; i < arr.length; i++){
            //     if(arr[i] == search){
            //         System.out.println("Element "+search+" found at index : "+i);
            //     }
            //     else{
            //         System.out.println("Element not found");
            //     }
            // }

            int i = 0;
            for (; i < arr.length; i++) {
            	if (arr[i] == search) {
            		System.out.println(search +" present at "+i +" index");
                    break;
            	}
            }
            if(i == arr.length) {
            	System.out.println(search +" not found in array.");
            }
            sc.close();
        }
    }
}
