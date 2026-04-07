import java.util.Scanner;
abstract class vehicle{
    abstract void type();
        void twowheeler(){
            System.out.println("Bike");
        }
}
    class RE extends vehicle{
        void type(){
            System.out.println("Classic 350");
        }
    }
public class Abstraction {
    public static void main(String[] args) {
        vehicle v=new RE();
        v.type();
        v.twowheeler();
    }
}
