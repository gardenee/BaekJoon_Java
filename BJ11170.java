import java.util.Scanner;

public class BJ11170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int count = 0;
            int first = sc.nextInt();
            int last = sc.nextInt();
            for (int j = first; j <= last; j++) {
                String jString = String.valueOf(j);

                int a = jString.length();
                jString = jString.replace("0", "");
                int b = jString.length();

                count += a - b;
            }
            System.out.println(count);
        }
    }
}
