package Vaccines;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class pfizerVaccine extends Vaccine {
    // simply pass in its values with super
    // you need to create a method first USE THE () FOR METHODS
    public pfizerVaccine() {
        super("Pfizer", 2, 6, "Southall", LocalDate.now().plusDays(5));
       // DateCalculator calculator = new DateCalculator( < Vaccine > pfizerVaccine);
    }
    public List<Appointment> getAppointments(){
        ArrayList<Appointment> appointments = new ArrayList<>();
        String giver;
        // here is where you put your actual logic
        // 2 doses, 1st one is doctor
        for(int i=1; i<=doses; i++){
            if(i==1) giver = "Doctor";
            else giver = "Nurse";
            LocalDate VaccDate = firstDoseDate.plusDays((i-1)*spacing);
            appointments.add(new VaccineAppointment(i, VaccDate, this, giver))
        }
        return appointments;
    }


}
