import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BJ06603 {

    public static ArrayList<Integer> lst = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] ipt = br.readLine().split(" ");
            if (ipt[0].equals("0")) break;
            search(Integer.parseInt(ipt[0]), ipt, bw);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static void search(int N, String[] ipt, BufferedWriter bw) throws IOException {
        if (lst.size() == 6) {
            for (Integer i: lst) bw.write(i + " ");
            bw.newLine();
            return;
        }
        for (int i = 1; i < N+1; i++) {
            if (lst.isEmpty() || Integer.parseInt(ipt[i]) > lst.get(lst.size()-1)) {
                lst.add(Integer.parseInt(ipt[i]));
                search(N, ipt, bw);
                lst.remove(lst.size()-1);
            }
        }
    }
}
