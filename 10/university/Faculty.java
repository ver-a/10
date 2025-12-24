package university;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String _name;
    public Employee _dean;
    private List<Institute> _institutes;
    public University _unnamed_University_;

    public Faculty(String aName) {
        this._name = aName;
        this._institutes = new ArrayList<>();
    }

    public List<Institute> getInstitutes() {
        return _institutes;
    }

    public void addInstitute(Institute aInstitute) {
        _institutes.add(aInstitute);
        aInstitute.setFaculty(this);
        System.out.println("Institute " + aInstitute.getName() + " added to faculty " + _name);
    }

    public void setName(String aName) {
        this._name = aName;
    }

    public String getName() {
        return this._name;
    }

    public void setDean(Employee aDean) {
        this._dean = aDean;
        this._dean._unnamed_Faculty_ = this;
        if (aDean instanceof Dean) {
            ((Dean) aDean).setFaculty(this);
        }
        System.out.println(aDean.getName() + " appointed as dean of " + _name);
    }

    public Employee getDean() {
        return this._dean;
    }

    public void setUniversity(University university) {
        this._unnamed_University_ = university;
    }

    public void displayFacultyInfo() {
        System.out.println("\n=== Faculty Information ===");
        System.out.println("Name: " + _name);
        if (_dean != null) {
            System.out.println("Dean: " + _dean.getName());
        }
        System.out.println("Institutes (" + _institutes.size() + "):");
        for (Institute institute : _institutes) {
            System.out.println("  - " + institute.getName() + " at " + institute.getAddress());
        }
    }
}