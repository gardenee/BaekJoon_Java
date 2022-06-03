import java.io.*;
import java.util.Scanner;

public class BJ11721 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] ipt = sc.nextLine().toCharArray();

        for (int i = 0; i < ipt.length; i++) {
            if (i != 0 && i % 10 == 0) System.out.println();
            else System.out.print(ipt[i]);
        }
    }
}
