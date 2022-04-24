import java.util.Scanner;

public class BJ02525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        B += C % 60;
        A += C / 60;

        if (B >= 60) {
            B -= 60;
            A += 1;
        }

        A = A % 24;

        System.out.println(A + " " + B);
    }
}
