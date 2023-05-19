import java.util.*;

public class NoOfPalindromeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                String strtemp = str.substring(i, j);
                StringBuilder strx = new StringBuilder(strtemp).reverse();
                String strtempr = strx.toString();

                if (strtemp.equals(strtempr)&&strtemp.length()>=1) {
                    count++;
                    System.out.println(strtemp + " ");
                }
            }
        }
        System.out.println("\n" + count);
    }
}
