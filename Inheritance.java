class vehicle{
    void start(){
        System.out.println("vehicle starts");
    }
}

class Bike extends vehicle{
    void ride() {
        System.out.println("Bike is riding");
    }
}

class SportsBike extends Bike {
    void speed() {
        System.out.println("SportsBike is very fast");
    }
}

class Car extends vehicle{
    void drive() {
        System.out.println("Car is driving");
    }
}


public class Inheritance {
    public static void main(String[]args){
        Bike b = new Bike();
        b.start();
        b.ride();

         System.out.println("-----");

        SportsBike sb = new SportsBike();
        sb.start();   
        sb.ride();    
        sb.speed();   

        System.out.println("-----");

        Car c = new Car();
        c.start();  
        c.drive();   
    }
    
}
