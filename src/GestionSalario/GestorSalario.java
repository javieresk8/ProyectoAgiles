package GestionSalario;

import GestionPagos.PagoMatricula;

import java.util.Scanner;

public class GestorSalario {
    private float salario;
    private PagoSalario pagoSalario;
    private ClasePersistencia db;

    public GestorSalario(){
        db = new ClasePersistencia();
    }

    public void registrarSalario(String numeroCuenta, String banco){
        pagoSalario = new PagoSalario(numeroCuenta,banco);
        pagoSalario.efectuarPago();
        System.out.println("Ingrese el concepto del pago del salario");
        Scanner input = new Scanner(System.in);
        pagoSalario.setConcepto(input.nextLine());
        confirmarPago(pagoSalario);
    }
    public void confirmarPago(PagoSalario salario){
        db.agregarPagoSalario(salario);
    }
}
