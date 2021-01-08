package nl.novi.javaprogrammeren.overerving;

import java.util.Calendar;
//parentclass
public abstract class WildAnimal extends AnimalMain{
    private String cageName;
    private String dateLastFed;
    private String countryOfOrigin;

    public WildAnimal(String cageName, String dateLastFed, String countryOfOrigin) {
        this.cageName = cageName;
        this.dateLastFed = dateLastFed;
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public void Move() {
        System.out.println("The animal has moved 0,50m");
    }
}
