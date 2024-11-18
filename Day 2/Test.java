public class Test {
    public static void main(String ar[]) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        // int arr2[] = {};
        int n = 2;

        // n = n % arr1.length;
        while (n != 0) {
            int temp = arr1[0];
            for (int i = 1; i < arr1.length; i++) {
                // if(i <= arr1.length){
                arr1[i - 1] = arr1[i];
                // }
            }
            arr1[arr1.length - 1] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
