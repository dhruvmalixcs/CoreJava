//DhrUv MalIk ---> dHRuV mALiK
import java.util.*;
public class ToggleCase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder str = new StringBuilder(sc.nextLine());
            for (int i = 0; i < str.length(); i++)
            {
                boolean flag = true;
                char c = str.charAt(i);
                int ascii = (int)c;
                if(c==' ')
                {
                    continue;
                }
                if(ascii>=97)
                {
                    flag=false;
                }
                if(flag==false)
                {
                    ascii-=32;
                    char x = (char)ascii;
                    str.setCharAt(i,x);
                }
                else
                {
                    ascii+=32;
                    char x = (char)ascii;
                    str.setCharAt(i,x);
                }

            }
            System.out.println(str);
        }
    }
}
