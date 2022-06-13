import java.util.*;

public class BJ02257 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> compound = new ArrayDeque<>(Arrays.asList(sc.nextLine().split("")));
        Deque<Integer> stack = new ArrayDeque<>();
        int ans = 0;
        int temp = 1;
        int mul = 1;

        while (!compound.isEmpty()) {
            String curr = compound.removeLast();
            switch (curr) {
                case "C":
                case "H":
                case "O":
                    ans += atom(curr) * mul * temp;
                    temp = 1;
                    break;
                case ")":
                    stack.addLast(temp);
                    mul *= temp;
                    temp = 1;
                    break;
                case "(":
                    mul /= stack.removeLast();
                    break;
                default:
                    temp = Integer.parseInt(curr);
                    break;
            }
        }
        System.out.println(ans);
    }

    public static int atom(String str) {
        if (str.equals("C")) return 12;
        if (str.equals("H")) return 1;
        else return 16;
    }
}
