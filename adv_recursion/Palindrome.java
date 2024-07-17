public class Palindrome {
  public static void main(String[] args) {
    for (String s : args) {
      if (palindromeCheck(s)) {
        System.out.println(s + " is a palindrome!");
      }
      else {
        System.out.println(s + " is NOT a palindrome!");
      }
    }
  }

  public static boolean palindromeCheck(String s) {
    if (s.length() == 0 || s.length() == 1) {
      return true;
    }

    int firstIndex = 0;
    int lastIndex = s.length() - 1;

    if (s.charAt(firstIndex) != s.charAt(lastIndex)) {
      return false;
    }
    else {
      return palindromeCheck(s.substring(firstIndex + 1, lastIndex));
    }
  }
}
