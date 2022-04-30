import java.util.Scanner;

public class BJ20154 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ref = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
        String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String[] word = sc.nextLine().split("");
        int N = word.length;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = ref[ABC.indexOf(word[i])];
        }

        while (N > 1) {
            if (N % 2 == 0) {
                int[] temp = new int[N/2];
                for (int i = 0; i < N/2; i++) {
                    temp[i] = (nums[2*i] + nums[2*i+1])%10;
                }
                nums = temp;
                N /= 2;
            } else {
                int[] temp = new int[N/2+1];
                for (int i = 0; i < N/2; i++) {
                    temp[i] = (nums[2*i] + nums[2*i+1])%10;
                }
                temp[N/2] = nums[N-1];
                nums = temp;
                N = N/2 + 1;
            }
        }

        if (nums[0] % 2 == 1) {
            System.out.println("I'm a winner!");
        } else {
            System.out.println("You're the winner?");
        }
    }
}
