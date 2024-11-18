import java.util.Arrays;

public class ShiftZeroToStart {
    public static void shiftZeroToStart(int arr[]) {
        int x = 0;
        int[] temp = new int[arr.length];

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != 0) {
                temp[x++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String ar[]) {
        int arr[] = { 1, 0, 0, 4, 5, 0, 0, 1 };
        shiftZeroToStart(arr);

        // System.out.println(Arrays.toString(arr));
    }
}
