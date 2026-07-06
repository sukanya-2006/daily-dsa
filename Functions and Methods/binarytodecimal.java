import java.util.*;

public class binarytodecimal {
    public static void binarydecimal(int n){
      int binary = n;
      int decimal = 0;
      int power = 0;
      
      while(binary>0){

     int lastdigit = binary % 10;

      decimal += lastdigit * (int)Math.pow(2, power);
      power++;
      binary = binary/10;
      }

      System.out.println("Decimal = " + decimal);
      



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int n = sc.nextInt();
        binarydecimal(n);
    }
}


