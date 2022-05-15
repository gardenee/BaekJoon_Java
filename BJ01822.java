import java.util.*;
import java.util.stream.Stream;

public class BJ01822 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.nextLine();

        String[] Aa = sc.nextLine().replace("\n", "").split(" ");
        String[] Ba = sc.nextLine().replace("\n", "").split(" ");

        Set<String> As = new HashSet<String>(Arrays.asList(Aa));
        Set<String> Bs = new HashSet<String>(Arrays.asList(Ba));

        As.removeAll(Bs);
        System.out.println(As.size());

        if (As.size() != 0) {
            String[] Aarr = As.toArray(new String[0]);
            ArrayList <Integer> Al = Stream.of(Aarr).mapToInt(Integer::parseInt).collect(ArrayList::new, List::add, List::addAll);
            Collections.sort(Al);

            for (Integer a: Al) {
                System.out.print(a + " ");
            }
        }
    }
}
