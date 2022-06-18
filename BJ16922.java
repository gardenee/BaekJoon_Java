import java.util.HashSet;
import java.util.Scanner;

public class BJ16922 {

    public static HashSet<Integer> set = new HashSet<>();
    public static int[] ref = {1, 5, 10, 50};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        dfs(0, N, 0);
        System.out.println(set.size());
    }

    public static void dfs(int sum, int N, int curr) {
        if (N == 0) set.add(sum);
        else for (int i: ref) {
            if (curr <= i) {
                sum += i;
                dfs(sum, N - 1, i);
                sum -= i;
            }
        }
    }
}
