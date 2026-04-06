import java.util.Scanner;
public class OnlineShopping{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double price=sc.nextInt();
        double a=0;
        if(price>5000){
            a=price*0.20;
            System.out.println("Price :"+a);
        }
        else if(2000<price){
            a=price*0.10;
            System.out.println("Price :"+a);
        }
        else{
            System.out.println("No Discount");
        }
    }
}