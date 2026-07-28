
public class bubblesort {
    public static void bubbleSortSolve(int arr[]){
         for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    }
            }
         }
    }
    public static void printarr(int arr[]){
       for(int i=0;i<arr.length; i++){
         System.err.print(arr[i]+ " ");
       }
       System.err.println();
    }
    public static void main(String args[]){
       int arr[] = {5,4,1,3,2};
       bubbleSortSolve(arr);
       printarr(arr);
    }
}
