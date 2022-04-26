import java.util.*;
public class BJ01065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                count += 1;
            } else if (i < 1000) {
                if (i/100 + (i%100)%10 == 2 * ((i%100)/10)) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
