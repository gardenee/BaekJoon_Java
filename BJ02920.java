import java.util.Scanner;

public class BJ02920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int song = Integer.parseInt(sc.nextLine().replace(" ", ""));

        if (song == 12345678) {
            System.out.println("ascending");
        } else if (song == 87654321) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
