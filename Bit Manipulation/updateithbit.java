public class updateithbit {
    


    


    

    public static int setIthbit(int n , int i){
      int bitmask = 1<<i;
      return n|bitmask;
    }
     public static int Clearithbit(int n, int i){
     int bitmask = ~(1<<i);
     return n & bitmask;
    }

    public static int Updateithbit(int n, int i, int newbit){
    //   if(newbit == 0){
    //      return Clearithbit(n,i);
    //   } else {
    //     return setIthbit(n,i);
    //   }
    n = Clearithbit(n,i);
    int bitmask = newbit << i;
    return n | bitmask;
    }
    public static void main(String args[]){
      System.out.println(Updateithbit(8,1,0));
    }

    

}
