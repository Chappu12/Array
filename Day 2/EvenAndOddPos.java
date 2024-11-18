/*Write java method named findEvenandOddPositionElement that print all the elements which is present at even index and also in odd index.
 */

public class EvenAndOddPos {
    public static void findEvenandOddPositionElement(int arr[]){
        System.out.print("Even Position Numbers are");
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println();
        System.out.print("Odd Position Numbers are");
        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0){
                System.out.print(" " + arr[i]);
            }
        }
    }

    public static void main(String ar[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        findEvenandOddPositionElement(arr);
    }
}
