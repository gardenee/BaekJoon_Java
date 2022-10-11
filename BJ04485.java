import java.util.*;
import java.io.*;

public class BJ04485 {
    public static int[] dx = {0, 0, -1, 1}, dy = {-1, 1, 0, 0};
    public static int T = 1, N;
    public static int[][] maze, route;
    public static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            maze = new int[N][N]; route = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    maze[i][j] = Integer.parseInt(st.nextToken());
                    route[i][j] = 150000;
                }
            }
            visited = new boolean[N][N];
            visited[0][0] = true;
            route[0][0] = maze[0][0];

            search(new int[] {0, 0});

            System.out.println("Problem " + T++ + ": " + route[N-1][N-1]);
        }
    }

    public static int[] smallest() {
        int[] rtn = {-1, -1};
        int max = 150000;

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (!visited[x][y] && route[x][y] < max) {
                    rtn[0] = x;
                    rtn[1] = y;
                    max = route[x][y];
                }
            }
        }
        return rtn;
    }

    public static void search(int[] curr) {
        int x = curr[0], y = curr[1];
        if (x == y && x == -1) return;

        visited[x][y] = true;

        for (int n = 0; n < 4; n++) {
            int nx = x + dx[n], ny = y + dy[n];
            if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny]) {
                if (route[nx][ny] > maze[nx][ny] + route[x][y]) {
                    route[nx][ny] = maze[nx][ny] + route[x][y];
                }
            }
        }
        search(smallest());
    }
}
