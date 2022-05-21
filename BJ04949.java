import java.io.*;
import java.util.*;

public class BJ04949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            Stack<String> stack = new Stack<>();
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            boolean ans = true;
            String temp;
            String[] arr = str.split("");
            for (String a: arr) {
                switch (a) {
                    case "[":
                    case "(":
                        stack.push(a);
                        break;
                    case "]":
                        if (stack.empty()) {
                            ans = false;
                            break;
                        }
                        temp = stack.pop();
                        if (!temp.equals("[")) {
                            ans = false;
                        }
                        break;
                    case ")":
                        if (stack.empty()) {
                            ans = false;
                            break;
                        }
                        temp = stack.pop();
                        if (!temp.equals("(")) {
                            ans = false;
                        }
                        break;
                    default:
                        continue;
                }
                if (!ans) {
                    break;
                }
            }

            if (ans && stack.empty()) {
                bw.write("yes");
            } else {
                bw.write("no");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
