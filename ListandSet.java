import java.util.*;
public class ListandSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Float> temp=new ArrayList<>();
        System.out.println("Enter number of days:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter temperature for day "+(i+1)+":");
            float t=sc.nextFloat();
            temp.add(t);
        }
        System.out.println("Temperatures entered: " + temp);
        
        Set<Float> uniqueTemp = new HashSet<>(temp);
        System.out.println("Unique temperatures: " + uniqueTemp);
        
        sc.close();

    }
}
