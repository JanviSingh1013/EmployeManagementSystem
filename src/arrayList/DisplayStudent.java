package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayStudent {
    public static void main(String[] args) {
        Student s1 = new Student("chinti",1,"btech",21);
        Student s2 = new Student("minti",2,"mtech",22);
        Student s3 = new Student("sinti",3,"btech",23);
        Student s4 = new Student("ginti",4,"btech",24);
        Student s5 = new Student("chinti",5,"btech",25);
        ArrayList<Student> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        printDetails(arr);
        System.out.println("enter id of student you want to search");
        int id = sc.nextInt();
        sc.nextLine();
        if(searchById(arr,id) != null){
            System.out.println(searchById(arr,id));
        }else {
            System.out.println("no such student found");
        }
        System.out.println("enter the name you want to search");
        String name = sc.nextLine();
        displaySpecificName(arr,name);
    }
    public static void printDetails(ArrayList<Student> arr){
        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            System.out.println(s);
            System.out.println("================================");
        }
    }
    public static Student searchById(ArrayList<Student> arr, int id){
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).id == id){
                return arr.get(i);
            }
        }
        return null;
    }
    public static void displaySpecificName(ArrayList<Student> arr, String name){
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).name.equals(name)){
                System.out.println(arr.get(i));
            }else {
                System.out.println("no such student found");
                return;
            }
        }
    }
}
