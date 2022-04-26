import java.util.*;
public class BJ02908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = String.valueOf(sc.nextInt());
        int A_rev = Integer.parseInt(new StringBuffer(A).reverse().toString());
        String B = String.valueOf(sc.nextInt());
        int B_rev = Integer.parseInt(new StringBuffer(B).reverse().toString());

        System.out.println(Math.max(A_rev, B_rev));
    }
}
