
public class searchinsortedarray2 {
    public static boolean staircasesearch(int matrix[][], int key){
         int n = matrix.length;
         int m = matrix[0].length;


         int i = n-1;
         int j = 0;
        
        
            while(i>=0 && j<m)  {

                if (matrix[i][j] == key) {
                System.out.println("Key found at (" + i + ", " + j + ")");
                return true;
            }
                else if(key <matrix[i][j]){
                     i--;
                }
                else if(key > matrix[i][j]){
                    j++;
                }
            }
             System.out.println("Key not found");
             return false;
         }
    
    
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                            {32,33,39,50}};
        int key = 29;
       staircasesearch(matrix, key);

    }
}
