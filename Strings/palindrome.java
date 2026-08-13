
public class palindrome {
    public static boolean isPalindrome(String str){
      int n = str.length();
      for(int i = 0; i<n/2; i++){
         if(str.charAt(i) != str.charAt(n-1-i)){
             //not a palindrome
             return false;
         }
      }

      return true;
    }
    public static void main(String[] args) {
        String str = "Sukanya";
        System.out.println(isPalindrome(str));
    }
}
