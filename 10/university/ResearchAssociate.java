package university;

import java.util.ArrayList;
import java.util.List;

public class ResearchAssociate extends Employee {
    private String _fieldOfStudy;
    private List<Institute> _institutes;
    private List<Participation> _participations;

    public ResearchAssociate(int aSsNo, String aName, String aEmail, String aFieldOfStudy) {
        super(aSsNo, aName, aEmail);
        this._fieldOfStudy = aFieldOfStudy;
        this._institutes = new ArrayList<>();
        this._participations = new ArrayList<>();
        System.out.println("Research Associate created: " + aName + " (Field: " + aFieldOfStudy + ")");
    }

    public List<Institute> getInstitutes() {
        return _institutes;
    }

    public void addInstitute(Institute aInstitute) {
        _institutes.add(aInstitute);
    }

    public List<Participation> getParticipations() {
        return _participations;
    }

    public void addParticipation(Participation aParticipation) {
        _participations.add(aParticipation);
    }

    public void setFieldOfStudy(String aFieldOfStudy) {
        this._fieldOfStudy = aFieldOfStudy;
    }

    public String getFieldOfStudy() {
        return this._fieldOfStudy;
    }

    public void conductResearch() {
        System.out.println(getName() + " is conducting research in " + _fieldOfStudy);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Field of Study: " + _fieldOfStudy);
        System.out.println("  Institutes: " + _institutes.size());
        System.out.println("  Projects: " + _participations.size());
    }
}