package InterfazSistema;

import GestionPagos.GestorPagos;
import GestionPagos.Validador;

import java.util.Vector;

public class Formulario {
    private Vector inputValues;
    private Validador validador;
    private GestorPagos gestorPagos;
    public Formulario(){
        inputValues = new Vector();
        validador = new Validador();
        gestorPagos = new GestorPagos();
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

    public void solicitarGestorPago(){
        gestorPagos.registrarPago(String.valueOf(this.inputValues.elementAt(1)),
                String.valueOf(this.inputValues.elementAt(2)));
    }

}
