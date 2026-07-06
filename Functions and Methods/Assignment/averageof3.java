import java.util.*;

public class averageof3 {
    public static void calculateAverage(int a, int b, int c){
        int average = (a + b + c)/3;
        System.out.println("Average of three numbers is " +  average);

        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        calculateAverage(a, b, c);

        sc.close();
    }
}
