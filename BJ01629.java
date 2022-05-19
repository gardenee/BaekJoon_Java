import java.util.*;

public class BJ01629 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        System.out.println(cal(A, B, C));
    }

    public static long cal(long A, long B, long C) {
        if (B == 1) {
            return A % C;
        } else if (B % 2 == 0) {
            long temp = cal(A, B/2, C);
            return (temp % C) * temp % C;
        } else {
            long temp = cal(A, B/2, C);
            return (((temp % C) * (temp % C)) % C * (A % C)) % C;
        }
    }
}
