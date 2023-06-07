// Q2: You are given provided with a string S and you have to take all even-indexed characters and
// odd-indexed characters from a string and concatenates them together.
// Input Format
// The first line of the input contains the string S.
// Output format
// Print the string after merging.
// Constraints
// 1 <= S <=1000
// Time Limit
// 1 second
// Sample Input
// abcdefg
// Sample Output
// acegbdf
import java.util.*;
public class OddEvenStringConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        char[] c1 = s.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if(i%2==0)
            {
                sb.append(c1[i]);
            }
        }
        for(int i=0;i<c1.length;i++)
        {
            if(i%2!=0){
                sb.append(c1[i]);
            }
        }
        System.out.println(sb);



    }
}
