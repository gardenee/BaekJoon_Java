import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BJ02358_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;

        HashMap<String, Integer> x = new HashMap<>();
        HashMap<String, Integer> y = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] curr = br.readLine().split(" ");

            if (!x.containsKey(curr[0])) {
                x.put(curr[0], 1);
            } else if (x.get(curr[0]) == 1) {
                ans += 1;
                x.put(curr[0], 2);
            }

            if (!y.containsKey(curr[1])) {
                y.put(curr[1], 1);
            } else if (y.get(curr[1]) == 1) {
                ans += 1;
                y.put(curr[1], 2);
            }
        }
        System.out.println(ans);
    }
}
