package shibas11.DesignPattern.GoF.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shiba on 2017-06-15.
 */
public class ScoreRecord {

    private List<Integer> scores = new ArrayList<>();
    private List<DataSheetView> dataSheetViews = new ArrayList<>();
    private MinMaxView minMaxView;

    public void addScore(int score) {
        scores.add(score);
        for(DataSheetView view : dataSheetViews) {
            view.update();
        }
        minMaxView.update();
    }

    public List<Integer> getScoreRecords() {
        return scores;
    }

    public void addDataSheetView(DataSheetView dataSheetView) {
        dataSheetViews.add(dataSheetView);
    }

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }
}
