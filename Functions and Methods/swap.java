import java.util.*;

public class swap {


    public static void swapvalues( int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 5;
        swapvalues(a,b);
       

    }
    
}
