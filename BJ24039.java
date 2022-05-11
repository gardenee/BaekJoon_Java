import java.util.*;

public class BJ24039 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] num = new int[104];
        num[0] = -1;
        num[1] = -1;

        int temp = 0;
        for (int i = 2; i < num.length; i++) {
            if (num[i] == 0) {
                for (int j = 2 * i; j < num.length; j += i) {
                    num[j] = -1;
                }
                if (temp * i > N) {
                    System.out.println(temp * i);
                    break;
                } else {
                    temp = i;
                }
            }
        }
    }
}
