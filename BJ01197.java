import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BJ01197 {

    public static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        TreeMap<Integer, List<int[]>> tree = new TreeMap<>();
        parents = new int[V+1];
        for (int i = 1; i <= V; i++) parents[i] = i;

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (!tree.containsKey(C)) tree.put(C, new ArrayList<>());
            tree.get(C).add(new int[] {A, B});
        }

        int answer = 0;
        int cnt = 0;
        for (int n: tree.keySet()) {
            List<int[]> temp = tree.get(n);
            for (int[] t: temp) {
                int a = t[0];
                int b = t[1];
                if (findParents(a) != findParents(b)) {
                    union(a, b);
                    cnt++;
                    answer += n;
                }
            }
            if (cnt == V-1) break;
        }
        System.out.println(answer);
    }

    public static int findParents(int i) {
        if (i == parents[i]) return i;
        return parents[i] = findParents(parents[i]);
    }

    public static void union(int a, int b) {
        parents[findParents(a)] = findParents(b);
    }
}
