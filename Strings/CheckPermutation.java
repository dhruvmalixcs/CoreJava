// Q1. Write a function to check whether two given strings are Permutation of each other or not.
// A Permutation of a string is another string that contains same characters, only the order of
// characters can be different.
// For example, “abcd” and “dabc” are Permutation of each other.
// Input format:
// Accept two strings
// Output format:
// 1 if the strings are permutations of each other. 0 if the strings are not permutation of each
// other. As specified in sample Ouput
// Test Cases:
// Input Output
// abc bca 1: abc and bca are permutable
// raw was 0: raw and was are not permutable
import java.util.*;
public class CheckPermutation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.length() != s2.length())
        {
            System.out.println("0");
        }
        else
        {
            char[] c1=s1.toCharArray();
            char[] c2=s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1,c2))
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
            
        }

    }
}
