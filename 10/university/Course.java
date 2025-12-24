package university;

public class Course {
    private String _name;
    private int _id;
    private float _hours;
    private Lecturer _lecturer;
    public Lecturer _unnamed_Lecturer_;

    public Course(String aName, int aId, float aHours) {
        this._name = aName;
        this._id = aId;
        this._hours = aHours;
    }

    public void setName(String aName) {
        this._name = aName;
    }

    public String getName() {
        return this._name;
    }

    public void setId(int aId) {
        this._id = aId;
    }

    public int getId() {
        return this._id;
    }

    public void setHours(float aHours) {
        this._hours = aHours;
    }

    public float getHours() {
        return this._hours;
    }

    public void setLecturer(Lecturer aLecturer) {
        this._lecturer = aLecturer;
        this._unnamed_Lecturer_ = aLecturer;
    }

    public Lecturer getLecturer() {
        return this._lecturer;
    }

    public void displayCourseInfo() {
        System.out.println("КУрс: " + _name + " (ID: " + _id + ", часов: " + _hours + ")");
        if (_lecturer != null) {
            System.out.println("  Преподает: " + _lecturer.getName());
        }
    }
}