import java.util.Scanner;

public class BJ01212_시간초과 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split("");

        String ans = "";
        for (String s: nums) {
            int i = Integer.parseInt(s);
            ans += i/4;
            ans += (i%4)/2;
            ans += (i%4)%2;
        }

        System.out.println(Integer.parseInt(ans));
    }
}
