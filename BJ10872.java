import java.util.*;
public class BJ10872 {
    public static int factorial(int n) {
        if (n == 0) {
           return 1;
        } else {
            return factorial(n-1) * n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
    }
}
