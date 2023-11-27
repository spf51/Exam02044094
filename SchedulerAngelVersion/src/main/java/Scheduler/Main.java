package Scheduler;

import java.time.LocalDate;
import java.util.ArrayList;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//////
public class Patient {
    // putting all of these as public for now
    public String name;
    public String innitialAppointment;

    public ArrayList<Vaccine> vaccines = new ArrayList<>();
    // create a list of the vaccines added to the patient from main to be able to
    // pass them onto schedule

    public Patient(String name, String innitialLocation){
        this.name = name;
        // now we can get the tide and date of the initial appointment
        //innitialAppointment = new Appointment(LocalDate.now(), innitialLocation);

    }

    // just gonna follow his structure so I dont go insane
    // create a class that adds the vaccines from main onto ArrayList for the patient
    // He's created a class Vaccine which will be the type for this data structure
    public void addVaccine(String VaccineType){
        vaccines.add(VaccineType);

    }
}

public class Appointment {
    // I want this to return the local date and the appointment location
    // args = location (will be fed from patient)
    // date will come from the import
    // create them without a value 1st so that you can set in the next object
    protected LocalDate date;
    protected String location;

    public Appointment(LocalDate date, String location){
        this.date = date;
        this.location = location;


    }
}

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
public class pfizerVaccine extends Vaccine {
    // simply pass in its values with super
    // you need to create a method first USE THE () FOR METHODS
    public pfizerVaccine (){
        super('Pfizer', 3, 5, 'Epping');


    }

}


class Frame1 extends Frame {
    Frame1() {
        Button b = new Button("Click");
        b.setBounds(200,50,80,30);
        add(b);
        setTitle("Basic example");
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }
}


public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("John", "Epping");
        patient1.addVaccine('Moderna');
        // and you get the day today

        Frame1 frame = new Frame1();

        // if its in the frame file?
        frame.setSize(400,400);
        frame.setVisible(true);



    }
}