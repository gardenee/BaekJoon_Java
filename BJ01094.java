import java.util.*;

public class BJ01094 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int sum = 64;
        int min = 64;
        int ans = 1;

        while (sum > X) {
            min /= 2;
            ans += 1;

            if (sum-min > X) {
                sum -= min;
                ans -= 1;

            } else if (sum-min == X) {
                ans -= 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
