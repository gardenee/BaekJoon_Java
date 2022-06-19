import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BJ02178 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] dy = {1, -1, 0, 0};
        int[] dx = {0, 0, 1, -1};

        int[][] maze = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        visited[0][0] = true;

        for (int i = 0; i < N; i++) { // 미로 준비
            st = new StringTokenizer(br.readLine().replace(""," "));
            for (int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Deque<int[]> curr = new ArrayDeque<>();
        Deque<int[]> next = new ArrayDeque<>();

        int ans = 1;
        boolean flag = true;
        curr.add(new int[] {0, 0});

        while(flag) {
            ans++;
            while(!curr.isEmpty()) {
                int[] edge = curr.pop();
                for (int i = 0; i < 4; i++) {
                    int y = edge[0]+dy[i];
                    int x = edge[1]+dx[i];
                    if (0 <= y && y < N && 0 <= x && x < M && maze[y][x] == 1 && !visited[y][x]) {
                        visited[y][x] = true;
                        next.add(new int[] {y, x});
                        if (y == N-1 && x == M-1) flag = false;
                    }
                }
            }
            curr.addAll(next);
            next = new ArrayDeque<>();
        }
        System.out.println(ans);
   }
}
