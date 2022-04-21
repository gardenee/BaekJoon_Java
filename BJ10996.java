import java.util.*;

public class BJ10996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % 2 == 0) {
                int half = N / 2;
                System.out.print("*");
                for (int j = 1; j <= half - 1; j++) {
                    System.out.print(" *");
                }
                System.out.println();
                for (int j = 1; j <= half; j++) {
                    System.out.print(" *");
                }
                System.out.println();

            } else {
                int half = N / 2;
                System.out.print("*");
                for (int j = 1; j <= half; j++) {
                    System.out.print(" *");
                }
                System.out.println();
                for (int j = 1; j <= half; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
}
