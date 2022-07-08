import java.util.*;

public class BJ20291 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        TreeMap<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String curr = sc.nextLine();
            curr = curr.substring(curr.indexOf(".")+1);

            if (!map.containsKey(curr)) map.put(curr, 0);
            map.put(curr, map.get(curr)+1);
        }

        for (String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
