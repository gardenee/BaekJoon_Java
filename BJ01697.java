import java.util.*;

public class BJ01697 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i <= 100000; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(i-1);
            temp.add(i+1);
            temp.add(2*i);

            graph.put(i, temp);
        }

        boolean[] visited = new boolean[100001];
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(N);

        int cnt = 0;
        boolean flag = true;
        if (N == K) flag = false;
        while (flag) {
            cnt++;
            Set<Integer> temp = new HashSet<>();

            for (int X: queue) {
                if (graph.containsKey(X)) {
                    for (int x: graph.get(X)) {
                        if (x == K) flag = false;

                        if (x <= 100000 && x >= 0 && !visited[x]) {
                            temp.add(x);
                            visited[x] = true;
                        }
                    }
                }
            }
            queue = new ArrayDeque<>(temp);
        }
        System.out.println(cnt);
    }
}
