import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class BJ01759 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();

        String[] ipt = sc.nextLine().split(" ");
        Arrays.sort(ipt);

        search(L, 0, 0, ipt, "", bw);

        bw.flush();
        bw.close();
    }

    public static void search(int L, int v, int c, String[] ipt, String answer, BufferedWriter bw) throws IOException {
        if (L == 0 && v >= 1 && c >= 2) {
            bw.write(answer + "\n");
        } else if (L <= 0) {

        } else {
            for (String str: ipt) {
                if (answer.equals("") || str.charAt(0) > answer.charAt(answer.length()-1)) {
                    answer += str;

                if (isVowel(str)) v++;
                else c++;

                search(L-1, v, c, ipt, answer, bw);

                if (!answer.equals("")) answer = answer.substring(0, answer.length()-1);
                if (isVowel(str)) v--;
                else c--;
                }
            }
        }
    }

    public static boolean isVowel(String str) {
        switch (str) {
            case "a":
            case "e":
            case "o":
            case "i":
            case "u":
                return true;

            default:
                return false;
        }
    }
}
