import java.util.*;

public class BJ03054 {

    public static String[] ans = new String[5];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replace("\n", "");

        for (int i = 0; i < 5; i++) {
            ans[i] = ".";
        }
        ans[2] = "#";

        for (int i = 0; i < str.length(); i++) {
            solution(i, str.charAt(i));
        }

        for (String s: ans) {
            System.out.println(s);
        }
    }

    public static boolean porw(int i) {
        if ((i+1) % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void solution(int i, char c) {
        if (porw(i)) {
            wendy(c);
        } else {
            peterpan(c);
        }
    }

    public static void peterpan(char c) {
        ans[0] += ".#..";
        ans[1] += "#.#.";
        ans[2] += "." + c + ".#";
        ans[3] += "#.#.";
        ans[4] += ".#..";
    }

    public static void wendy(char c) {
        ans[2] = ans[2].substring(0,ans[2].length()-1);
        ans[0] += ".*..";
        ans[1] += "*.*.";
        ans[2] += "*." + c + ".*";
        ans[3] += "*.*.";
        ans[4] += ".*..";
    }
}
