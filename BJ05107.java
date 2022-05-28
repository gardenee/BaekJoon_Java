import java.util.*;

public class BJ05107 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseN = 1;

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;

            Map<String, String> map = new HashMap<>();

            for (int i=0; i<N; i++) {
                map.put(sc.next(), sc.next());
            }

            int ans = 0;
            Set <String> visited = new HashSet<>();

            for (String curr: map.keySet()) {
                if (!visited.contains(curr)) {
                    dfs(curr, visited, map);
                    ans++;
                }
            }
            System.out.println(caseN + " " + ans);
            caseN++;
        }
    }

    public static void dfs (String curr, Set<String> visited, Map<String, String> graph) {
        if (visited.contains(curr)) return;
        visited.add(curr);
        dfs(graph.get(curr), visited, graph);
    }
}
