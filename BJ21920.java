import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ21920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        int[] nums = new int[A];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) nums[i] = Integer.parseInt(st.nextToken());

        int X = Integer.parseInt(br.readLine());
        List<Integer> divisor = new ArrayList<>();

        int x = X;
        for (int i = 2; i <= X; i++) {
            if (x % i == 0) divisor.add(i);
            while (x % i == 0) x /= i;

            if (x == 1) break;
        }

        long sum = 0;
        int cnt = 0;

        for (int num: nums) {
            int temp = 0;
            for (int div: divisor) {
                if (num % div == 0) {
                    temp++;
                    break;
                }
            }
            if (temp == 0) {
                cnt++;
                sum += num;
            }
        }
        System.out.println(sum/cnt);
    }
}
