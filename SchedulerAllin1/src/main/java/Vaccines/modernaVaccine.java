package Vaccines;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class modernaVaccine extends Vaccine {
    public modernaVaccine() {
        super("Moderna", 3, 4, "Epping", LocalDate.now().plusDays(5));
    }

    // now make a list of all the appointemtns they could give you
    public List<Appointment> getAppointments(){
        ArrayList<Appointment> appointments = new ArrayList<>();
        String giver;
        // you need to just get all the values for VaccineAppointment's arguments
        for(int i=1; i<= doses; i++){
            if(i == 1) giver = "Nurse";
            else giver = "Doctor";
            LocalDate VaccDate = firstDoseDate.plusDays((i-1)*spacing);
            appointments.add(new VaccineAppointment(i, VaccDate, this, giver));
        }
        return appointments;
    }
}
