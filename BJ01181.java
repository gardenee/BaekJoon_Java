import java.io.*;
import java.util.*;

public class BJ01181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, HashSet<String>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String ipt = br.readLine();
            HashSet<String> temp = new HashSet<>();

            if (map.containsKey(ipt.length())) temp = map.get(ipt.length());
            temp.add(ipt);

            map.put(ipt.length(),temp);
        }

        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for (Integer key: keys) {
            List<String> values = new ArrayList<>(map.get(key));
            Collections.sort(values);

            for (String str: values) {
                bw.write(str + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
