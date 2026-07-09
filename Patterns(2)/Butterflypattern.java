import java.util.Scanner;



public class Butterflypattern {
    public static void patternButterfly(int n){
            for(int i = 1; i<=n; i++ ){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
                if( j <= n -  i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

             
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        patternButterfly(n);

    }
}
