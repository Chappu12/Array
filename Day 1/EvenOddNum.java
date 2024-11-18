import java.util.Scanner;

public class EvenOddNum {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements you want : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even numbers : "+even);
        System.out.println("Odd numbers : "+odd);
        sc.close();
    }
}
