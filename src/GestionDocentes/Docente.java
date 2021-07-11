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
    public boolean validarCedula(String cedula){
        return obtenerCedula(cedula) != null;
    }
    public String obtenerCedula(String cedula){
        ListaDocentes listaDocentes = new ListaDocentes();

        Docente docente = listaDocentes.buscarDocenteCedula(cedula);
        if (docente!=null){
            return docente.getCedula();
        }
        return null;
    }
    public String obtenerContrato(String contrato){
        ListaDocentes listaDocentes = new ListaDocentes();

        Docente docente = listaDocentes.buscarDocenteContrato(contrato);
        if (docente!=null){
            return docente.getCod_contrato();
        }
        return null;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCod_contrato() {
        return cod_contrato;
    }
}
