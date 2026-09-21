public class inheritance {
    public static void main(String args[]){
        // Fish shark = new Fish();  // new objects that are being created for the derived class
        // shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.walk();


    }
}


//Base class
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}


//Derived Class
// class Fish extends Animal{
//     int fins;

//     void swims(){
//             System.out.println("swims in water");
//     }

// }



//Hierarchial Inheritance
class Mammal extends Animal{
     void walk(){
        System.out.println("walks");
    }

}

class Fish extends Animal{
     void swim(){
        System.out.println("swims");
    }

}

class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}





//multi-level inheritance
// class Mammal extends Animal{
//     int legs;
// }


class Dog extends Mammal {
    String breed;
}