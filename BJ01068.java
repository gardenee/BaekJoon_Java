import java.util.*;

public class BJ01068 {

    public static HashMap<Integer, List<Integer>> tree = new HashMap<>();
    public static Deque<Integer> queue = new ArrayDeque<>();
    public static HashSet<Integer> answer = new HashSet<>();
    public static int root = -1;
    public static int del = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ipt = new int[N];

        for (int i = 0; i < N; i++) {
            int curr = sc.nextInt();
            if (curr == -1) root = i;
            else {
                if (!tree.containsKey(curr)) tree.put(curr, new ArrayList<>());
                tree.get(curr).add(i);
            }
            ipt[i] = curr;
        }
        del = sc.nextInt();
        delete(del);

        if (ipt[del] != -1) {
            tree.get(ipt[del]).remove((Integer) del);
            if (tree.get(ipt[del]).isEmpty()) tree.remove(ipt[del]);
        }

        findLeaf(root);
        System.out.println(answer.size());
    }

    public static void delete(int curr) {
        if (tree.containsKey(curr)) {
            List<Integer> temp = tree.get(curr);
            tree.remove(curr);
            for (int node: temp) delete(node);
        }
    }

    public static void findLeaf(int node) {
        if (tree.containsKey(node)) queue.addAll(tree.get(node));
        else if (node != del) answer.add(node);

        if (!queue.isEmpty()) {
            node = queue.pop();
            findLeaf(node);
        }
    }
}
