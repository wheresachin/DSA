public class secnod {
    public static void main(String[] args) {
        Student s1  = new Student("sachin");
        System.out.println(s1.name);
    }
}
    class Student{
        String name;
        int rollno;

        Student(String name){
            this.name = name;
        }
    }

