import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BJ15651 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = sc.nextInt();
        int M = sc.nextInt();

        search(N, M, "", bw);
        bw.flush();
        bw.close();
    }

    public static void search(int N, int M, String ans, BufferedWriter bw) throws IOException {
        if (M==0) bw.write(ans + "\n");
        else {
            for (int i = 1; i <= N; i++) {
                ans += i + " ";
                search(N, M-1, ans, bw);
                ans = ans.substring(0,ans.length()-2);
            }
        }
    }
}
