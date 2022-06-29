import java.util.Scanner;

public class BJ14715 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = N;
        int n = 0;

        for (int i = 2; i <= N; i++) {
            while (K % i == 0) {
                n++;
                K /= i;
            }
            if (K <= 1) break;
        }

        int answer = 0;
        while (n > Math.pow(2, answer)) answer++;

        System.out.println(answer);
    }
}
