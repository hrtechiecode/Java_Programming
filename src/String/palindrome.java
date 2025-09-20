package String;

public class palindrome {
    static boolean ispalindrome(String s) {
        //two pointers
        int i = 0;
        int j = s.length() - 1;
        boolean flag = true;//palindrome
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                //  flag = false;
                //  break;
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(ispalindrome(s));
    }
}
