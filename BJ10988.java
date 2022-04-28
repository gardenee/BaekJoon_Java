import java.util.Scanner;

public class BJ10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim();
        int T = 1;
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                T = 0;
                break;
            }
        }
        System.out.println(T);
    }
}
