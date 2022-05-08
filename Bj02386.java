import java.io.*;

public class Bj02386 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String str = br.readLine().replace(" ","");

            if (str.equals("#")) {
                break;
            }

            int count = 0;
            char find = str.charAt(0);

            str = str.substring(1).toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == find) {
                        count += 1;
                }
            }
            bw.write(find + " " + count + "\n");
            bw.flush();
        }
        bw.close();
    }
}
