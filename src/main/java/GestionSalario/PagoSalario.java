package GestionSalario;

public class PagoSalario {
    private String numero;
    private String banco;
    private String concepto;
    private int estado; // 0 impago, 1 pagado

    public PagoSalario(String numero, String banco) {
        this.numero = numero;
        this.banco = banco;
    }
    public void efectuarPago(){
        this.estado = 1;
    }
    public void establecerConcepto(String concepto){
        this.concepto = concepto;
    }
    public String getNumero() {
        return numero;
    }

    public String getBanco() {
        return banco;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getEstado() {
        return estado;
    }
}
