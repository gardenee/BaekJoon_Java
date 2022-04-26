import java.util.*;
public class BJ01152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        int N = line.length();
        int n = line.replace(" ", "").length();

        if (line.length() != 0) {
            System.out.println(N - n + 1);
        } else {
            System.out.println(0);
        }
    }
}
