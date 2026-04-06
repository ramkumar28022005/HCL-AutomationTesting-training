import java.io.*;
import java.util.Scanner;
class DT{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        long l = i;
        double d = i;

        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Double: " + d);
    }
}