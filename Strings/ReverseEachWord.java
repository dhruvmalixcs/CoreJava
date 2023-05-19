public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "hello world";
        String[] strarr=str.split(" ");
        for (int i = 0; i < strarr.length; i++) {
            StringBuilder newString = new StringBuilder();
            for (int j = strarr[i].length()-1; j>=0; j--) {
                newString.append(strarr[i].charAt(j));
            }
            strarr[i]=newString.toString();
        }
        String ans=String.join(" ",strarr);
        System.out.println(ans);
    }
}
