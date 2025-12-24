package university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String _name;
    private int _numberOfEmployees;
    public List<Faculty> _faculties;

    public University(String aName) {
        this._name = aName;
        this._faculties = new ArrayList<>();
        this._numberOfEmployees = 0;
        System.out.println("University created: " + aName);
    }

    public List<Faculty> getFaculties() {
        return _faculties;
    }

    public void addFaculty(Faculty aFaculty) {
        _faculties.add(aFaculty);
        aFaculty.setUniversity(this);
        System.out.println("Faculty " + aFaculty.getName() + " added to university " + _name);
    }

    public void setName(String aName) {
        this._name = aName;
    }

    public String getName() {
        return this._name;
    }

    public void setNumberOfEmployees(int aNumberOfEmployees) {
        this._numberOfEmployees = aNumberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return this._numberOfEmployees;
    }

    public void calculateTotalEmployees() {
        _numberOfEmployees = 0;
        for (Faculty faculty : _faculties) {
            // This would need proper implementation to count employees
            _numberOfEmployees += 10; // Placeholder
        }
    }

    public void displayUniversityInfo() {
        System.out.println("\n=== UNIVERSITY INFORMATION ===");
        System.out.println("University: " + _name);
        System.out.println("Total Employees: " + _numberOfEmployees);
        System.out.println("Faculties (" + _faculties.size() + "):");
        for (Faculty faculty : _faculties) {
            System.out.println("  - " + faculty.getName());
        }
    }
}