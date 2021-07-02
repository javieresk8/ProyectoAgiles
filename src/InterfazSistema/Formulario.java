package InterfazSistema;

import GestionPagos.GestorPagos;
import GestionPagos.Validador;
import GestionSalario.GestorSalario;

import java.util.Vector;

public class Formulario {
    private Vector inputValues;
    private Validador validador;
    private GestionSalario.Validador validadorSalario;
    private GestorPagos gestorPagos;
    private GestorSalario gestorSalario;
    public Formulario(){
        inputValues = new Vector();
        validador = new Validador();
        gestorPagos = new GestorPagos();
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
         return validador.validarCedula(valor);
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
