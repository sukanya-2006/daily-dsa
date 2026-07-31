
public class diagonalsum {
    public static int diagonalsumfind(int matrix[][]){
         int sum = 0;
        //  int PD = 0;
        //  int SD = 0;
         

        //Time complexity O(n^2)
        //  for (int i=0; i<=matrix.length; i++){
        //     for(int j=0; j<=matrix[0].length; j++){
        //         if(i==j){
        //           sum += matrix[i][j];
        //         }

        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        //  }

        //Time Complexity - O(n)
        for(int i = 0; i<= matrix.length-1; i++){
             //pd
             sum += matrix[i][i];

             //sd
             if(i != matrix.length -1 -i){
                sum += matrix[i][matrix.length -1 -i];
             }
        }
        return sum;
    }
    public static void main(String args[]){
        // int matrix [][] = {{1,2,3,4}, 
        //                    {5,6,7,8},
        //                     {9,10,11,12},
        //                     {13, 14, 15, 16}};

        int matrix [][] = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        System.out.println(diagonalsumfind(matrix));
    }
}
