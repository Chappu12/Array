public class Test{
    public static void ReverseArray(int arr[]){
        for(int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String ar[]){
        int arr[] = { 2, 14, 5, 5};
        ReverseArray(arr);
    }
}