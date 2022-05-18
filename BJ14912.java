import java.util.*;

public class BJ14912 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int curr = i;
            while (curr >= 10) {
                int temp = curr % 10;
                if (temp == d) {
                    ans++;
                }
                curr /= 10;
            }
            if (curr == d) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
