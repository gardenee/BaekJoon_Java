import java.io.*;

public class BJ01032 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] answer = br.readLine().trim().split("");

        for (int i = 0; i < N-1; i++) {
            String[] curr = br.readLine().trim().split("");
            for (int j = 0; j < answer.length; j++) {
                if (!answer[j].equals(curr[j])) {
                    answer[j] = "?";
                }
            }
        }

        for (String s: answer) {
            System.out.print(s);
        }
    }
}
