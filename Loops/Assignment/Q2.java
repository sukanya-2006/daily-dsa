import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers?");
        int n = sc.nextInt();

        System.out.println("Enter "+ n + " numbers:");
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i<=n; i++) {
            int number = sc.nextInt();
             if (number % 2 == 0) {
                evenSum = evenSum + number;  // even
            } else {
                oddSum = oddSum + number;    // odd
            }

            
        }
       System.out.println("Sum of even numbers is " + evenSum);
        System.out.println("Sum of odd numbers is " + oddSum);
    }
}
