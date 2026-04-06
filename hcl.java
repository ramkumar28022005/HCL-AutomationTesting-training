import java.util.Scanner;
public class hcl{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float unit=sc.nextFloat();
        if(0<unit && unit<=100){
            System.out.println("0");
        }
        else if(101<=unit && unit<=200){
            System.out.println(unit*0.8);
        }
        else if(201<=unit && unit<=300){
            System.out.println(unit*1.5);
        }
        else if(301<=unit){
            System.out.println(unit*3);
        }
    }
}
