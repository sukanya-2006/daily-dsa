import java.util.*;

public class factorial {


    public static int calculatefactorial(int number){
       int factorial = 1;
       for(int i = 1; i<=number; i++){
        factorial= factorial*i;
       }
       return factorial;

    }


    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        int factorial = calculatefactorial(number);

        System.out.println("factorial of " + number + " is " + factorial);

    }
}
