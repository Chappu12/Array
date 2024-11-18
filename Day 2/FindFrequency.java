public class FindFrequency {
    public static void main(String ar[]){
        int arr[] = {1, 2, 1, 3, 4, 6, 2, 5, 4};

        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j] && arr[j] != 0){
                    count++;
                    arr[j] = 0;
                }
            }
            if(arr[i] != 0){
                System.out.println("Frequency of " + arr[i] + " is " + count);
            }
        }
    }
}
