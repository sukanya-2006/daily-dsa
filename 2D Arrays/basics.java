import java.util.*;

public class basics{

    public static boolean  search(int matrix[][], int key){

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0 ; j<matrix[0].length; j++){  // next line because after 1,2,3 it already creates 3 columns
             if(matrix[i][j] == key){
                System.out.println("founded at cell (" + i + "," + j + ")");
                return true;
               }
            }  
        }
        System.out.println("Not found");
        return false;
    }
    public static void main (String args[]){
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
        search(matrix, 5);
    }
}