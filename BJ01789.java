import java.util.Scanner;

public class BJ01789 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long n = 1;

        while (S >= (n*(n+1))/2) {
            n++;
            if (S == (n*(n+1))/2) {
                n++;
                break;
            }
        }
        if (S==1) System.out.println(1);
        else System.out.println(n-1);
    }
}
