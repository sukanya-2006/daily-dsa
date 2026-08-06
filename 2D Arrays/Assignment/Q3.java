public class Q3 {
    public static void transposematrix(int matrix[][]){
    //   int transpose[j][i] = new int [3][2];
     int n = matrix.length;
     int m = matrix[0].length;
     int transpose[][] = new int[m][n];
     for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            transpose[j][i] = matrix[i][j];
        }
     }

     for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {

        int matrix[][] = {{1,2,3},
                           {4,5,6}};
        transposematrix(matrix);
    }
}
