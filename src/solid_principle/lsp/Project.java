package solid_principle.lsp;

import java.util.List;

public class Project {

    public void startProject(List<WorkingEmployee> employees) {
        for (WorkingEmployee employee : employees) {
            employee.work();

        }
    }
}
