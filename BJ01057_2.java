import java.util.Scanner;

public class BJ01057_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = Math.min(a, b);
        b = Math.max(a, b);
        a = temp;

        while (a != b) {
            count++;
            a = (a+1)/2;
            b = (b+1)/2;
            N = (N+1)/2;
        }

        if (a == b) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
