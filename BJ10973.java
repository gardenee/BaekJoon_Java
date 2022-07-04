import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ10973 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(sc.nextLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int idx = -1;
        for (int i = N-1; i > 0; i--) {
            if (arr[i] < arr[i-1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) System.out.println(-1);
        else {
            for (int i = N-1; i > 0; i--) {
                if (arr[i] < arr[idx-1]) {
                    int temp = arr[i];
                    arr[i] = arr[idx-1];
                    arr[idx-1] = temp;
                    break;
                }
            }
            for (int i = 0; i < idx; i++) System.out.print(arr[i] + " ");
            for (int i = N-1; i >= idx; i--) System.out.print(arr[i] + " ");
        }
    }
}
