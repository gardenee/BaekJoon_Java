import java.io.*;
import java.util.*;

public class BJ18258_queue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> queue = new ArrayList<>(2000000);
        int front = 0;
        int back = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0]) {
                case "pop":
                    if (back > front) {
                        bw.write(queue.get(front) + "\n");
                        front += 1;
                    } else {
                        bw.write("-1\n");
                    }
                    break;

                case "size":
                    bw.write((back-front) + "\n");
                    break;

                case "empty":
                    if (back == front) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;

                case "front":
                    if (back > front) {
                        bw.write(queue.get(front) + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;

                case "back":
                    if (back > front) {
                        bw.write(queue.get(back-1) + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;

                default:
                    int X = Integer.parseInt(cmd[1]);
                    queue.add(X);
                    back += 1;
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
