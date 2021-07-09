package InterfazSistema;

import GestionEstudiantes.Estudiante;
import GestionPagos.GestorPagos;
import GestionSalario.GestorSalario;

import java.util.Vector;

public class Formulario {
    private Vector inputValues;
    private GestionSalario.Validador validadorSalario;
    private GestorPagos gestorPagos;
    private Estudiante estudiante;
    private GestorSalario gestorSalario;
    public Formulario(){
        inputValues = new Vector();
        gestorPagos = new GestorPagos();
        estudiante= new Estudiante();
        validadorSalario = new GestionSalario.Validador();
        gestorSalario = new GestorSalario();
    }
    public void ingresarValores(String valor){
        inputValues.addElement(valor);
    }

    public void limpiarValores(){
        inputValues.clear();
    }

    public boolean solicitarValidacionCedula(){
        String valor = String.valueOf(this.inputValues.elementAt(0));
         return estudiante.validarCedula(valor);
    }
    public boolean solicitarValidacionCedulaDocente(){
        String valor = String.valueOf(this.inputValues.elementAt(0));
        return  validadorSalario.validarCedula(valor);
    }

    public void solicitarGestorPago(){
        gestorPagos.registrarPago(String.valueOf(this.inputValues.elementAt(1)),
                String.valueOf(this.inputValues.elementAt(2)));
    }
    public void solicitarGestorSalario(){
        gestorSalario.registrarSalario(String.valueOf(this.inputValues.elementAt(1)),
                String.valueOf(this.inputValues.elementAt(2)));
    }

}
