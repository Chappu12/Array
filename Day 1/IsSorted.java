public class IsSorted {
    public static boolean sorted(int arr[]) {
        // boolean asc = true;
        // boolean desc = true;

        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i] < arr[i + 1]) {
        //         desc = false;
        //     }
        //     if (arr[i] > arr[i + 1]) {
        //         asc = false;
        //     }
        // }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                ascending = false; // Not ascending
            if (arr[i] < arr[i + 1])
                descending = false; // Not descending
        }

        return ascending || descending;
    }

    public static void main(String ar[]) {
        int[] arr = { 522, 444, 2, 1 };

        System.out.println(sorted(arr));
    }
}
