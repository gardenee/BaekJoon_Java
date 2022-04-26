import java.util.*;
public class BJ05622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Line = sc.nextLine();
        int[] phoneRef = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
        String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int ans = 0;

        for (int i = 0; i < Line.length(); i++) {
            ans += phoneRef[ABC.indexOf(Line.substring(i, i+1))] + 1;
        }
        System.out.println(ans);
    }
}
