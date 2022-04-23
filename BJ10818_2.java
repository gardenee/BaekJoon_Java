import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BJ10818_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String Line = br.readLine();
        int max = 0;
        int min = 0;

        StringTokenizer st = new StringTokenizer(Line, " ");
        for (int i = 0; i < N; i++) {
            int curr = Integer.parseInt(st.nextToken());
            if (i == 0) {
                max = curr;
                min = curr;
            } else {
                max = Math.max(max, curr);
                min = Math.min(min, curr);
            }
        }
        System.out.println(min + " " + max);
    }
}
