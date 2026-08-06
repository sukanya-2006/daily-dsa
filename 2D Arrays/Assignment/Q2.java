public class Q2 {

    public static void sumofsecondrow(int nums[][]){
        int n = nums.length;
        int m = nums[0].length;
        int sum = 0;
        for(int i =1; i<n-1; i++){
            for(int j =0; j<m; j++){
               sum += nums[i][j];
              
            }
            System.out.println("the sum of second row is " + sum);
        }

    }
    public static void main(String[] args) {
        int nums[][] = {{1,4,9},
                        {11,4,3},
                        {2,2,3}};
        sumofsecondrow(nums);
    }
}
