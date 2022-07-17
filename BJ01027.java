import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ01027 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        int[] buildings = new int[N];
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        for (int i = 0; i < N; i++) buildings[i] = Integer.parseInt(st.nextToken());

        int answer = 0;
        for (int i = 0; i < N; i++) {
            int temp = 0;
            double slope = 1000000001;
            for (int j = i-1; j >= 0; j--) {
                double curr = (buildings[j]-buildings[i])/(double)(j-i);
                if (curr < slope) {
                    temp++;
                    slope = curr;
                }
            }
            slope = -1000000001;
            for (int j = i+1; j < N; j++) {
                double curr = (buildings[j]-buildings[i])/(double)(j-i);
                if (curr > slope) {
                    temp++;
                    slope = curr;
                }
            }
            if (temp > answer) answer = temp;
        }
        System.out.println(answer);
    }
}
