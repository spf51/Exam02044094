package Vaccines;

import java.time.LocalDate;

public class Vaccine {
    // so ill create an abstract class
    protected String name;
    protected int doses;
    public int spacing;
    protected String location;
    protected LocalDate firstDoseDate;

    public Vaccine(String name, int doses, int spacing, String location, LocalDate firstDoseDate) {
        this.name = name;
        this.doses = doses;
        this.spacing = spacing;
        this.location = location;
        this.firstDoseDate = firstDoseDate;
    }


    public String getName() {
        return name;

    }

    public String getLocation() {
        return location;
    }
}
