package arrayList;

public class Student {
    String name;
    int id;
    String course;
    int age;
    Student(String name, int id, String course, int age){
        this.name = name;
        this.id = id;
        this.course = course;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name is: "+this.name+",\nid is: "+this.id+",\nCourse is: "+this.course+",\nAge is: "
                +this.age;
    }
}
