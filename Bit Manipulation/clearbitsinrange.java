public class clearbitsinrange {


    public static int Clearbitsinrange(int n, int i, int j){
         int a = (~0<<(j+1));
         int b = ((1<<i) - 1);
         int bitmask = a | b;
         return n & bitmask;
    }
    public static void main(String args[]){
    System.out.println(Clearbitsinrange(45,1,3 ));
    }
}
