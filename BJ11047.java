import java.util.Scanner;

public class BJ11047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr= new int[N];
        for (int i = N-1; i >= 0; i--) arr[i] = sc.nextInt();

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += K / arr[i];
            K %= arr[i];
            if (K == 0) break;
        }

        System.out.println(ans);
    }
}
