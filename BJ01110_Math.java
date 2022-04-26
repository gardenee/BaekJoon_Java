import java.util.Scanner;

public class BJ01110_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int M = N;

        do {
            count += 1;
            M = (M % 10) * 10 + (M % 10 + M / 10) % 10;
        } while (M != N);

        System.out.println(count);
    }
}
