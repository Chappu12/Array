public class SecondLargestAndSecondSamllest {
    public static int find2ndLargest(int[] arr) {
        for(int i = arr.length - 1; i > 0; i--) {
            if(arr[i] > arr[i - 1]) {
                System.out.println("First largest Number : "+arr[i]);
                return arr[i - 1];
            }
        }
        return -1;
    }

    public static void find2ndSmallest(int arr[]){
        int smallest = arr[0];
        int secondSmallest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(secondSmallest);
    }

    // public static void secondLargest(int arr[]) {
    //     int largest = arr[0];
    //     int secondLargest = arr[0];

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > largest) {
    //             secondLargest = largest;
    //             largest = arr[i];
    //         } else if (arr[i] > secondLargest && arr[i] != largest) {
    //             secondLargest = arr[i];
    //         }
    //     }
    //     System.out.println(largest);
    //     System.out.println(secondLargest);
    // }

    public static void main(String ar[]) {
        int arr[] = { 1, 3, 5, 6, 6, 7, 7, 11, 11 };
        // secondLargest(arr);
        System.out.println("Second Largest Number : "+find2ndLargest(arr));
        find2ndSmallest(arr);
    }
}
