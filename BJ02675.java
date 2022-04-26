import java.util.*;
public class BJ02675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            String line = sc.nextLine().trim();
            for (int j = 0; j < line.length(); j++) {
                for (int k = 0; k < N; k++) {
                    System.out.print(line.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
