import java.util.Scanner;

public class BJ02748 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long[] Pibonachi = new long[91];
        Pibonachi[0] = 0;
        Pibonachi[1] = 1;

        int N = sc.nextInt();

        for (int i = 2; i <= N; i++) {
            Pibonachi[i] = Pibonachi[i - 1] + Pibonachi[i - 2];
        }

        System.out.println(Pibonachi[N]);

    }
}
