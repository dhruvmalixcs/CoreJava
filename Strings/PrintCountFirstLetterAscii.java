
// Write a program to print the count of words and print the first letter of every word as well as
// their corresponding ASCII values in a user input string separated by space.
// Note : Assume there is a single space between two words and there are no extra spaces before
// and after words.
// Input format:
// First line of the input contains the user input string.
// Output format:
// On a single line of output print the count of word <space> first letter of each word with their
// corresponding ASCII values(space separated).
// Constraints :
// 0 <= |S| <= 10^7
// where |S| represents the length of string, S.
// Sample Input:
// Hello My a
// Sample Output:
// 3 H72 M77 a97
// Sample Input:
// Who are you m friend?
// Sample Output:
// 5 W87 a97 y121 m109 f102
import java.util.*;
public class PrintCountFirstLetterAscii{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] sarr=s.split(" ");
        System.out.print(sarr.length+" ");
        for(int i=0;i<sarr.length;i++){
            char x = sarr[i].charAt(0);
            System.out.print(x+""+(int)x+" ");
        }

}
}