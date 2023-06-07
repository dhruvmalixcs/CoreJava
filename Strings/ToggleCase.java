
// Problem Statement
// You are given provided with a string S and you have to reverse case i.e. all lower-cased characters
// should be upper-cased and all upper-cased character should be lower-cased.
// Input Format
// The first line of the input contains a string S.
// Output format
// Print a string after reversing the case.
import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strarr = str.split(" ");
        for (int i = 0; i < strarr.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < strarr[i].length(); j++)
            {
                char c = strarr[i].charAt(j);
                if (Character.isUpperCase(c)) {
                    sb.append(Character.toLowerCase(c));
                }
                else{
                    sb.append(Character.toUpperCase(c));
                }
            }
            strarr[i]=sb.toString();
        }
        String ans = String.join(" ",strarr);
        System.out.println(ans);

    }
}
