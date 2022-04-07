public class Teacher implements Person{
    private int _empID;
    private String _subject;
    String myName;
    String myAdd;

    public Teacher(int empID, String subject) {
        this._empID = empID;
        this._subject = subject;
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
        this.myAdd = address;
    }

    public void show() {
        System.out.println("Teacher[" +
                " Name= " + myName +
                " Address= " + myAdd +
                " empID= " + _empID +
                " subject= " + _subject +
                "]");
    }
}
