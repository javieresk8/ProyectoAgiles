package GestionPagos;

public class PagoMatricula {
    private String numero;
    private String banco;
    private int estado; //0 impago, 1 pagado

    public PagoMatricula(String numero, String banco){
        this.numero = numero;
        this.banco = banco;
        this.estado = 0;
    }

    public void pagar(){
        this.estado = 1;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getBanco(){
        return this.banco;
    }

    public int getEstado(){
        return this.estado;
    }

}
