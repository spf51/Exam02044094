package Scheduler;

import Vaccines.Vaccine;

import java.time.LocalDate;
import java.util.ArrayList;

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
        innitialAppointment = new Appointment(LocalDate.now(), innitialLocation);

    }

    // just gonna follow his structure so I dont go insane
    // create a class that adds the vaccines from main onto ArrayList for the patient
    // He's created a class Vaccine which will be the type for this data structure
    public addVaccine(String VaccineType){
        vaccines.add(VaccineType);

    }
}
