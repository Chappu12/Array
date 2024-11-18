import java.util.Arrays;

public class MoveZeroToEnd {
    public static void moveZero(int arr[]){
        int x = 0;
        int res[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                res[x++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
    
    public static void main(String ar[]){
        int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        moveZero(arr);
        
    }
}
