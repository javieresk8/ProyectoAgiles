package GestionDocentes;

public class Docente {
    private String nombre;
    private String apellido;
    private String cedula;
    private String cod_contrato;

    public Docente(String nombre, String apellido, String cedula, String cod_contrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cod_contrato = cod_contrato;
    }

    public Docente() {
    }

}
