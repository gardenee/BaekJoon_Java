import java.util.*;
import java.io.*;

public class Bj01302 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int max = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String curr = br.readLine().replace("\n", "");
            if (!map.containsKey(curr)) {
                map.put(curr, 0);
            }
            int temp = map.get(curr);
            max = Math.max(max, temp+1);
            map.put(curr, temp+1);
        }

        List<String> ans = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == max) {
                ans.add(key);
            }
        }
        Collections.sort(ans);

        System.out.println(ans.get(0));
    }
}
