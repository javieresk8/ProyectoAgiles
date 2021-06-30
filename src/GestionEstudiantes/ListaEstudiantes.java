package GestionEstudiantes;

import java.util.ArrayList;

public class ListaEstudiantes {
    ArrayList<Estudiante> listaEstudiantes;

    public ListaEstudiantes(){
        listaEstudiantes = new ArrayList<Estudiante>();
        //Estudiantes previamente almacenados, para evitar usar BD
        Estudiante e = new Estudiante("Alex", "Erazo", "1755041595","Sistemas" );
        Estudiante e2 = new Estudiante("Diego", "Marquez", "1795049387","Fisica" );
        Estudiante e3 = new Estudiante("Andrea", "Vargas", "123456789","Agronomía" );
        agregarEstudiante(e);
        agregarEstudiante(e2);
        agregarEstudiante(e3);

    }

    public void agregarEstudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }

    public void borrarEstudiante(Estudiante estudiante){
        listaEstudiantes.remove(estudiante);
    }

    public Estudiante buscarEstudiante(String cedula){
        for (Estudiante e: listaEstudiantes) {

            if (e.getCedula().equals(cedula)){
                return e;

            }
        }
        return null;
    }
}
