package GestionEstudiantes;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String cedula;
    private String carrera;

    public Estudiante(String nombre, String apellido, String cedula,String carrera){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.carrera = carrera;

    }

    public Estudiante(){

    }

    public String obtenerCedula(String cedula){
        ListaEstudiantes listaEstudiantes = new ListaEstudiantes();

        Estudiante estudiante = listaEstudiantes.buscarEstudiante(cedula);
        if (estudiante!=null){
            return estudiante.getCedula();
        }
        return null;
    }

    public String getCedula(){
        return this.cedula;
    }

}
