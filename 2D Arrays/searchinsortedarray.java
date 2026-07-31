import java.util.Scanner;
public class searchinsortedarray {
    public static boolean staircasesearch(int matrix[][], int key){
         int n = matrix.length;
         int m = matrix[0].length;


         int i = 0;
         int j = m-1;
        
        
            while(i<n && j>=0)  {

                if (matrix[i][j] == key) {
                System.out.println("Key found at (" + i + ", " + j + ")");
                return true;
            }
                else if(key <matrix[i][j]){
                     j--;
                }
                else if(key > matrix[i][j]){
                    i++;
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
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

       staircasesearch(matrix, key);

    }
}
