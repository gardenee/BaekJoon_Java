import java.util.*;

public class BJ02738 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] answer = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                answer[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print((answer[i][j] + sc.nextInt()) + " ");
            }
            System.out.println();
        }
    }
}
