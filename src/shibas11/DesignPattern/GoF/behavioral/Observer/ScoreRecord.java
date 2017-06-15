package shibas11.DesignPattern.GoF.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shiba on 2017-06-15.
 */
public class ScoreRecord {

    private List<Integer> scores = new ArrayList<>();
    private DataSheetView dataSheetView;
    private MinMaxView minMaxView;

    public void addScore(int score) {
        scores.add(score);
        dataSheetView.update();
        minMaxView.update();
    }

    public List<Integer> getScoreRecords() {
        return scores;
    }

    public void setDataSheetView(DataSheetView dataSheetView) {
        this.dataSheetView = dataSheetView;
    }

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }
}
