public class Student implements Person{

    private int _rollNo;
    private String _className;
    String myName;
    String myAdd;

    public Student(int rollNo, String className) {
        this._rollNo = rollNo;
        this._className = className;
    }

    @Override
    public String getName() {
        return myName;
    }

    @Override
    public String getAddress() {
        return myAdd;
    }

    @Override
    public void setName(String name) {
        this.myName = name;
    }

    @Override
    public void setAddress(String address) {
        this.myAdd=address;
    }

    public void show() {
        System.out.println("Student[" +
                " Name= " + myName +
                " Address= " + myAdd +
                " rollNo= " + _rollNo +
                " className= " + _className +
                "]");
    }


}
