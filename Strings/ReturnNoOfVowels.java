// Q2. Write a program that takes a string input and returns the number of vowels in the string. The program
// should handle exceptions that may occur during input or processing.
// Input format:
// A single string input.
// Output format:
// An integer representing the number of vowels in the input string.
// Sample Input 1:
// "Hello, World!"
// Sample Output 1:
// 3
// Sample Input 2:
// "bcd"
// Sample Output 2:
// 0
import java.util.*;
public class ReturnNoOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowels = 0;
        for (char x : s.toCharArray()) {
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
            {
                vowels++;
            }
        }
        System.out.println(vowels);

    }
}
