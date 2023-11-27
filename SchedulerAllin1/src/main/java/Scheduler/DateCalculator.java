package Scheduler;

import Vaccines.Vaccine;

import java.time.LocalDate;

public class DateCalculator {
    /// get the vaccines the patient has, its properties etc
    public DateCalculator(Vaccine vaccine) {
        System.out.print(LocalDate.now().plusDays(vaccine.spacing));
    }
}
