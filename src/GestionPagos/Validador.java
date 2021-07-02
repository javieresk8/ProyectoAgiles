package GestionPagos;

import GestionEstudiantes.Estudiante;

public class Validador {
    private String valor;
    private GestorPagos gestor;
    private Estudiante estudiante;

    public Validador(){
        //this.valor = valor;
        gestor = new GestorPagos();
        estudiante = new Estudiante();
    }

    public boolean validarCedula(String cedula){
        String cedulaValidar = solicitarCedula(cedula);
        if (cedulaValidar != null){
            return true;
        }
        return false;

    }
    public String solicitarCedula(String cedula){
        String cedulaObtenida = estudiante.obtenerCedula(cedula);
        if (cedulaObtenida !=null){
            return cedulaObtenida;
        } else {
            return null;
        }
    }

    public void setValor(String valor){
        this.valor = valor;
    }
}