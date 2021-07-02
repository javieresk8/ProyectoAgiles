package GestionSalario;
import GestionDocentes.Docente;
public class Validador {
    private String salario;
    private GestorSalario gestor;
    private Docente docente;

    public Validador(){
        gestor = new GestorSalario();
        docente = new Docente();
    }
    public boolean validarCedula(String cedula){
        String cedulaValidar = solicitarCedula(cedula);
        if(cedulaValidar != null){
            return true;
        }
        return false;
    }
    public String solicitarCedula(String cedula){
        String cedulaObtenida = docente.obtenerCedula(cedula);
        if (cedulaObtenida !=null){
            return cedulaObtenida;
        } else {
            return null;
        }
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
