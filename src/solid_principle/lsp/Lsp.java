package solid_principle.lsp;

import java.util.ArrayList;
import java.util.List;

public class Lsp {
    public static void main(String[] args) {

        List<WorkingEmployee> employees = new ArrayList<>();
        employees.add(new WorkingEmployeImp());

        Project project = new Project();
        project.startProject(employees);

    }
}
