import java.util.Scanner;

public class primeinrange {

     public static boolean  isPrime(int n){
        boolean isPrime = true;
        if (n<=1) {
            isPrime = false;
        }
        for (int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }


        return isPrime;
    }

    public static void primesinrange(int n){
        for(int i =2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
            
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your range:");
        int n = sc.nextInt();
        primesinrange(n);
    }
}
