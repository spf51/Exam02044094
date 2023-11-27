
import Vaccines.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Patient {
    // putting all of these as public for now
    public String name;
    public Appointment initialAppointment;

    public ArrayList<Vaccine> vaccines = new ArrayList<>();
    // create a list of the vaccines added to the patient from main to be able to
    // pass them onto schedule
    public String VaccineType;

    public Patient(String name, String initialLocation) {
        this.name = name;
        // now we can get the tide and date of the initial appointment
        initialAppointment = new InitialAppointment(LocalDate.now(), initialLocation);
        // you want have to print since in appointment you will generate a text out
        System.out.print(name + " " + initialAppointment);
    }

    // just gonna follow his structure so I dont go insane
    // create a class that adds the vaccines from main onto ArrayList for the patient
    // He's created a class Vaccine which will be the type for this data structure
    public void addVaccine(Vaccine vaccine) {
        vaccines.add(vaccine);
    }

    // now that you have all the methods to get the appointments depending on the
    // vaccines the patient has you 1) go through the list of vaccines they have
    // call the getAppointments() for each to  get back their dates
    // make this all into a big string

    public String displayAppointments(){
        String display = new String();
        display += "Pat " + name;
        // add inital app
        display+= InitialAppointment.getDisplayText();
        // for each vacc its appo
        for(Vaccine vacs : vaccines){
            for(Appointment apps : vacs.)
        }


    }
}
