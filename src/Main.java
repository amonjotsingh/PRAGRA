import java.util.Locale;

public class Main {

    public static boolean isPalindrome(String str) {
        char arr[] = str.toCharArray();
        char[] reverseArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            reverseArr[str.length() - i - 1] = arr[i];
        }
        String reverse = String.copyValueOf(reverseArr);
        if (reverse.equals(str)) return true;
        return false;
    }


    public static void main(String[] args) {
        String s = "heeheeh";
        Integer i = 5;

    }
}