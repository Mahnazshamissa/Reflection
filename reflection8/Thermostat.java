package reflection8;


import java.util.concurrent.locks.Condition;
import java.util.function.Function;

public class Thermostat {

    private Condition trigger;
    private Function display;

    public Thermostat(Condition trigger, Function display) {
        this.trigger = trigger;
        this.display = display;
    }

    public Condition getTrigger() {
        return trigger;
    }

    public Function getDisplay() {
        return display;
    }

    public String sense (Double tempInCelcius , Function <Double, String> condition){
        String message = condition.apply(tempInCelcius);
        return message ;
    }
}

//The Thermostat has a trigger condition and a display function.
// It receives them via constructor, so they can be customized every time a new one is created.