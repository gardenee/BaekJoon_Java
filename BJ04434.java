import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ04434 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String Curr = br.readLine();
            StringTokenizer st = new StringTokenizer(Curr, " ");
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            double avg = (double)sum / n;
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > avg) {
                    count += 1;
                }
            }
            System.out.println(String.format("%.3f", ((double)count/n+0.000001)*100) + "%");
        }

    }
}
