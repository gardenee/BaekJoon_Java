import java.util.*;

public class BJ05107_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = 1;

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;

            Map<String, String> map = new HashMap<>();

            for (int i=0; i<N; i++) {
                map.put(sc.next(), sc.next());
            }

            int ans = 0;
            Set <String> checked = new HashSet<>();

            for (String head: map.keySet()) {
                String  curr = "";
                if (!checked.contains(head)) {
                    checked.add(head);
                    ans++;
                    while (!head.equals(curr)) {
                        if (curr.equals("")) curr = head;
                        curr = map.get(curr);
                        checked.add(curr);
                    }
                }
            }
            System.out.println(K + " " + ans);
            K++;
        }
    }
}
