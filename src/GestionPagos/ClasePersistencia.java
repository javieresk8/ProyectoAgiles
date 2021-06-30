package GestionPagos;

import java.util.ArrayList;

public class ClasePersistencia {
    ArrayList<PagoMatricula> listaPagoMatricula;

    public ClasePersistencia(){
         this.listaPagoMatricula = new ArrayList<PagoMatricula>();
    }

    public void agregarPagoMatricula(PagoMatricula pago){
        listaPagoMatricula.add(pago);
    }

    @Override
    public String toString(){
        String cadena ="";
        for (PagoMatricula p: listaPagoMatricula) {
            cadena += String.format("Pago # %s - Banco: %s - Estado: %d%n", p.getNumero(), p.getBanco(), p.getEstado() );
        }
        return cadena;
    }


}
