import java.util.Scanner;

public class FindElement {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements you want to enter : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array :");
        for(int i = 0; i < n; i++){
            System.out.print(" "+arr[i]);
        }

        System.out.println("\nEnter element you want found : ");
        int found = sc.nextInt();
        boolean bool = false;
        for(int x : arr){
            if(found == x){
                bool = true;
            }
            else{
                bool = false;
            }
        }
        if(bool){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}
