import java.util.*;
import java.io.*;

public class BJ02358 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> x = new HashMap<>();
        HashMap<String, Integer> y = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] curr = br.readLine().split(" ");

            if (!x.containsKey(curr[0])) {
                x.put(curr[0], 1);
            } else {
                x.put(curr[0], x.get(curr[0]) + 1);
            }

            if (!y.containsKey(curr[1])) {
                y.put(curr[1], 1);
            } else {
                y.put(curr[1], y.get(curr[1]) + 1);
            }
        }

        int ans = 0;
        for (String k : x.keySet()) {
            if (x.get(k) > 1) {
                ans += 1;
            }
        }

        for (String k : y.keySet()) {
            if (y.get(k) > 1) {
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}
