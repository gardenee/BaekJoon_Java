import java.util.Scanner;

public class BJ20154_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ref = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};

        String word = sc.nextLine();
        int ans = 0;
        for (int i = 0; i < word.length(); i++) {
            ans += ref[word.charAt(i)-'A'];
        }

        if ((ans % 10) % 2 == 1) {
            System.out.println("I'm a winner!");
        } else {
            System.out.println("You're the winner?");
        }
    }
}
