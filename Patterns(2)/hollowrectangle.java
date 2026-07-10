import java.util.*;

public class hollowrectangle {

    public static void patternHollowRec(int total_rows, int total_columns){
            for(int i = 1; i<=total_rows; i++){

            
                for(int j = 1; j<=total_columns; j++){
                 if( i==1 || i == total_rows || j==1 || j==total_columns){
                     System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
       

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns: ");
        int total_rows = sc.nextInt();
        int total_columns = sc.nextInt();
        patternHollowRec(total_rows, total_columns);
    }


}
 