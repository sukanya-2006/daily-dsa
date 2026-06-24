import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = pencil+pen+eraser ;
        float gst = bill*0.18f;
        float totalamount = bill + gst;
        System.out.println(totalamount);
    }
    
}
