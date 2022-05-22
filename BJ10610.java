import java.util.*;

public class BJ10610 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] N = sc.next().split("");
        int[] arr = new int[10];

        for (String n : N) {
            arr[Integer.parseInt(n)] += 1;
        }
        if (arr[0] == 0) {
            System.out.println(-1);
        } else {
            int sum = (arr[1] % 3 + arr[4] % 3 + arr[7] % 3) % 3 + (arr[2] % 3 + arr[5] % 3 + arr[8] % 3) % 3 * 2;
            if (sum % 3 != 0) {
                System.out.println(-1);
            } else {
                String ans = "";
                for (int i = 9; i >= 0; i--) {
                    String curr = String.valueOf(i);
                    for (int j = 0; j < arr[i]; j++) {
                        ans += curr;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
