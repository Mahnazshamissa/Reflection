package week5Exersices.reflection5;

import week5Exersices.exe06.*;

import java.util.Arrays;
import java.util.List;

public class TvTableBuilder {

    private Step leg = new AddLeg();
    private Step shelf = new AddShelf();
    private Step top= new AddTop();

    List<Step> steps = Arrays.asList(leg,leg,leg,leg,shelf,top);


    public TvTable build(){
        TvTable tvTable = new TvTable();
        for (Step step : steps) {
            step.perform(tvTable);

        }
        return tvTable;
    }
}

//The table needs the following parts to be finished:
// four legs, one shelf and one top.