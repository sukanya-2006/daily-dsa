import java.util.*;

public class reversegivennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;
       

        while(number > 0){
            int lastdigit = number%10;
           
            // System.out.print(lastdigit + " ");
            
            

            number = number/10;
            reverse = (reverse*10) + lastdigit;
            
             
            

            
        }
        System.out.println(reverse);
        // System.out.println("");

    }
}
