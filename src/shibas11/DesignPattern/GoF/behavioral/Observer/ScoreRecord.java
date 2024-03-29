package shibas11.DesignPattern.GoF.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {

    private List<Integer> scores = new ArrayList<>();

    public void addScore(int score) {
        scores.add(score);
        notifyObservers(); // observer 에게 변경 통보
    }

    public List<Integer> getScoreRecords() {
        return scores;
    }
}
