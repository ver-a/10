package university;

public abstract class Employee {
    private int _ssNo;
    private String _name;
    private String _email;
    private int _counter;
    public Faculty _unnamed_Faculty_;

    public Employee(int aSsNo, String aName, String aEmail) {
        this._ssNo = aSsNo;
        this._name = aName;
        this._email = aEmail;
        this._counter = 0;
    }

    public void setSsNo(int aSsNo) {
        this._ssNo = aSsNo;
    }

    public int getSsNo() {
        return this._ssNo;
    }

    public void setName(String aName) {
        this._name = aName;
    }

    public String getName() {
        return this._name;
    }

    public void setEmail(String aEmail) {
        this._email = aEmail;
    }

    public String getEmail() {
        return this._email;
    }

    public void setCounter(int aCounter) {
        this._counter = aCounter;
    }

    public int getCounter() {
        return this._counter;
    }

    public void displayInfo() {
        System.out.println("Employee: " + _name);
        System.out.println("  SSN: " + _ssNo);
        System.out.println("  Email: " + _email);
        System.out.println("  Type: " + this.getClass().getSimpleName());
    }

    public void incrementCounter() {
        _counter++;
        System.out.println(_name + "'s counter incremented to: " + _counter);
    }
}