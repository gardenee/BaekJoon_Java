import java.util.Scanner;

public class BJ15888 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String answer = "둘다틀렸근";
        if (b * b > 4 * a * c) {
            if (b % a == 0 && c % a == 0 && Math.sqrt(b*b-4*a*c) == (int)Math.sqrt(b*b-4*a*c)) {
                answer = "정수근";
                b /= a;
                c /= a;

                double x1 = 0;
                double x2 = 0;
                for (int i = -100; i < 100; i++) {
                    if (i * (-b-i) == c) {
                        x1 = i;
                        x2 = -b-i;
                    }
                }
                while (x1 > 2) x1 /= 2;
                while (x2 > 2) x2 /= 2;
                if (x1 == 2 && x2 == 2) answer = "이수근";
            }
        }
        System.out.println(answer);
    }
}
