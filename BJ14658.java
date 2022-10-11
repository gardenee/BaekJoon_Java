import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BJ14658 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<int[]> commets = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            commets.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        int answer = 0;
        for (int[] c1: commets) {
            int x1 = c1[0], y1 = c1[1];
            for (int[] c2: commets) {
                int x2 = c2[0], y2 = c2[1];
                if (x1 < x2) x2 = x1;
                if (y1 < y2) y2 = y1;

                int cnt = 0;
                for (int[] c3 : commets) {
                    int a = c3[0], b = c3[1];
                    if (x2 <= a && x2+L >= a && y2 <= b && y2+L >= b) {
                        cnt++;
                    }
                }
                if (answer < cnt) answer = cnt;
            }
        }
        System.out.println(K-answer);
    }
}
