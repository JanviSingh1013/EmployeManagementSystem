package hasARelation;

public class Student {
    int id;
    String name;
    long phoneNumber;   // changed from int to long
    int age;
    ScoreCard score;

    public Student(int id, String name, long phoneNumber, int age, ScoreCard score) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.score = score;
    }

    public void display() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Age: " + this.age);
        this.score.displayScore();
    }
}
