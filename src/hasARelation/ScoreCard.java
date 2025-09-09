package hasARelation;

import java.util.ArrayList;

public class ScoreCard {
    ArrayList<Double> marks;

    ScoreCard(ArrayList<Double> marks) {
        this.marks = marks;
    }

    public void displayScore() {
        for (int i = 0; i < marks.size(); i++) {
            System.out.println("marks "+(i + 1)+": "+marks.get(i));
        }

    }
}
