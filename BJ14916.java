import java.util.*;

public class BJ14916 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int ans = (int) Math.ceil((double)money / 5);
        int curr = ans * 5;

        if (money == 1 || money == 3) {
            System.out.println(-1);
        } else {
            while (true) {
                if (curr < money) {
                    curr += 2;
                    ans += 1;
                } else if (curr > money) {
                    curr -= 3;
                } else {
                    System.out.println(ans);
                    break;
                }
            }
        }
    }
}
