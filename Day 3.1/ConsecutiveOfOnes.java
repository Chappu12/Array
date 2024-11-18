public class ConsecutiveOfOnes {
    public static int largestConsecutive(int arr[]) {
        int maxi = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > maxi) {
                    maxi = count;
                }
            } 
            else {
                count = 0;
            }
        }
        return maxi;
    }

    public static void main(String ar[]) {
        int arr[] = { 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 };

        System.out.println(largestConsecutive(arr));
    }
}
