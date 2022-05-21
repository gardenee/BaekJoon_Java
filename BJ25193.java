import java.lang.reflect.Array;
import java.util.*;

public class BJ25193 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String diet = sc.next();

        int C = N;
        diet = diet.replace("C","");
        C -= diet.length();

        int ans = C / (N-C+1);
        if (C % (N-C+1) == 0) {
            System.out.println(ans);
        } else {
            System.out.println(ans + 1);
        }
    }
}
