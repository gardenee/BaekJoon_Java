import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BJ01969 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ord = {"A", "C", "G", "T"};

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        HashMap<Integer, int[]> cnt = new HashMap<>();
        for (int i = 0; i < M; i++) {
            cnt.put(i, new int[] {0, 0, 0, 0});
        }

        for (int i = 0; i < N; i++) {
            String DNA = sc.nextLine();
            for (int j = 0; j < M; j++) {
                int[] curr = cnt.get(j);
                curr[Arrays.asList(ord).indexOf(DNA.substring(j, j+1))] += 1;
                cnt.put(j, curr);
            }
        }

        String answer = "";
        int num = 0;
        for (int i = 0; i < M; i++) {
            int[] curr = cnt.get(i);
            int max = 0;
            int n = 0;
            for (int j = 0; j < 4; j++) {
                if (max < curr[j]) {
                    num += max;
                    max = curr[j];
                    n = j;
                } else {
                    num += curr[j];
                }
            }
            answer += ord[n];
        }
        System.out.println(answer);
        System.out.println(num);
    }
}
