import java.util.*;

public class palindrome {

    public static boolean palindromecheck(int n){
          
          int original = n;
          int reverse = 0;

        while(n>0){
            
             int lastdigit = n%10;
            reverse = (reverse*10) + lastdigit;
            n = n/10;
        }

        if (reverse == original) {
            return true;
        } else {
            return false;
        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

         if (palindromecheck(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
