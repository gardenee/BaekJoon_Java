import java.util.*;

public class BJ13335 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int L = sc.nextInt();
        sc.nextLine();

        Integer[] arr = new Integer[w];
        for (int i = 0; i < w; i++) arr[i] = 0;
        Deque<Integer> bridge = new ArrayDeque<>(Arrays.asList(arr));

        String ipt = sc.nextLine();
        StringTokenizer st = new StringTokenizer(ipt);

        int time = 0;
        int sum = 0;
        int curr = 0;

        do {
            time++;
            if (curr == 0 && st.hasMoreTokens()) curr = Integer.parseInt(st.nextToken());

            sum -= bridge.pop();
            if (sum + curr <= L) {
                sum += curr;
                bridge.addLast(curr);
                curr = 0;
            } else bridge.addLast(0);

        } while (sum != 0);

        System.out.println(time);
    }
}
