import java.util.Scanner;

public class decimaltobinary {

    public static void decimalToBinary(int n) {

    int decimal = n;
    int binary = 0;

    // Build the binary number in reverse
    while (decimal > 0) {
        int rem = decimal % 2;
        binary = binary * 10 + rem;
        decimal = decimal / 2;
    }

    // Reverse it
    int reversed = 0;

    while (binary > 0) {
        int lastDigit = binary % 10;
        reversed = reversed * 10 + lastDigit; //first digit of the reveresed number
        binary = binary / 10;  //remove last digit
    }

    System.out.println(reversed);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n = sc.nextInt();
        decimalToBinary(n);

    }
}
