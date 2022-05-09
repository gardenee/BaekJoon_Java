import java.util.Scanner;

public class BJ01292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 0;
        while (count <= end) {
            i++;
            for (int j = 0; j < i; j++) {
                count++;
                if (start <= count && count <= end) {
                    sum += i;
                }
                if (count > end) {
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
