/*Write a java program to insert an element in its proper position
in a given sorted array.
Example : 
Input as : {5,6,14,17,44}
Element to be inserted : 15
Result array : 5,6,14,15,17,44 */

public class InsertAtProperPos {
    public static void main(String ar[]) {
        int[] arr = { 5, 6, 14, 17, 44 };
        int[] res = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++){
            res[i] = arr[i];
        }

        int ele = 15;
        for(int i = res.length - 1; i >= 0; i--){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        for(int i = res.length - 1; i >= 0; i--){
            if(ele <= res[i]){
                res[i + 1] = res[i];
                res[i] = ele;
            }
            
        }
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
