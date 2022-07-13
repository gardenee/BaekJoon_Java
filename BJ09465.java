import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ09465 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(sc.nextLine());
            int[][] stamps = new int[N][2];

            StringTokenizer st = new StringTokenizer(sc.nextLine());
            for (int i = 0; i < N; i++) stamps[i][0] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(sc.nextLine());
            for (int i = 0; i < N; i++) stamps[i][1] = Integer.parseInt(st.nextToken());

            if (N > 1) {
                stamps[1][0] += stamps[0][1];
                stamps[1][1] += stamps[0][0];
            }

            for (int i = 2; i < N; i++) {
                stamps[i][0] += Math.max(stamps[i-1][1], stamps[i-2][1]);
                stamps[i][1] += Math.max(stamps[i-1][0], stamps[i-2][0]);
            }

            System.out.println(Math.max(stamps[N-1][0], stamps[N-1][1]));
        }
    }
}
