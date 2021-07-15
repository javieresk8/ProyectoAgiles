package GestionSalario;



import java.util.ArrayList;

public class ClasePersistencia {
    ArrayList<PagoSalario> listaPagoSalario;

    public ClasePersistencia(){
        this.listaPagoSalario = new ArrayList<PagoSalario>();
    }
    public void agregarPagoSalario(PagoSalario salario){
        listaPagoSalario.add(salario);
    }

    @Override
    public String toString() {
        String cadena ="";
        for (PagoSalario p: listaPagoSalario) {
            cadena += String.format("Pago # %s - Banco: %s - Concepto: %s - Estado: %d%n", p.getNumero(), p.getBanco(), p.getConcepto(), p.getEstado() );
        }
        return cadena;
    }
}
