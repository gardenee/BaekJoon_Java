import java.util.*;

public class BJ04289 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            int k = sc.nextInt();

            int[][] history = new int[101][2];

            for (int i = 0; i < k*n*(n-1)/2; i++) {
                int x = sc.nextInt();
                String xx = sc.next();
                int y =sc.nextInt();
                String yy = sc.next();

                int result = winner(x, xx, y, yy);

                if (result == x) {
                    history[x][0]++;
                    history[y][1]++;
                } else if (result == y) {
                    history[x][1]++;
                    history[y][0]++;
                }
            }

            for (int i = 1; i <= n; i++) {
                if ((history[i][0]+history[i][1])==0) System.out.println("-");
                else System.out.printf("%4.3f%n", ((double)history[i][0])/(history[i][0]+history[i][1])+0.00000000001);
            }
            System.out.println();
        }
    }

    public static int winner(int x, String xx, int y, String yy) {
        if (xx.equals(yy)) return -1;
        else if ((xx.equals("rock")&&yy.equals("scissors")) || (xx.equals("scissors")&&yy.equals("paper")) || (xx.equals("paper")&&yy.equals("rock"))) return x;
        else return y;
    }
}
