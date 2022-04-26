import java.util.*;
public class BJ10870_dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+2];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < N+1; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[N]);
    }
}
