import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ02606 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int com = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<Integer>> conn = new HashMap<>();
        for (int i = 0; i <= com; i++) conn.put(i, new ArrayList<>());

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String ipt = br.readLine();
            StringTokenizer st = new StringTokenizer(ipt);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            conn.get(a).add(b);
            conn.get(b).add(a);
        }

        boolean[] visited = new boolean[com+1];
        Arrays.fill(visited, false);
        visited[1] = true;

        int ans = 0;
        int curr;

        Deque<Integer> queue = new ArrayDeque<>();
        if (conn.containsKey(1)) queue.addAll(conn.get(1));

        while (!queue.isEmpty()) {
            do {
                curr = queue.pop();
            } while (visited[curr] && !queue.isEmpty());
            if (visited[curr]) break;

            ans++;
            visited[curr] = true;
            ArrayList<Integer> temp = conn.get(curr);
            for (Integer i: temp) if (!visited[i]) queue.add(i);
        }
        System.out.println(ans);
    }
}
