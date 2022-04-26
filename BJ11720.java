import java.util.*;
public class BJ11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String nums = sc.nextLine();
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Long.parseLong(String.valueOf(nums.charAt(i)));
        }
        System.out.println(sum);
    }
}
