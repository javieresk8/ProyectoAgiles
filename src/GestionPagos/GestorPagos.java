package GestionPagos;

public class GestorPagos {
    private float valorPago;
    private PagoMatricula pagoMatricula;
    private ClasePersistencia db;

    public GestorPagos(){
        db = new ClasePersistencia();

    }

    public void registrarPago(String numeroPago, String nombreBanco){
        pagoMatricula = new PagoMatricula(numeroPago, nombreBanco);
        pagoMatricula.pagar();
        db.agregarPagoMatricula(pagoMatricula);
        //System.out.println(db.toString());
    }

}
