package university;

public class Dean extends Employee {

    private Faculty faculty;

    public Dean(int aSsNo, String aName, String aEmail) {
        super(aSsNo, aName, aEmail);
        System.out.println("Dean created: " + aName);
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void approveBudget() {
        System.out.println("Dean " + getName() + " approved the faculty budget.");
    }

    public void manageFaculty() {
        if (faculty != null) {
            System.out.println("Dean " + getName() + " is managing " + faculty.getName() + " faculty.");
        }
    }
}