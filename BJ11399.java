import java.util.*;

public class BJ11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int[] time = new int[N];
        String Times = sc.nextLine();
        StringTokenizer st = new StringTokenizer(Times, " ");
        for (int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time);

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += time[i] * (N-i);
        }

        System.out.println(ans);
    }
}
