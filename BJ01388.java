import java.util.Scanner;

public class BJ01388 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        String[][] input = new String[N][M];
        boolean[][] visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String[] temp = sc.nextLine().split("");
            input[i] = temp;
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    answer++;
                    visited[i][j] = true;
                    int k = 1;

                    if (input[i][j].equals("-")) {
                        while (j+k < M) {
                            if (input[i][j+k].equals("-") && !visited[i][j+k]) {
                                visited[i][j+k] = true;
                                k++;
                            } else break;
                        }
                    } else if (input[i][j].equals("|")) {
                        while (i+k < N) {
                            if (input[i+k][j].equals("|") && !visited[i+k][j]) {
                                visited[i+k][j] = true;
                                k++;
                            } else break;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
