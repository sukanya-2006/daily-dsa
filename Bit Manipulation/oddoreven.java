

public class oddoreven {
   public static void OddOREven(int n){
       int bitmask = 1;
       if( (n & bitmask) == 0){
           System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
   }

   
   public static void main( String args[]){
     OddOREven(3);
   } 
}
