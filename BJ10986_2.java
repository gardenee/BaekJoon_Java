import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10986_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int sum = 0;
        long ans = 0;

        int[] check = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken()) % M;
            sum = (sum + temp) % M;
            check[sum]++;
        }
        for (int i = 0; i < M; i++) {
            long mod = check[i];
            if (i == 0) ans += (mod+1) * mod / 2;
            else ans += mod * (mod-1) / 2;
        }
        System.out.println(ans);
    }
}
