import java.util.Scanner;

public class BJ01049 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] GasungB = {1000, 1000};

        for (int i = 0; i < M; i ++) {
            int temp6 = sc.nextInt();
            int temp1 = sc.nextInt();
            if (temp6 < GasungB[0]) {
                GasungB[0] = temp6;
            }
            if (temp1 < GasungB[1]) {
                GasungB[1] = temp1;
            }
        }

        if ((double)GasungB[0]/6 >= GasungB[1]) {
            System.out.println(N * GasungB[1]);
        } else {
            System.out.println(Math.min(N/6 * GasungB[0] + N % 6 *GasungB[1], (N/6 + 1) * GasungB[0]));
        }
    }
}
