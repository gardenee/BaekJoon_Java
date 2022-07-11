import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ02805 {

    public static int[] trees;
    public static int N;
    public static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        trees = new int[N];
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if (max < trees[i]) max = trees[i];
        }
        System.out.println(binarySearch(0, max));
    }

    public static long binarySearch(int start, int end) {
        int mid = (start + end) / 2;
        long count = 0;

        for (int tree: trees) {
            if (tree > mid) count += tree - mid;
        }
        if (count >= M) start = mid+1;
        else end = mid;

        if (start >= end) return start-1;
        else return binarySearch(start, end);
    }
}
