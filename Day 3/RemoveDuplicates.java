/*Given a sorted array of integers, remove duplicates such that each element appears only once. Print the elements without duplicates.

Input:
nums = [1, 1, 2, 2, 3, 4, 4, 5]
Output:
[1, 2, 3, 4, 5]
 */

public class RemoveDuplicates {
    public static void removeDuplicates(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1]) {
                System.out.print(arr[i]+" ");
            }
            if(i + 1 == arr.length - 1){
                System.out.print(arr[i+1]);
            }
        }
    }

    public static void main(String ar[]) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 4, 5 };

        // System.out.println(removeDuplicates(arr));
        removeDuplicates(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }
}
