import com.sun.security.jgss.GSSUtil;

public class Test {
    public static void main(String[] args) {
        Person student1 = new Student (1, "A1");
        student1.setName("Ankit");
        student1.setAddress("Noida");


        Student student2 = new Student (2, "A2");
        student2.setName("student2");
        student2.setAddress("Delhi");
        student2.show();


        ChildStudent childStudent = new ChildStudent(3,"B1");
        childStudent.myChildDetails(10);

        Student childStudent1 = new ChildStudent(13,"B1");
        childStudent1.show();








        Person teacher1 = new Teacher(101, "Science");
        Person teacher2 = new Teacher(102, "Math");
        Person teacher3 = new Teacher(103, "Eco");


    }
}
