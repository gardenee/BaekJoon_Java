import java.util.Scanner;

public class BJ01476_시간초과 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        int i = 1;
        while (true) {
            if (i % 16 + i / 16 == E && i % 29 + i / 29 == S && i % 20 + i / 20 == M) {
                System.out.println(i);
                break;
            } else {
                i++;
            }
        }
    }
}
