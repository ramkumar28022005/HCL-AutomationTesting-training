import java.util.Scanner;

class Add {
    int add(int a, int b) {
        return a + b;
    }
}

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Add obj = new Add();  
        int result = obj.add(a, b); 

        System.out.println(result);
    }
}