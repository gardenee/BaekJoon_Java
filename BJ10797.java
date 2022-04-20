import java.util.*;

public class BJ10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num;
        int ans = 0;

        for (int i = 1; i <= 5; i++) {
            num = sc.nextInt();
            if (num == N) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
