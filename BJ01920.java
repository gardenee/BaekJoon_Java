import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ01920 {

    public static int[] nums;
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) nums[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(nums);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int find = Integer.parseInt(st.nextToken());
            System.out.println(binarySearch(0, N, find));
        }
    }

    public static int binarySearch(int start, int end, int find) {
        int mid = (start + end) / 2;

        if (nums[mid] == find) return 1;
        else if (nums[mid] >= find) end = mid;
        else start = mid + 1;

        if (start >= end) return 0;
        else return binarySearch(start, end, find);
    }
}
