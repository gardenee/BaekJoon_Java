import java.util.Arrays;
import java.util.Scanner;

public class BJ02659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = num[i%4]*1000 + num[(i+1)%4]*100 + num[(i+2)%4]*10 + num[(i+3)%4];
        }
        Arrays.sort(nums);
        int CN = nums[0];

        int curr = 0;
        int cnt = 0;
        for (int a = 1; a < 10; a++) {
            for (int b = a; b < 10; b++) {
                for (int c = a; c < 10; c++) {
                    if (a == c) {
                        for (int d = b; d < 10; d++) {
                            curr = a * 1000 + b * 100 + c * 10 + d;
                            if (curr != CN) {
                                cnt += 1;
                            } else {
                                cnt += 1;
                                break;
                            }
                        }
                    } else {
                        for (int d = a+1; d < 10; d++) {
                            curr = a * 1000 + b * 100 + c * 10 + d;
                            if (curr != CN) {
                                cnt += 1;
                            } else {
                                cnt += 1;
                                break;
                            }
                        }
                    }
                    if (curr == CN) {
                        break;
                    }
                }
                if (curr == CN) {
                    break;
                }
            }
            if (curr == CN) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
