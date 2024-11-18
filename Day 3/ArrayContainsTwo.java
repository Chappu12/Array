/*
 * Write a java program to count and print all the elements which contains 2 in it.
Input as : {1,12,32,44,222,102,34,56,67,125}
Output as : 12, 32, 222, 102, 125
Count is : 5

 */

public class ArrayContainsTwo {
    public static void containsTwo(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while(num != 0){
                int n = num % 10;
                if(n == 2){
                    System.out.print(arr[i]+" ");
                    count++;
                    break;
                }
                num = num / 10;
                // count++;
            }
        }
        System.err.println("\nElements : "+count);
        // if(bool){
        //     System.out.println("Array contains 2 "+count+" times");
        // }
        // else{
        //     System.out.println("Array does not contain 2");
        // }
    }
    public static void main(String ar[]){
        int arr[] = {1,12,32,44,222,102,34,56,67,125};
        // boolean bool = false;
        // int count = 0;

        containsTwo(arr);

        // if(bool){
        //     System.out.println("Array contains 2 "+count+" times");
        // }
        // else{
        //     System.out.println("Array does not contain 2");
        // }

        // int num = 121222112;

        // int temp = num;
        // while(temp != 0){
        //     int n = temp % 10;
        //     if(n == 2){
        //         bool = true;
        //         count++;
        //     }
        //     temp = temp / 10;
        // }

    }
}
