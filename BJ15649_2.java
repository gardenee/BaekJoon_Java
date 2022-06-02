import java.util.Scanner;

public class BJ15649_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        dfs(N, M, "");
    }

    public static void dfs(int N, int M, String ans) {
        if (M==0) System.out.println(ans);
        else {
            for (int i = 1; i <= N; i++) {
                if (!ans.contains(String.valueOf(i))) {
                    ans += i + " ";
                    dfs(N, M-1, ans);
                    ans = ans.substring(0, ans.length()-2);
                }
            }
        }
    }
}
