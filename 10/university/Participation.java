package university;

public class Participation {
    private int _hours;
    private ResearchAssociate _researchAssociate;
    private Project _project;

    public Participation(ResearchAssociate aRa, Project aProject, int aHours) {
        this._researchAssociate = aRa;
        this._project = aProject;
        this._hours = aHours;
        System.out.println("Participation created: " + aRa.getName() +
                " works " + aHours + " hours on project " + aProject.getName());
    }

    public void setHours(int aHours) {
        this._hours = aHours;
    }

    public int getHours() {
        return this._hours;
    }

    public ResearchAssociate getResearchAssociate() {
        return this._researchAssociate;
    }

    public Project getProject() {
        return this._project;
    }

    public void displayParticipationInfo() {
        System.out.println(getResearchAssociate().getName() +
                " participates in " + getProject().getName() +
                " for " + _hours + " hours");
    }
}