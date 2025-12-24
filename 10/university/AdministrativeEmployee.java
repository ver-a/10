package university;

public class AdministrativeEmployee extends Employee {

    public AdministrativeEmployee(int aSsNo, String aName, String aEmail) {
        super(aSsNo, aName, aEmail);
        System.out.println("Administrative employee created: " + aName);
    }

    public void processPaperwork() {
        System.out.println(getName() + " is processing administrative paperwork.");
    }
}