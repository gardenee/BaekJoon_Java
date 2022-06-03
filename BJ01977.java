import java.util.Scanner;

public class BJ01977 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int min = -1;
        int sum = 0;
        for (int i = M; i <= N; i++) {
            int root = (int)Math.sqrt(i);
            if ((int)Math.pow(root, 2) == i) {
                if (min == -1) min = i;
                sum += i;
            }
        }
        if (min != -1) System.out.println(sum);
        System.out.println(min);
    }
}
