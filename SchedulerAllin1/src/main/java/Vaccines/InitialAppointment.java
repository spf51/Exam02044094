package Vaccines;
import java.time.LocalDate;

public class InitialAppointment extends Appointment {
    public InitialAppointment(LocalDate date, String location){
        super(date, location);
    }
    public String getDisplayText(){
        return "First Appointment on " + date.toString() + " with admin at " + location + "<br>";
    }

}
