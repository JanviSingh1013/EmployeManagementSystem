package employManagementSystem;

public class Project {
    private int projectId;
    private boolean status;

    public Project(int projectId, boolean status) {
        this.projectId = projectId;
        this.status = status;
    }

    public int getProjectId() {
        return projectId;
    }

    public boolean isStatus() {
        return status;
    }
}
