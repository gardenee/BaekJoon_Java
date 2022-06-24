import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BJ01068_2 {

    public static HashMap<Integer, List<Integer>> tree = new HashMap<>();
    public static int del = -1;
    public static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int root = -1;

        for (int i = 0; i < N; i++) {
            int curr = sc.nextInt();
            if (curr == -1) root = i;
            else {
                if (!tree.containsKey(curr)) tree.put(curr, new ArrayList<>());
                tree.get(curr).add(i);
            }
        }
        del = sc.nextInt();

        if (del != root) search(root);
        System.out.println(answer);
    }

    public static void search(int node) {
        if (tree.containsKey(node)) {
            List<Integer> sons = tree.get(node);
            if (sons.size()==1 && sons.get(0)==del) answer++;
            else for (int son: sons) if (son != del) search(son);
        } else answer++;
    }
}
