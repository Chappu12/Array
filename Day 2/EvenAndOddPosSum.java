/*Write java method named findSumOfOddandEvenPositionElement that print the all odd positions sum and also even
position sum.
 */

public class EvenAndOddPosSum {
    public static void findSumOfOddandEvenPositionElement(int arr[]){
        int evenSum = 0, oddSum = 0;
        System.out.print("Even position elements");
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                System.out.print(" "+arr[i]);
                evenSum += arr[i];
            }
        }
        System.out.println("\nSum of even position elements : "+evenSum);
        System.out.println();
        System.out.print("Even position elements");
        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0){
                System.out.print(" "+arr[i]);
                oddSum += arr[i];
            }
        }
        System.out.println("\nOdd of even position elements : "+oddSum);
    }

    public static void main(String ar[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        findSumOfOddandEvenPositionElement(arr);
    }
}
