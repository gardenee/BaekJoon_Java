import java.util.Scanner;

public class BJ03052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[42];
        for (int i = 0; i < 42; i++) {
            array[i] = 0;
        }

        for (int i = 0; i < 10; i++) {
            array[sc.nextInt() % 42] += 1;
        }

        int ans = 0;
        for (int i = 0; i < 42; i++) {
            if (array[i] != 0) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
