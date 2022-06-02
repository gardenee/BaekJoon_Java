import java.util.*;

public class BJ05568 {

    public static ArrayList<Integer> lst = new ArrayList<>();
    public static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        search(N, K, arr);
        System.out.println(set.size());
    }

    public static void search(int N, int K, int[] arr) {
        if (lst.size() == K) {
            String ans = "";
            for (Integer i: lst) ans += String.valueOf(arr[i]);
            set.add(ans);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!lst.contains(i)) {
                lst.add(i);
                search(N, K, arr);
                lst.remove(lst.size()-1);
            }
        }
    }
}
