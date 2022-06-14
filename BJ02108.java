import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class BJ02108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeMap<Integer, Integer> map = new TreeMap<>();
        long sum = 0;

        for (int i = 0; i < N; i++) {
            int curr = Integer.parseInt(br.readLine());
            int temp = 0;
            if (map.containsKey(curr)) temp = map.get(curr);
            map.put(curr,temp+1);
            sum += curr;
        }
        System.out.println((Math.round((sum+0.00001)/N))); // 산술평균

        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        int middle = N/2 + 1;
        int cnt = 0;
        for (Integer key : keys) {
            cnt += map.get(key);
            if (cnt >= middle) {
                System.out.println(key); //중앙값
                break;
            }
        }
        
        ArrayList<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, Collections.reverseOrder());
        
        int max = values.get(0);
        ArrayList<Integer> common = new ArrayList<>();
        
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            if (value == max) {
                common.add(key);
            }
        }
        if (common.size() == 1) System.out.println(common.get(0));
        else {
            Collections.sort(common);
            System.out.println(common.get(1)); // 최빈값
        }

        System.out.println(keys.get(keys.size()-1)-keys.get(0)); // 범위
    }
}
