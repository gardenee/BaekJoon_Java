import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class BJ10610_2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = sc.next().toCharArray();
        Arrays.sort(arr);

        if (arr[0] != '0') {
            System.out.println(-1);
        } else {
            int sum = 0;
            for (char c: arr) {
                sum += c - '0';
                sum %= 3;
            }
            if (sum % 3 != 0) {
                System.out.println(-1);
            } else {
                for (int i = arr.length-1; i >= 0; i--) {
                    bw.write(arr[i]);
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
