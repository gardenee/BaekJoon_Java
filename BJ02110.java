import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ02110 {

    public static int[] houses;
    public static int N;
    public static int C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        int max = 0;
        int min = 1000000000;
        houses = new int[N];
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            houses[i] = temp;
            if (max < temp) max = temp;
            if (min > temp) min = temp;
        }
        Arrays.sort(houses);

        System.out.println(binarySearch(1, (max-min)/(C-1)+1));
    }

    public static int binarySearch(int start, int end) {
        int mid = (start + end) / 2;
        int count = 0;
        int i = 0;

        for (int house: houses) {
            if (house >= i) {
                count++;
                i = house + mid;
            }
        }
        if (count < C) end = mid;
        else start = mid+1;

        if (start >= end) return start-1;
        else return binarySearch(start, end);
    }
}
