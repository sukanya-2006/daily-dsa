import java.util.Scanner;

public class invertedhalfpyramid {
       public static void rotatedhalfpyramid(int total_rows, int total_columns){
             for(int i = 1; i<=total_rows; i++){
             for(int j = 1; j<=total_columns; j++){ 
                if(j <= total_rows - i){
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
        System.out.println("Enter the numbers of rows: ");
        int total_rows = sc.nextInt();
         System.out.println("Enter the numbers of columns: ");
        int total_columns = sc.nextInt();
        rotatedhalfpyramid(total_rows, total_columns);
    }
}
