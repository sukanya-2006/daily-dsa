import java.util.*;

public class smallestinmatrix {
    public static void largestelements(int matrix[][]){
        int smallest = matrix[0][0];

        for (int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
               if(matrix[i][j]< smallest){
                smallest = matrix[i][j];
               }
            }
        }
        System.out.println("smallest element = " + smallest);
    }

    public static void main(String[] args) {
        int matrix[][] = new int [3][4];
        int n = matrix.length;  //length of rows
        int m = matrix[0].length;  //length of columns
        
        //input
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for(int j = 0 ; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

       //output
        for(int i = 0; i<n; i++){
            for(int j = 0 ; j<m; j++){  // next line because after 1,2,3 it already creates 3 columns
             System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
        largestelements(matrix);
    }
    
}

