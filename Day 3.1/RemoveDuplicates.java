public class RemoveDuplicates {
    // public static void removeDuplicates(int arr[]) {
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         if (arr[i] != arr[i + 1]) {
    //             System.out.print(arr[i] + " ");
    //         }
    //         if (i + 1 == arr.length - 1) {
    //             System.out.print(arr[i + 1]);
    //         }
    //     }
    // }

    public static void removeDuplicates(int[] nums) {
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
                System.out.print(nums[i]+" ");
            }
            if(i + 1 == nums.length - 1){
                System.out.print(nums[i+1]);
            }
        }
    }

    public static void main(String ar[]) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4 };
        removeDuplicates(arr);
    }
}
