class Student {
    private String name;
    private int age;

    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class encapsulation{
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Ram");
        s.setAge(21); 

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}