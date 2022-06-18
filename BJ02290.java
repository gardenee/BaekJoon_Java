import java.util.List;
import java.util.Scanner;

public class BJ02290 {

    public static int s;
    public static String[][] ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();

        char[] num = sc.next().toCharArray();
        ans = new String[2*s+3][(s+3)*num.length];
        fill(ans);

        for (int j = 0; j < num.length; j++) number(num[j], j);

        print(ans);
    }

    public static void hor1(int j) {
        for (int i = 1; i < s+1; i++) ans[0][j*(s+3)+i] = "-";
    }

    public static void hor2(int j) {
        for (int i = 1; i < s+1; i++) ans[s+1][j*(s+3)+i] = "-";
    }

    public static void hor3(int j) {
        for (int i = 1; i < s+1; i++) ans[2*s+2][j*(s+3)+i] = "-";
    }

    public static void ver1(int j) {
        for (int i = 1; i < s+1; i++) ans[i][j*(s+3)] = "|";
    }

    public static void ver2(int j) {
        for (int i = 1; i < s+1; i++)  ans[i][j*(s+3)+s+1] = "|";
    }

    public static void ver3(int j) {
        for (int i = s+2; i < s*2+2; i++) ans[i][j*(s+3)] = "|";
    }

    public static void ver4(int j) {
        for (int i = s+2; i < s*2+2; i++) ans[i][j*(s+3)+s+1] = "|";
    }

    public static void number(char n, int j) {
        switch (n - '0') {
            case 0:
                hor1(j);
                hor3(j);
                ver1(j);
                ver2(j);
                ver3(j);
                ver4(j);
                break;
            case 1:
                ver2(j);
                ver4(j);
                break;
            case 2:
                hor1(j);
                hor2(j);
                hor3(j);
                ver2(j);
                ver3(j);
                break;
            case 3:
                hor1(j);
                hor2(j);
                hor3(j);
                ver2(j);
                ver4(j);
                break;
            case 4:
                hor2(j);
                ver1(j);
                ver2(j);
                ver4(j);
                break;
            case 5:
                hor1(j);
                hor2(j);
                hor3(j);
                ver1(j);
                ver4(j);
                break;
            case 6:
                hor1(j);
                hor2(j);
                hor3(j);
                ver1(j);
                ver3(j);
                ver4(j);
                break;
            case 7:
                hor1(j);
                ver2(j);
                ver4(j);
                break;
            case 8:
                hor1(j);
                hor2(j);
                hor3(j);
                ver1(j);
                ver2(j);
                ver3(j);
                ver4(j);
                break;
            case 9:
                hor1(j);
                hor2(j);
                hor3(j);
                ver1(j);
                ver2(j);
                ver4(j);
                break;
       }
    }

    public static void print(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length-1; j++) System.out.print(arr[i][j]);
            System.out.println();
        }
    }

    public static void fill(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) arr[i][j]=" ";
        }
    }
}
