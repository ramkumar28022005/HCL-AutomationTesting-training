import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        List<String> list = new ArrayList<>();

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            list.add(sc.next());
        }

        HashMap<String, Integer> map = new HashMap<>();

        for(String element : list){
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        System.out.println("Element repetitions:");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}