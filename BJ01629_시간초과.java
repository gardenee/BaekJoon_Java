import java.util.*;

public class BJ01629_시간초과 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        long result = 1;
        for (int i = 0; i < B; i++) {
            result = mul(A, C, result);
        }

        System.out.println(result);
    }

    public static long mul(long A, long C, long result) {
        return (result * A) % C;
    }
}
