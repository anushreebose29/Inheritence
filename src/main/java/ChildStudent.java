public class ChildStudent extends Student{

    public ChildStudent(int rollNo, String className) {
        super(rollNo, className);
    }

    int teeth;
    public void myChildDetails(int teethO){
        this.teeth = teethO;
       // this.show();
        System.out.println("I am a ChildStudent");
        System.out.println("My teeth count is: " + teeth);

    }
}
