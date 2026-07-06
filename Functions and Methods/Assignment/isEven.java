import java.util.*;

public class isEven {

    public static boolean isEvenFunction(int n) {
    if (n % 2 == 0) {
        return true;
    } else {
        return false;
    }
}
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isEvenFunction(n)) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }

        sc.close();
    }
}