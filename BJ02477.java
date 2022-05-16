import java.util.*;

public class BJ02477 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] c1 = new int[4][2];
        int[] c2 = new int[6];

        for (int i = 0; i < 6; i++) {
            int f = sc.nextInt();
            int d = sc.nextInt();

            if (c1[f-1][0] == 0) {
                c1[f-1][0] = i+1;
            } else {
                c1[f-1][1] = i+1;
            }
            c2[i] = d;
        }
        int ans = 1;
        int idx = 0;

        for (int i = 0; i < 4; i++) {
            if (c1[i][1] == 0) {
                ans *= c2[c1[i][0]-1];
                idx = Math.max(idx, c1[i][0] - 1);
            }
        }

        if (idx == 5 && c2[4] * c2[5] != ans) {
            idx = 0;
        }
        ans -= c2[(idx+2)%6] * c2[(idx+3)%6];
        System.out.println(ans * n);
    }
}
