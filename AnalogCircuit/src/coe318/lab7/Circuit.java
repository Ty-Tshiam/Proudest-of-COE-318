package coe318.lab7;

import java.util.ArrayList;

public class Circuit {

    private static Circuit instance = null;
    private ArrayList<Object> elements = new ArrayList<>();

    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }

    private Circuit() {
    }

    public void add(Object o) {
        elements.add(o);
    }

    @Override
    public String toString() {
        String each = "";
        for (Object eachE : elements) {
            each += eachE.toString();
        }
        return each;
    }
}
