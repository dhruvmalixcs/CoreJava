public class StringCompression {
    public static void main(String[] args) {
        String str = "aaaabbbbbbbccddddde";
        int count =1;
        String ans = ""+str.charAt(0);

        for (int i = 0; i < str.length()-1; i++) {
            char prev=str.charAt(i);
            char curr=str.charAt(i+1);
            if(curr==prev)
            {
                count++;
            }
            else
            {
                if(count>1)ans+=count;
                count=1;
                ans+=curr;
            }
        }
        if(count>1)ans+=count;
        System.out.println(ans);
    }
}
