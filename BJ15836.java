import java.io.*;
import java.util.StringTokenizer;

public class BJ15836 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 0;

        while (true) {
            String ipt = br.readLine();
            StringTokenizer st = new StringTokenizer(ipt);
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            if (M * N * P * Q == 0) break;

            n++;
            bw.write("Case #" + n + ":\n");

            if (N != P) {
                bw.write("undefined\n");
                for (int i = 0; i < M+P; i++) br.readLine();
                continue;
            }

            int[][] A = new int[M][N];
            for (int i = 0; i < M; i++) {
                ipt = br.readLine();
                st = new StringTokenizer(ipt);
                for(int j = 0; j < N; j++) {
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int[][] B = new int[P][Q];
            for (int i = 0; i < P; i++) {
                ipt = br.readLine();
                st = new StringTokenizer(ipt);
                for(int j = 0; j < Q; j++) {
                    B[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int a = 0; a < M; a++) {
                bw.write("| ");
                for (int b = 0; b < Q; b++) {
                    int temp = 0;
                    for (int c = 0; c < N; c++) {
                        temp += A[a][c] * B[c][b];
                    }
                    bw.write(temp + " ");
                }
                bw.write("|\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
