/*
Write a Java method named replaceElement that replaces the element at the given position in the array with another given element.

Input:
arr = [1, 2, 3, 4, 5]
position = 2
newElement = 10

After modification, arr should be [1, 2, 10, 4, 5]

 */

public class ReplaceElement {
    public static void replaceElement(int arr[], int position, int newElement){
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(i == position){
                arr[i] = newElement;
                found = true;
            }
        }
        if(!found){
            System.out.println("Position not found");
        }
    }

    public static void main(String ar[]){
        int[] arr = {1, 2, 3, 4, 5};

        replaceElement(arr, 2, 69);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
