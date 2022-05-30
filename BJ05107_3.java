import java.util.*;

public class BJ05107_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseN = 1;

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;

            int n = 1;

            Integer[] arr = new Integer[N+1];
            for (int i = 0; i < N+1; i++) arr[i] = i;
            Map<String, Integer> map = new HashMap<>();

            for (int i=0; i<N; i++) {
                String give = sc.next();
                String take = sc.next();
                if (!map.containsKey(give)) {
                    map.put(give, n);
                    n++;
                }
                if (!map.containsKey(take)) {
                    map.put(take, n);
                    n++;
                }
                union(map.get(give), map.get(take), arr);
            }

            for (int i=1; i<N+1; i++) arr[i] = findParents(i, arr);

            Set<Integer> ans = new HashSet<>(Arrays.asList(arr));
            System.out.println(caseN + " " + (ans.size()-1));
            caseN++;
        }
    }

    public static int findParents(int i, Integer[] arr) {
        if (arr[i] == i) return i;
        else return arr[i] = findParents(arr[i], arr);
    }

    public static void union(int i, int j, Integer[] arr) {
        int a = findParents(i, arr);
        int b = findParents(j, arr);
        arr[a] = arr[b];
    }
}
