public class FindMissing {
    public static void findMissing(int arr[]){
        int x = 1;
        for (int i = 0; i < arr.length; i++){
            while (x < arr[i]) {
                System.out.print(x+" ");
                x++;
            }
            x++;
        }
    }

    public static void main(String ar[]){
        int arr[] = {1,2,4,5};
        findMissing(arr);
    }
}
