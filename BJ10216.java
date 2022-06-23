import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ10216 {

    public static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] input = new int[N][3];

            parents = new int[N];
            for (int j = 0; j < N; j++) parents[j] = j;

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int R = Integer.parseInt(st.nextToken());
                input[j] = new int[]{x, y, R};

                for (int k = 0; k < j; k++) {
                    int x2 = input[k][0];
                    int y2 = input[k][1];
                    int R2 = input[k][2];

                    if (Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2) <= Math.pow(R + R2, 2)) {
                        if (parents[j] == j) parents[j] = findParent(k);
                        else union(k, j);
                    }
                }
            }
            System.out.println(Arrays.toString(parents));
            int answer = 0;
            for (int j = 0; j < N; j++) {
                if (j == findParent(j)) answer++;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static int findParent(int n) {
        if (parents[n] == n) return n;
        return parents[n] = findParent(parents[n]);
    }

    public static void union(int a, int b) {
        parents[findParent(a)] = findParent(b);
    }
}
