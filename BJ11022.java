import java.util.Scanner;

public class BJ11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + (i+1) + ": " + A + " + " + B + " = " + (A+B));
        }
    }
}
