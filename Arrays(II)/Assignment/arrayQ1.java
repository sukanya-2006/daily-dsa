
public class arrayQ1 {
    public static boolean  containsduplicate(int[] nums){
        for(int i = 0; i< nums.length; i++){
            for(int j = i + 1; j< nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,4,5,4,6,3};
        System.out.println(containsduplicate(nums));
    }
}
