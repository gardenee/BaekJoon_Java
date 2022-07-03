import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ15900 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, List<Integer>> tree = new HashMap<>();

        for (int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (!tree.containsKey(a)) tree.put(a, new ArrayList<>());
            if (!tree.containsKey(b)) tree.put(b, new ArrayList<>());
            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        long answer = 0;
        int cnt = 1;
        int k = 0;
        List<Integer> queue = new ArrayList<>();
        queue.add(1);
        boolean[] visited = new boolean[N+1];
        visited[1] = true;

        while (cnt < N) {
            k++;
            List<Integer> temp = new ArrayList<>();
            for (int node: queue) {
                for (int son: tree.get(node)) {
                    if (!visited[son]) {
                        temp.add(son);
                        visited[son] = true;
                        List<Integer> curr = tree.get(son);
                        if (curr.size() == 1 && visited[curr.get(0)]) answer += k;
                        cnt++;
                    }
                }
            }
            queue = temp;
        }
        if (answer % 2 == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}
