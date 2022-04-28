import java.util.*;

public class BJ02851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int sumP1;

        for (int i = 0; i < 10; i++) {
            int curr = sc.nextInt();
            if ((sum + curr) < 100) {
                sum += curr;
            } else {
                sumP1 = sum + curr;
                if ((sumP1-100) <= (100-sum)) {
                    System.out.println(sumP1);
                } else {
                    System.out.println(sum);
                }
                sum = sumP1;
                break;
            }
        }
        if (sum < 100) {
            System.out.println(sum);
        }
    }
}
