package Vaccines;

import java.time.LocalDate;

public class Vaccine {
    // so ill create an abstract class
    protected String name;
    protected int doses;
    protected int spacing;
    protected String location;
    protected LocalDate firstDose;
    public Vaccine(String name, String doses, int spacing, String location, LocalDate firstDose){
        this.name = name;
        this.doses = doses;
        this.spacing = spacing;
        this.location = location;
        this.firstDose = firstDose;


    }

    public String getName{
        return name;

    }
    public String getLocation{
        return location;
    }
}
