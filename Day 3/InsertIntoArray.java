/*Write a program to insert one element in a desired index in an sorted array and return resulting array.
arr = {1,2,3,4,5}

Test Case - 1
------------------
Enter index : 3
Enter element : 9
Output : [1, 2, 3, 9, 4, 5]

Test Case - 2
------------------
Enter index : 0
Enter element : 9
Output : [9, 1, 2, 3, 4, 5]

Test Case - 3
------------------
Enter index : 4
Enter element : 9
Output : [1, 2, 3, 4, 9, 5]

 */

import java.util.Arrays;

public class InsertIntoArray {
    public static void insertElement(int arr[], int index, int ele){
        int[] res = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            res[i] = arr[i];
        }

        for(int i = res.length - 1; i > index; i--){
            res[i] = res[i-1];
        }
        res[index] = ele;
        
        System.out.println(Arrays.toString(res));
    }
    
    public static void main(String ar[]){
        int arr[] = {1, 2, 3, 4, 5};
        insertElement(arr, 5, 69);
        // System.out.println(Arrays.toString(arr));
    }
}
