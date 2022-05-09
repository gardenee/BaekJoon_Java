import java.util.Scanner;

public class BJ02506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = 0;
        int stream = 0;

        for (int i = 0; i < N; i ++) {
            int curr = sc.nextInt();
            if (curr == 1) {
                stream += 1;
                answer += stream;
            } else {
                stream = 0;
            }
        }
        System.out.println(answer);
    }
}
