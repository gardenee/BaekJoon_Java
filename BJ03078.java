import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ03078 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        long ans = 0;

        HashMap<Integer, Deque<Integer>> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String ipt = br.readLine();
            int len = ipt.length();

            Deque<Integer> deque = new ArrayDeque<>();
            if (map.containsKey(len)) deque = map.get(len);

            int temp;
            while(!deque.isEmpty()) {
                temp = deque.pop();
                if (i - temp <= K) {
                    deque.addFirst(temp);
                    break;
                }
            }
            ans += deque.size();
            deque.add(i);
            map.put(len, deque);
        }
        System.out.println(ans);
    }
}
