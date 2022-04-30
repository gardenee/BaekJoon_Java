import java.util.Scanner;

public class BJ01507 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = Math.min(a, b);
        b = Math.max(a, b);
        a = temp;

        while (N > 1) {
            count++;
            if (a % 2 == 1 && a + 1 == b) {
                break;

            } else if (N % 2 == 0) {
                a = (a+1)/2;
                b = (b+1)/2;
                N /= 2;

            } else {
                a = (a+1)/2;
                b = (b+1)/2;
                N = (N+1)/2;
            }
        }
        if (N <= 1) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
