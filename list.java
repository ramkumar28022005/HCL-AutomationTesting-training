import java.util.*;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            students.add(name);

            System.out.print("Enter marks: ");
            int mark = sc.nextInt();
            sc.nextLine(); 
            marks.add(mark);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(students.get(i) + " - " + marks.get(i));
        }

        sc.close();
    }
}