package SalaryManager;

import java.util.ArrayList;

public interface IDigitalClock {

    //Return the schedule worked by a  given professor
    public ArrayList<ClockRecord> getWorkScheduleProfessor(String idProfessor);
}
