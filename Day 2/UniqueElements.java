/*
Write a java program to print all unique elements from a given array.
Input  : arr = [1,2,1,3,4,6,2,5,4]
Output : 3 6 5
 */

public class UniqueElements {
    public static void main(String ar[]){
        int arr[] = {1, 2, 3, 1, 5, 7, 8, 8, 9, 1, 1, 5};

        System.out.print("Array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
