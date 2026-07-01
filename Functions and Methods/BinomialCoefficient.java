import java.util.Scanner;

public class BinomialCoefficient {
    
    public static int calculatefactorial(int number){
       int factorial = 1;
       for(int i = 1; i<=number; i++){
        factorial= factorial*i;
       }
       return factorial;

    }

    public static int calculateBC(int n, int r){

       int nfact = calculatefactorial(n);
       int rfact= calculatefactorial(r);
       int sub = n-r;
       int subfact = calculatefactorial(sub);

       int BinomialCoefficient;
       BinomialCoefficient = nfact/(rfact*subfact);

       return BinomialCoefficient;
       

    }


    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
         int n = sc.nextInt();
        System.out.print("Enter r:");
        int r = sc.nextInt();
        int BinomialCoefficient = calculateBC(n, r);

        System.out.println("The BC is" + BinomialCoefficient);
        
    }
    
}
