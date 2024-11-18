public class Test{
    public static void middle(int arr[]){
        int mid;
       
            if(arr.length % 2 == 0){
                mid = arr.length / 2;
                System.out.println(arr[mid - 1]+" "+arr[mid]);
            }
            else{
                mid = arr.length / 2;
                System.out.println(arr[mid]);
            }
    
    }

    public static void main(String ar[]){
        int arr[] = { 2, 14, 5, 5};
        middle(arr);    
    }
}