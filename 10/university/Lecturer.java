package university;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends ResearchAssociate {
    public List<Course> _courses;

    public Lecturer(int aSsNo, String aName, String aEmail, String aFieldOfStudy) {
        super(aSsNo, aName, aEmail, aFieldOfStudy);
        this._courses = new ArrayList<>();
        System.out.println("Lecturer created: " + aName + " (Field: " + aFieldOfStudy + ")");
    }

    public List<Course> getCourses() {
        return _courses;
    }

    public void addCourse(Course aCourse) {
        _courses.add(aCourse);
        aCourse.setLecturer(this);
        System.out.println("Course " + aCourse.getName() + " assigned to lecturer " + getName());
    }

    public void teachCourse() {
        System.out.println("Lecturer " + getName() + " is teaching " + _courses.size() + " courses:");
        for (Course course : _courses) {
            System.out.println("  - " + course.getName());
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Courses taught: " + _courses.size());
    }
}