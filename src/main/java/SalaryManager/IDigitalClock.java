package SalaryManager;

import java.util.ArrayList;

public interface IDigitalClock {

    //Return the schedule worked by a  given professor
    //Devuelve todos los dias laborables, si no asistio marca timeStart y timeEnd como 0.0
    public ArrayList<ClockRecord> getWorkScheduleProfessor(String idProfessor);
}
