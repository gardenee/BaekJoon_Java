import java.util.HashMap;
import java.util.Scanner;

public class BJ02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        for (int i = 0; i < 3; i++) {
            num *= sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            map.put(i, 0);
        }

        while (num > 0) {
            int temp = map.get(num % 10);
            map.put(num % 10, temp + 1);
            num /= 10;
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(map.get(i));
        }
    }
}
