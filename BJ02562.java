import java.util.Scanner;

public class BJ02562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int index = 1;

        for (int i = 2; i <= 9 ; i++) {
            int curr = sc.nextInt();
            if (curr > max) {
                max = curr;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
