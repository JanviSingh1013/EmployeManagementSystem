package employManagementSystem;

import java.util.ArrayList;

public class EmployOperation {
     static ArrayList<Employ> arrEmp = new ArrayList<Employ>();
     public void addEmploy(int id, String name, int age, double salary,Employ emp){
         emp.setId(id);
         emp.setName(name);
         emp.setAge(age);
         emp.setSalary(salary);
         arrEmp.add(emp);
         }
    public void displayAll() {
        // Print table header
        System.out.printf("%-10s %-20s %-10s %-10s%n", "ID", "Name", "Age", "Salary");
        System.out.println("----------------------------------------------------------");

        // Print each employee in a row
        for (int i = 0; i < arrEmp.size(); i++) {
            System.out.printf("%-10d %-20s %-10d %-10.2f%n",
                    arrEmp.get(i).getId(),
                    arrEmp.get(i).getName(),
                    arrEmp.get(i).getAge(),
                    arrEmp.get(i).getSalary());
        }
    }


    public void display(Employ emp) {
        // Print header
        System.out.printf("%-10s %-15s %-5s %-10s%n", "ID", "Name", "Age", "Salary");
        System.out.println("----------------------------------------------------");

        // Print employee data in row
        System.out.printf("%-10d %-15s %-5d %-10.2f%n",
                emp.getId(),
                emp.getName(),
                emp.getAge(),
                emp.getSalary());
    }

    public void searchById(int id){
        for (int i = 0; i < arrEmp.size(); i++) {
            if(id == arrEmp.get(i).getId()){
                display(arrEmp.get(i));
                return;
            }
        }
        System.out.println("no such record found");
    }
    public void displayDetailsByName(String name) {
        boolean found = false;

        // Print header
        System.out.printf("%-10s %-20s %-10s %-10s%n", "ID", "Name", "Age", "Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < arrEmp.size(); i++) {
            if (name.equalsIgnoreCase(arrEmp.get(i).getName())) {
                System.out.printf("%-10d %-20s %-10d %-10.2f%n",
                        arrEmp.get(i).getId(),
                        arrEmp.get(i).getName(),
                        arrEmp.get(i).getAge(),
                        arrEmp.get(i).getSalary());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employee found with name: " + name);
        }
    }
    public void searchYoungestEmploy() {
        if (arrEmp.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        int minAge = arrEmp.get(0).getAge();
        for (int i = 1; i < arrEmp.size(); i++) {
            if (arrEmp.get(i).getAge() < minAge) {
                minAge = arrEmp.get(i).getAge();
            }
        }

        System.out.printf("%-10s %-20s %-10s %-10s%n", "ID", "Name", "Age", "Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < arrEmp.size(); i++) {
            if (arrEmp.get(i).getAge() == minAge) {
                System.out.printf("%-10d %-20s %-10d %-10.2f%n",
                        arrEmp.get(i).getId(),
                        arrEmp.get(i).getName(),
                        arrEmp.get(i).getAge(),
                        arrEmp.get(i).getSalary());
            }
        }
    }

    public void calculateSalaryHikeById(int id) {
        Employ emp = null;

        for (int i = 0; i < arrEmp.size(); i++) {
            if (arrEmp.get(i).getId() == id) {
                emp = arrEmp.get(i);
                break;
            }
        }

        if (emp == null) {
            System.out.println("no employee found with id " + id);
            return;
        }

        if (emp.getProjects() != null && emp.getProjects().size() >= 2) {
            int completedProject = 0;

            for (int j = 0; j < emp.getProjects().size(); j++) {
                Project p = emp.getProjects().get(j);
                if (p.isStatus()) {
                    completedProject++;
                }
            }

            if (completedProject >= 2) {
                emp.setSalary(emp.getSalary() * 1.30);
                System.out.println(emp.getName() + " got 30% hike.");
            } else {
                emp.setSalary(emp.getSalary() * 1.15);
                System.out.println(emp.getName() + " got 15% hike.");
            }

            display(emp);

        } else {
            System.out.println("employee with id " + id + " has less than 2 projects  not eligible for salary hike.... Try again.");
        }
    }


}
