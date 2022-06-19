import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ10986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int sum = 0;
        long ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken()) % M;

            sum = (sum + temp) % M;
            if (!map.containsKey(sum)) map.put(sum, 1);
            else map.put(sum, map.get(sum)+1);
        }

        for (int key: new ArrayList<>(map.keySet())) {
            long val = map.get(key);
            if (key == 0) ans += (val+1) * val / 2;
            else ans += val * (val-1) / 2;
        }
        System.out.println(ans);
    }
}
