import java.util.*;

public class BJ_01292 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] sum = new int[B+1];
        int cnt = 0;
        int n = 1;
        for (int i = 1; i <= B; i++) {
            sum[i] += sum[i-1];
            sum[i] += n;
            cnt++;
            if (cnt == n) {
                n++;
                cnt = 0;
            }
        }
        System.out.println(sum[B]-sum[A-1]);
    }
}
