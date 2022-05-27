import java.util.*;

public class BJ11816 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String ans = "<";

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            queue.addLast(i+1);
        }

        int i = 0;
        while (!queue.isEmpty()) {
            i++;
            int curr = queue.pop();
            if (i == K) {
                ans += curr + ", ";
                i = 0;
            } else {
                queue.addLast(curr);
            }
        }
        System.out.println(ans.substring(0, ans.length() - 2) + ">");
    }
}
