package GestionDocentes;

import java.util.ArrayList;

public class ListaDocentes {
    ArrayList<Docente> listaDocentes;

    public ListaDocentes(){
        listaDocentes = new ArrayList<>();
        //Lista de docentes previamente almacenados para no usar BD
        Docente d = new Docente("Carlos","Iñiguez","1724975386","PAC123");
        Docente d1 = new Docente("Julio","Sabdobalin","1724975383","SEC133");
        Docente d2 = new Docente("Marco","Benalcazar","1724975234","ECA121");
        agregarDocentes(d);
        agregarDocentes(d1);
        agregarDocentes(d2);
    }
    public void agregarDocentes(Docente docente){
        listaDocentes.add(docente);

    }
    public void borrarDocente(Docente docente){
        listaDocentes.remove(docente);
    }
    public Docente buscarDocenteCedula(String cedula){
        for (Docente d: listaDocentes){
            if(d.getCedula().equals(cedula)){
                return d;
            }
        }
        return null;

    }
    public Docente buscarDocenteContrato(String contrato){
        for (Docente d: listaDocentes){
            if(d.getCod_contrato().equals(contrato)){
                return d;
            }
        }
        return null;

    }
}
