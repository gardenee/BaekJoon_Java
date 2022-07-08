import java.util.Scanner;

public class BJ16931 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] turn = new int[M][N];
        int answer = N * M;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int curr = sc.nextInt();
                turn[j][i] = curr;

                if (j == 0) answer += curr;
                else if (curr > turn[j-1][i]) answer += curr - turn[j-1][i];

                if (i == 0) answer += curr;
                else if (curr > turn[j][i-1]) answer += curr - turn[j][i-1];
            }
        }
        System.out.println(2 * answer);
    }
}
