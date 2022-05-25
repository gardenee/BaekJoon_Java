import java.util.*;
import java.io.*;

public class BJ15720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ipt = br.readLine();
        StringTokenizer st = new StringTokenizer(ipt);
        int[] arr = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int set = Math.min(Math.min(arr[0], arr[1]), arr[2]);

        ArrayList<Integer> lst;
        int sum = 0;
        int discount = 0;
        for (int i = 0; i < 3; i++) {
            lst = new ArrayList<>();
            ipt = br.readLine();
            st = new StringTokenizer(ipt);
            for (int j = 0; j < arr[i]; j++) {
                int curr = Integer.parseInt(st.nextToken());
                sum += curr;
                lst.add(curr);
            }
            Collections.sort(lst, Collections.reverseOrder());
            for (int j = 0; j < set; j++) {
                discount += lst.get(j) / 10;
            }
        }
        System.out.println(sum);
        System.out.println(sum - discount);
    }
}
