package Vaccines;
import java.time.LocalDate;
public class VaccineAppointment extends Appointment {

    private Vaccine vaccine;
    private String giver = new String();
    private int doseNumber;

    public VaccineAppointment(int doseNumber, LocalDate date, Vaccine vaccine, String giver){
        super(date, vaccine.getLocation());
        this.vaccine = vaccine:
        this.giver=giver;
        this.doseNumber = doseNumber;

    }

    public String getDisplayText() {
        return "Vaccine " + vaccine.getName() + " Dose Number" + doseNumber + "given by " + giver + "date "+ date.toString() + "at " + location;
    }
}
