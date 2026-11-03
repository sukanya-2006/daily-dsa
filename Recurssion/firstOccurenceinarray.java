public class firstOccurenceinarray {
    public static int firstOccurence(int arr[], int key, int i){
         if(i == arr.length){
            return -1;
         }

         if(arr[i] == key){
            return i;
         }

         return firstOccurence(arr, key, i+1);
    }

    public static void main(String args[]){
        int arr[] = {8,4,3,2,4,2,4,22,1};
        System.out.println(firstOccurence(arr, 4, 2));
    }
}
