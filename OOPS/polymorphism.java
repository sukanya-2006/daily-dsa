public class polymorphism {
    public static void main(String args[]){

        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1,2));
        // System.out.println(calc.sum((float)1.5 ,(float) 2.5));
        // System.out.println(calc.sum(2,3,4));


        Deer d = new Deer();  //if we call the child class object then it will only call the child class 
        d.eat();
        Animal a = new Animal();
        a.eat();

        
    }
}

//method overridding - functions with the same name but different defination

class Animal{

    void eat(){
        System.out.println("eats anything ");
    }
}

class Deer {
    void eat(){
        System.out.println("eats grass");
    }
}





//method overloading  - functions have the same name but has different parameters - the parameters that can be different is either the type or the count
class Calculator{
     int sum(int a, int b){
        return a + b;
     }

     float sum(float a, float b){
         return a + b;
     }

     int sum ( int a, int b, int c){
        return a+b+c;
     }
}