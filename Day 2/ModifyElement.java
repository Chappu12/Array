/*
 * Write a Java method named modifyArrayElement that modifies the given array by replacing every occurrence of oldElement with newElement.

arr = [1, 2, 3, 4, 5, 2, 3]
oldElement = 3
newElement = 10
After modification, arr should be [1, 2, 10, 4, 5, 10]
 */

public class ModifyElement {
    public static void modifyArrayElement(int[] arr, int oldElement, int newElement){
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == oldElement){
                arr[i] = newElement;
                found = true;
            }
        }
        if(!found){
            System.out.println("Old element not found in the array");
        }
    }

    public static void main(String ar[]){
        int[] arr = {1, 2, 3, 4, 5, 2, 3};

        modifyArrayElement(arr, 3, 10);
        modifyArrayElement(arr, 2, 11);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
