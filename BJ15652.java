import java.util.Scanner;

public class BJ15652 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        search(N, M, "");
    }

    public static void search(int N, int M, String ans) {
        if (M==0) System.out.println(ans);
        else {
            for (int i = 1; i <= N; i++) {
                if (ans.equals("") || ans.charAt(ans.length()-2) - '0' <= i) {
                    ans += i + " ";
                    search(N, M-1, ans);
                    ans = ans.substring(0, ans.length()-2);
                }
            }
        }
    }
}
