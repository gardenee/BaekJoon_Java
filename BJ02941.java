import java.util.*;
public class BJ02941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ref = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String word = sc.nextLine();
        int count = 0;
        for (int i = 0; i < ref.length; i++) {
            while (word.contains(ref[i])) {
                count += 1;
                word = word.replaceFirst(ref[i], "!");
            }
        }
        word = word.replaceAll("!", "");
        System.out.println(count + word.length());
    }
}
