import java.util.Scanner;

public class BJ21304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();

        int r = 0;
        int g = 0;

        for (int X = N; X <= M; X++) {
            if ((p * X * (X-1)) % (2 * q) == 0) {
                int mul = (p * X * (X-1)) / (2 * q);
                for (int i = 1; i <= X/2; i++) {
                    if (i * (X-i) == mul) {
                        r = i;
                        g = X-i;
                    }
                }
            }
            if (r != 0 && g != 0) break;
        }
        if (r == 0 && g == 0) System.out.println("NO SOLUTION");
        else System.out.println(r + " " + g);
    }
}
