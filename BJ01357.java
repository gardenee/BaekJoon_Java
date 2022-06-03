import java.util.Scanner;

public class BJ01357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        System.out.println(rev(rev(X)+rev(Y)));
    }

    public static int rev(int x) {
        char[] X = String.valueOf(x).toCharArray();
        String str = "";
        for (char c: X) str = c + str;
        return Integer.parseInt(str);
    }
}
