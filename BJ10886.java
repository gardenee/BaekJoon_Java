import java.util.Scanner;

public class BJ10886 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n;
        int count = 0;

        for (int i = 0; i < N; i++) {
            n = sc.nextInt();
            if (n == 1) {
                count += 1;
            }
        }

        if (count > N / 2) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }
    }
}
