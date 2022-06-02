import java.util.ArrayList;
import java.util.Scanner;

public class BJ15649 {

    public static ArrayList<Integer> lst = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        dfs(N, M);
    }

    public static void dfs(int N, int M) {
        if (lst.size() == M) {
            for (Integer n: lst) System.out.print(n + " ");
            System.out.println();
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!lst.contains(i)) {
                lst.add(i);
                dfs(N, M);
                lst.remove(lst.size()-1);
            }
        }
    }
}
