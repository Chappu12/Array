public class TwoSum {
    public static void twoSum(int arr[], int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == j){
                    continue;
                }
                if(arr[i] + arr[j] == target){
                    System.out.println("Two numbers that add up to " + target + " are " + arr[i] + " and " + arr[j]);
                    System.out.println("Postions of arr[i] is "+i+" and arr[j] is "+j);
                    return;
                }
            }
        }
    }

    public static void main(String ar[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        twoSum(arr, 16);
    }
}
