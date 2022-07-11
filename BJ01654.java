import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ01654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] lines = new long[K];
        for (int i = 0; i < K; i++) lines[i] = Long.parseLong(br.readLine());
        Arrays.sort(lines);

        long start = 1;
        long end = lines[K-1]+1;

        while (start < end) {
            long mid = (start + end) / 2;
            long count = 0;

            for (long line: lines) count += line / mid;

            if (count >= N) {
                start = mid+1;
            } else end = mid;
        }
        System.out.println(start-1);
    }
}
