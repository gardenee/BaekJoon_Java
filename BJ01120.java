import java.util.*;

public class BJ01120 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int min = 50;
        for (int i = 0; i <= B.length()-A.length(); i++) {
            int temp = A.length();
            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) == B.charAt(i+j)) {
                    temp -= 1;
                }
            }
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println(min);
    }
}
