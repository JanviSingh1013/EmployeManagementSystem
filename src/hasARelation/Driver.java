package hasARelation;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Double> marks = new ArrayList<>();
        marks.add(20.2);
        marks.add(30.1);
        marks.add(10.2);
        marks.add(30.5);
        ScoreCard scoreObject = new ScoreCard(marks);
        Student s = new Student(1,"nobita",2917253674l,12,scoreObject);
        s.display();
    }
}
