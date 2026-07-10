import java.util.*;

public class diammondpattern {
    public static void diammond(int n){
        //1st half
            for(int i = 1; i<=n; i++){
                

                for(int j=1; j<=n-i; j++){
                 System.out.print(" ");
                }
                //stars  (2 * i - 1)
                
                  for(int j=1; j<=(2 * i - 1); j++){
                    System.out.print("*");
                }


                


                System.out.println();

            

             
            }


            //2nd half
            for(int i=n; i>=1; i--){

                  for(int j=1; j<=n-i; j++){
                 System.out.print(" ");
                }

                  for(int j=1; j<=(2 * i - 1); j++){
                    System.out.print("*");
                }


                


                

                System.out.println();
            }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        diammond(n);
    }
}
