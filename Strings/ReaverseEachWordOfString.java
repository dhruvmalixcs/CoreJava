import java.util.Scanner;

// Write a Java program to reverse each word of a string individually.
// Input Format :
// String S
// Output Format :
// Modified reversed string
// Constraints :
// 0 <= |S| <= 10^7
// where |S| represents the length of string, S.
// Sample Input 1:
// Welcome to Chitkara
// Sample Output 1:
// emocleW ot araktihC
// Sample Input 2:
// Give proper names to Class
// Sample Output 2:
// eviG reporp seman ot ssalC
public class ReaverseEachWordOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strarr=str.split(" ");
        
        for (int i = 0; i < strarr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strarr[i]);
            System.out.print(sb.reverse().toString()+" ");
            
        }
        
    }
}
