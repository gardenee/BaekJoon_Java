import java.util.Scanner;

public class BJ02789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String delete = "CAMBRIDGE";
        String[] email = sc.nextLine().split("");
        for (int i = 0; i < email.length; i++) {
            if (!delete.contains(email[i])) {
                System.out.print(email[i]);
            }
        }
    }
}
