import java.util.*;
public class BJ01712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        if (B >= C) {
            System.out.println(-1);
        } else {
            System.out.println(A/(C-B)+1);
        }
    }
}
