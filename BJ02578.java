import java.util.HashMap;
import java.util.Scanner;

public class BJ02578 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, int[]> nums = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num = sc.nextInt();
                int[] location = {i, j};
                nums.put(num, location);
            }
        }

        int[] rows = {0, 0, 0, 0, 0};
        int[] cols = {0, 0, 0, 0, 0};
        int[] cros = {0, 0};
        int count = 0;
        int bingo = 0;

        while (bingo < 3) {
            count++;
            int num = sc.nextInt();
            int[] location = nums.get(num);
            rows[location[0]] += 1;
            if (rows[location[0]] == 5) {
                bingo++;
            }

            cols[location[1]] += 1;
            if (cols[location[1]] == 5) {
                bingo++;
            }

            if (location[0] == location[1]) {
                cros[0] += 1;
                if (cros[0] == 5) {
                    bingo++;
                }
            }

            if (location[0] + location[1] == 4) {
                cros[1] += 1;
                if (cros[1] == 5) {
                    bingo++;
                }
            }
        }
        System.out.println(count);
    }
}
