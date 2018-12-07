package week5Exersices.reflection5;

import week5Exersices.exe06.Furniture;
import week5Exersices.exe06.Step;

public class AddLeg implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("leg");

    }
}
