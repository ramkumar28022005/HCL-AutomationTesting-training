class calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class Overloading {
    public static void main(String[] args) {
        calculator obj=new calculator();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
    }
}
