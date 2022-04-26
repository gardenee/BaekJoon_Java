import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int [] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < N; i++) {
            int temp = nums[i];
            max = Math.max(temp, max);
            min = Math.min(temp, min);
        }
        System.out.println(min + " " + max);
    }
}
