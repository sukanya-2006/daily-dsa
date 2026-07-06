import java.util.*;

public class sumofdigits {
    public static void sumdigits(int n){
        int sum = 0;

        while(n>0){
            int lastdigit = n%10;
            sum = sum + lastdigit;
            n = n/10;
            
        }

        System.out.println("Sum of the digits: " + sum);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Any number: ");
        int n = sc.nextInt();
        sumdigits(n);
    }
}
