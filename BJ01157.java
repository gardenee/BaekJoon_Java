import java.util.*;
public class BJ01157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] ref = new int[26];
        for (int i = 0; i < 26; i++) {
            ref[i] = 0;
        }

        int count = 0;
        int max = 0;
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            int curr = ABC.indexOf(word.substring(i, i+1));
            ref[curr] += 1;
            if (ref[curr] > max) {
                count = 1;
                max = ref[curr];
                index = curr;
            } else if (ref[curr] == max) {
                count += 1;
            }
        }

        if (count > 1) {
            System.out.println("?");
        } else {
            System.out.println(ABC.substring(index, index+1));
        }
    }
}
