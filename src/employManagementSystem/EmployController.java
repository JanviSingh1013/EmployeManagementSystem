package employManagementSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployOperation oprtn = new EmployOperation();
        char ch;
        do {
            System.out.println("1 for add employ");
            System.out.println("2 for display all the employ");
            System.out.println("3 for search employ by id");
            System.out.println("4 for search details of employ by name");
            System.out.println("5 for search youngest employ");
            System.out.println("6 for calculate salary hike");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                System.out.println("enter id");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("enter name");
                String name = sc.nextLine();
                System.out.println("enter age");
                int age = sc.nextInt();
                System.out.println("enter salary");
                double salary = sc.nextDouble();
                Employ emp = new Employ();
                oprtn.addEmploy(id,name,age,salary,emp);
                System.out.println("enter number of project");
                int projectNumber = sc.nextInt();
                sc.nextLine();

                ArrayList<Project> projects = new ArrayList<>();
                for (int i = 0; i < projectNumber; i++) {
                    System.out.println("enter project status (completed/running):");
                    String status = sc.nextLine();
                    projects.add(new Project(status));
                }
                emp.setProjects(projects);
            } else if(choice == 2){
                oprtn.displayAll();
            } else if (choice == 3) {
                System.out.println("enter id you want to search");
                int id = sc.nextInt();
                sc.nextLine();
                oprtn.searchById(id);
            } else if (choice == 4) {
                System.out.println("enter name you want to search");
                String name = sc.nextLine();
                oprtn.displayDetailsByName(name);
            } else if (choice == 5) {
                oprtn.searchYoungestEmploy();
            } else if (choice == 6) {
                oprtn.calculateSalaryHike();
            }
            System.out.println("want to continue operation then press y/Y");
            ch = sc.next().charAt(0);
        }while (ch == 'y' || ch == 'Y');
    }
}
