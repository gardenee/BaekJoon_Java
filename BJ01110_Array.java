import java.util.Scanner;

public class BJ01110_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        int[] arr = new int[2];
        arr[0] = N / 10;
        arr[1] = N % 10;

        do {
            count += 1;
            if(arr[0] == 0) {
                arr[0] = arr[1];
            } else {
                int temp = arr[1];
                arr[1] = (arr[0] + arr[1]) % 10;
                arr[0] = temp;
            }
        } while (arr[0] * 10 + arr[1] != N);

        System.out.println(count);
    }
}
