import java.util.Scanner;

public class BJ01212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ref = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String[] nums = sc.next().split("");

        System.out.print(Integer.parseInt(ref[Integer.parseInt(nums[0])]));
        for (int i = 1; i < nums.length; i++) {
            System.out.print(ref[Integer.parseInt(nums[i])]);
        }
    }
}
