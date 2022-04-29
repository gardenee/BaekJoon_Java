import java.util.Scanner;

public class BJ05032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();

        int drink = 0;
        int curr = e + f;

        while (curr >= c) {
            drink += curr/c;
            curr = curr % c + curr/c;
        }

        System.out.println(drink);
    }
}
