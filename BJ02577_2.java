import java.util.Scanner;

public class BJ02577_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];
        int num = 1;

        for (int i = 0; i < 10; i++) {
            array[i] = 0;
        }

        for (int i = 0; i < 3; i++) {
            num *= sc.nextInt();
        }

        while (num > 0) {
            array[num % 10] += 1;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
