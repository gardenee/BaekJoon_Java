import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BJ18512 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Px = sc.nextInt();
        int Py = sc.nextInt();
        int ans = -1;

        if (Px == Py) ans = Px;
        else {
            List<Integer> listX = new ArrayList<>();
            List<Integer> listY = new ArrayList<>();
            listX.add(Px);
            listY.add(Py);

            while (ans == -1 && Px < 10000 && Py < 10000) {
                Px += X;
                Py += Y;
                listX.add(Px);
                listY.add(Py);

                if (listY.contains(Px)) {
                    ans = Px;
                }
                if (listX.contains(Py)) {
                    if (ans == -1) ans = Py;
                    else ans = Math.min(ans, Py);
                }
            }
        }

        System.out.println(ans);
    }
}
