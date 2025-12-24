package university;

import java.util.ArrayList;
import java.util.List;

public class Institute {
    private String _name;
    private String _address;
    private List<ResearchAssociate> _researchAssociates;
    public Faculty _unnamed_Faculty_;

    public Institute(String aName, String aAddress) {
        this._name = aName;
        this._address = aAddress;
        this._researchAssociates = new ArrayList<>();
    }

    public List<ResearchAssociate> getResearchAssociates() {
        return _researchAssociates;
    }

    public void addResearchAssociate(ResearchAssociate aRa) {
        _researchAssociates.add(aRa);
        aRa.addInstitute(this);
        System.out.println("Research Associate " + aRa.getName() + " added to institute " + _name);
    }

    public void setName(String aName) {
        this._name = aName;
    }

    public String getName() {
        return this._name;
    }

    public void setAddress(String aAddress) {
        this._address = aAddress;
    }

    public String getAddress() {
        return this._address;
    }

    public void setFaculty(Faculty faculty) {
        this._unnamed_Faculty_ = faculty;
    }

    public void displayInstituteInfo() {
        System.out.println("\n=== Institute Information ===");
        System.out.println("Name: " + _name);
        System.out.println("Address: " + _address);
        if (_unnamed_Faculty_ != null) {
            System.out.println("Faculty: " + _unnamed_Faculty_.getName());
        }
        System.out.println("Research Associates (" + _researchAssociates.size() + "):");
        for (ResearchAssociate ra : _researchAssociates) {
            System.out.println("  - " + ra.getName() + " (" + ra.getFieldOfStudy() + ")");
        }
    }
}