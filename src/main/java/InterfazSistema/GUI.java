package InterfazSistema;

import java.util.Scanner;

public class GUI {
    //Variables temporales para auto ejecucion
    public  int opcionPrueba = 2;
    public  String cedulaEstudiantePrueba = "1755041595";
    public  String numeroComprobantePrueba = "225-663-66-55-22-555";
    public  String bancoComprobantePrueba = "Pichincha";

    public  String cedulaDocentePrueba = "1724975386";
    public  String cuentaDocentePrueba = "335213002";
    public static String detallePagoDocentePrueba = "Pago de Salario SEPT";
    public  String bancoPagoDocentePrueba = "Pichincha";
    //Fin variables temporales



    public Formulario formulario;

    public GUI(){
    }

    public void render(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 2;
        opcion = opcionPrueba;
        System.out.println("==============BIENVENIDO AL SISTEMA DE PAGOS =====================");

        formulario = new Formulario();

        while(opcion >= 0){
            System.out.println("==============Eliga la opción deseada =============================");
            System.out.println("1. Registrar Pago Matrícula Estudiante");
            System.out.println("2. Registar Pago Salario Docente");
            System.out.println("0. Salir");
            //opcion = scanner.nextInt();
            switch(opcion){
                case 0:
                    return;
                case 1:
                    guiRegistrarPagoMatricula();
                    //Vacía el formulario
                    formulario.limpiarValores();
                    break;

                case 2:
                    guiRegistrarSalarioDocente();
                    //Vacía el formulario
                    formulario.limpiarValores();
                    break;
            }
            opcion--;
        }
    }

    private void guiRegistrarSalarioDocente() {
        //Caso de uso registrar salario docente
        String cedulaDocente;
        System.out.println("==============Registrar Pago Salario Docente =============================");
        System.out.println("Ingrese la cédula del Docente");
        //cedulaDocente = scanner.next();
        cedulaDocente =cedulaDocentePrueba;
        System.out.printf("Ingresó la cédula # %s%n", cedulaDocente);
        formulario.ingresarValores(cedulaDocente);
        if (formulario.solicitarValidacionCedulaDocente()){
            String numeroCuenta;
            String nombreBanco;

            //Ingresa los valores del numero de cuenta
            System.out.printf("Docente con cédula: %s%n", cedulaDocente, "EXISTE...");
            System.out.println("Ingrese el Número de Cuenta del Docente del Banco");
            //numeroCuenta = scanner.next();
            numeroCuenta =cuentaDocentePrueba;
            formulario.ingresarValores(numeroCuenta);
            System.out.println("Ingrese el Nombre del Banco de la Cuenta del Docente");
            //nombreBanco = scanner.next();
            nombreBanco = bancoPagoDocentePrueba;
            formulario.ingresarValores(nombreBanco);
            //Solicita almacenar el salario
            formulario.solicitarGestorSalario();
            System.out.println("El pago del salario se ha registrado correctamente...");

        } else {
            System.out.println("Cédula de Docente no existe en los registros...");
        }
    }

    private void guiRegistrarPagoMatricula() {
        String cedulaEstudiante;
        System.out.println("==============Registrar Pago Matrícula Estudiante =============================");
        System.out.println("Ingrese la cédula del Estudiante");
        //cedulaEstudiante = scanner.next();
        cedulaEstudiante = cedulaEstudiantePrueba;
        System.out.printf("Ingresó la cédula # %s%n", cedulaEstudiante);
        //Validamos la cedula del estudiante
        formulario.ingresarValores(cedulaEstudiante);
        if (formulario.solicitarValidacionCedula()){
            String numeroComprobante;
            String nombreBanco;

            //Ingresa los valores del comprobante de Pago
            System.out.printf("Estudiante con cédula: %s%n", cedulaEstudiante, "EXISTE...");
            System.out.println("Ingrese el Número de Comprobante de Pago del Banco");
            //numeroComprobante = scanner.next();
            numeroComprobante = numeroComprobantePrueba;
            formulario.ingresarValores(numeroComprobante);
            System.out.println("Ingrese el Nombre del Banco del Comprobante de Pago");
            //nombreBanco = scanner.next();
            nombreBanco = bancoComprobantePrueba;
            formulario.ingresarValores(nombreBanco);

            //Solicita almacenar el pago
            formulario.solicitarGestorPago();
            System.out.println("El comprobante de Pago se ha registrado correctamente...");

        } else {
            System.out.println("Cédula de Estudiante no existe en los registros...");
        }
    }
}

