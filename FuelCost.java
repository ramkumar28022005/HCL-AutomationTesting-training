import java.util.Scanner;
public class FuelCost {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double d=sc.nextInt();
        double milage=sc.nextInt();
        double price=sc.nextInt();
        double l=d/milage;
        double totalcost=l*price;
        System.out.println(totalcost);
    }
    
}
