import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class BJ10709 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        for (int i = 0; i < H; i++) {
            int cloud = -1;
            char[] sky = sc.next().toCharArray();

            for (char l: sky) {
                if (l == 'c') cloud = 0;
                else if (cloud >= 0) cloud++;
                System.out.print(cloud + " ");
            }
            System.out.println();
        }
    }
}
