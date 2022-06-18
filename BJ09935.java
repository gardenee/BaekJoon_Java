import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BJ09935 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char[] ipt = sc.next().toCharArray();
        char[] bomb = sc.next().toCharArray();

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> temp = new ArrayDeque<>();
        int curr = 0;

        for (int i = 0; i < ipt.length; i++) {
            if (ipt[i] == bomb[curr]) {
                stack.addLast(i);
                curr++;
            } else if (ipt[i] == bomb[0]) {
                temp.addLast(curr);
                curr = 1;
                stack.addLast(i);
            } else {
                curr = 0;
                temp = new ArrayDeque<>();
                while (!stack.isEmpty()) {
                    sb.append(ipt[stack.pop()]);
                }
                sb.append(ipt[i]);
            }
            if (curr == bomb.length) {
                for (int j = 0; j < curr; j++) stack.removeLast();
                if (temp.isEmpty()) curr = 0;
                else curr = temp.removeLast();
            }
        }
        while (!stack.isEmpty()) {
            sb.append(ipt[stack.pop()]);
        }
        if (sb.length() == 0) System.out.println("FRULA");
        else System.out.println(sb);
    }
}
