// Q2. Anagram is a word or phrase made by transposing the letters of another word or phrase
// The word "secure" is an anagram of "rescue."
// Write a program that takes two strings as input and checks if they are anagrams of each other. The program
// should handle exceptions that may occur during input or processing.
// Input format:
// Two strings separated by a space.
// Output format:
// "YES" if the strings are anagrams of each other, "NO" otherwise as shown in sample test case.
// Test Case 1 Test Case 2
// Input listen silent gram arm
// Output YES listen silent are anagram NO gram arm are not anagram
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.next();
        String s2 = sc.next();
        if(s1.length()!=s2.length())
        {
            System.out.println("no");
        }
        else
        {
            char[] c1=s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1,c2))
            {
                System.out.println("yes it anagram");
            }
            else
            {
                System.out.println("no");
            }

        }
    }
}
