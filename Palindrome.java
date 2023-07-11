//Ways :
//1* reverse the string and check whether it's equal to the original string or not
//2* create a StringBuilder and start adding in that StringBuilder in reverse order and check if the value is same or not
//3* using start and end pointer

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "aabbcbbaa";
        String str2 = "quality";
        String str3 = "abccba";
        String str4 = "t";
        String str5 = "";
        String str6 = null;
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(isPalindrome(str4));
        System.out.println(isPalindrome(str5));
        System.out.println(isPalindrome(str6));
    }

    static boolean isPalindrome(String s){
        //ask the interviewer that whether null should be considered true or false.
        if (s==null) return true; //check for null otherwise it'll throw error
        s = s.toLowerCase(Locale.ROOT);
        int n = s.length();             //arr.length was a variable so there was no brackets but here length() is a function
        for (int i=0 ; i<n/2 ; i++){
            char start = s.charAt(i);
            char end = s.charAt(n-1-i);

            if (start !=end) return false;
        }
        return true;
    }
}

//time complexity : O(n)