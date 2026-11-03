public class tilesproblem {
    public static int tiles(int n){  // n is the length of the floor


        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1 = tiles(n-1);

        //horizontal choice
        int fnm2 = tiles(n-2);

        int totalways = fnm1 + fnm2;
        return totalways;

    }

    public static void main(String args[]){
        int n = 5;
        System.out.println(tiles(n));

    }
}
