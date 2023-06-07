// Q1. Given a string S, find length of the longest substring with all distinct characters.
// Input format:
// Input will consist of string.
// Output format:
// The output will be a single integer denoting the length of the longest substring.
// Sample Input:
// Chitkara
// Sample Output:
// 7
// Sample Input:
// acfagg
// Sample Output:
// 4 
import java.net.SocketTimeoutException;
import java.util.*;
public class LongestSubstring
{
    public static void main(String[] args) {
        // String s="";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Set<Character> set = new HashSet<>();
        for (char x : s.toCharArray()) {
            set.add(x);
        }
        StringBuilder sb = new StringBuilder();
        for (char x : set) {
            sb.append(x);
        }
        // sb.toString();
        System.out.println(sb);
        int n = sb.length();
        System.out.println(n);
    }    
}