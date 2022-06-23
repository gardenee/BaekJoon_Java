import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ03078_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] students = new int[N];
        int[] name = new int[21];
        long ans = 0;

        for (int i = 0; i < N; i++) {
            String curr = br.readLine();
            int len = curr.length();

            students[i] = len;
            if (i > K) name[students[i-K-1]]--;

            ans += name[len];
            name[len]++;
        }
        System.out.println(ans);
    }
}
