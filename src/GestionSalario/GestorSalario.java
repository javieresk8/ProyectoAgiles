package GestionSalario;

public class GestorSalario {
    private float salario;
    private PagoSalario pagoSalario;
    private ClasePersistencia db;

    public GestorSalario(){
        db = new ClasePersistencia();
    }
}
