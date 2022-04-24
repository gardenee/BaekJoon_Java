import java.util.Scanner;

public class BJ08958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String mark = sc.nextLine();
            int score = 0;
            int stream = 0;
            for (int j = 0; j < mark.length(); j++) {
                if (mark.charAt(j) == 'O') {
                    stream += 1;
                    score += stream;
                } else {
                    stream = 0;
                }
            }
            System.out.println(score);
        }
    }
}
