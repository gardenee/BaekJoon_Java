import java.util.*;

public class BJ01834 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        N--;

        long sum;
        if (N % 2 == 0) {
            sum = (N+1) * N/2;
        } else if (N == 1) {
            sum = 1;
        } else {
            sum = (N+2) * (N/2) + 1;
        }

        N++;
        long ans = sum * (N+1);
        System.out.println(ans);
    }
}
