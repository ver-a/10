package university;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private String _name;
    private Date _start;
    private Date _end;
    private List<Participation> _participations;

    public Project(String aName, Date aStart, Date aEnd) {
        this._name = aName;
        this._start = aStart;
        this._end = aEnd;
        this._participations = new ArrayList<>();
        System.out.println("Project created: " + aName +
                " (" + aStart + " to " + aEnd + ")");
    }

    public List<Participation> getParticipations() {
        return _participations;
    }

    public void addParticipation(Participation aParticipation) {
        _participations.add(aParticipation);
    }

    public void setName(String aName) {
        this._name = aName;
    }

    public String getName() {
        return this._name;
    }

    public void setStart(Date aStart) {
        this._start = aStart;
    }

    public Date getStart() {
        return this._start;
    }

    public void setEnd(Date aEnd) {
        this._end = aEnd;
    }

    public Date getEnd() {
        return this._end;
    }

    public void displayProjectInfo() {
        System.out.println("\n=== Project Information ===");
        System.out.println("Name: " + _name);
        System.out.println("Duration: " + _start + " to " + _end);
        System.out.println("Participants (" + _participations.size() + "):");
        for (Participation p : _participations) {
            p.displayParticipationInfo();
        }
    }
}