package GestionSalario;

import InterfazSistema.GUI;

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
        //Scanner input = new Scanner(System.in);
        String input = GUI.detallePagoDocentePrueba;
        //pagoSalario.setConcepto(input.nextLine());
        pagoSalario.setConcepto(input);
        db.agregarPagoSalario(pagoSalario);
    }

}
