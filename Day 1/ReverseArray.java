// import java.util.Collections;

public class ReverseArray {
    public static void main(String ar[]){
        int[] arr = {2, 4, 7, 8, 4, 1};

        System.out.println("Original");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nAfter Reversing");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
