package InterfazSistema;

import GestionPagos.ClasePersistencia;

import java.util.Scanner;

public class GUI {
    public Formulario formulario;

    public GUI(){


    }

    public void render(){
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        System.out.println("==============BIENVENIDO AL SISTEMA DE PAGOS =====================");

        formulario = new Formulario();

        while(opcion != 0){
            System.out.println("==============Eliga la opción deseada =============================");
            System.out.println("1. Registrar Pago Matrícula Estudiante");
            System.out.println("2. Registar Pago Salario Docente");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            switch(opcion){
                case 0:
                    return;
                case 1:
                    String cedulaEstudiante;
                    System.out.println("==============Registrar Pago Matrícula Estudiante =============================");
                    System.out.println("Ingrese la cédula del Estudiante");
                    cedulaEstudiante = scanner.next();
                    System.out.printf("Ingresó la cédula # %s%n", cedulaEstudiante);
                    //Validamos la cedula del estudiante
                    formulario.ingresarValores(cedulaEstudiante);
                    if (formulario.solicitarValidacionCedula()){
                        String numeroComprobante;
                        String nombreBanco;

                        //Ingresa los valores del comprobante de Pago
                        System.out.printf("Estudiante con cédula: %s%n", cedulaEstudiante, "EXISTE...");
                        System.out.println("Ingrese el Número de Comprobante de Pago del Banco");
                        numeroComprobante = scanner.next();
                        formulario.ingresarValores(numeroComprobante);
                        System.out.println("Ingrese el Nombre del Banco del Comprobante de Pago");
                        nombreBanco = scanner.next();
                        formulario.ingresarValores(nombreBanco);

                        //Solicita almacenar el pago
                        formulario.solicitarGestorPago();
                        System.out.println("El comprobante de Pago se ha registrado correctamente...");

                    } else {
                        System.out.println("Cédula de Estudiante no existe en los registros...");
                    }

                    //Vacía el formulario
                    formulario.limpiarValores();
                    break;

                case 2:
                    //Caso de uso registrar salario docente
                    String cedulaDocente;
                    System.out.println("==============Registrar Pago Salario Docente =============================");
                    System.out.println("Ingrese la cédula del Docente");
                    cedulaDocente = scanner.next();
                    System.out.printf("Ingresó la cédula # %s%n", cedulaDocente);
                    formulario.ingresarValores(cedulaDocente);
                    if (formulario.solicitarValidacionCedulaDocente()){
                        String numeroCuenta;
                        String nombreBanco;

                        //Ingresa los valores del numero de cuenta
                        System.out.printf("Docente con cédula: %s%n", cedulaDocente, "EXISTE...");
                        System.out.println("Ingrese el Número de Cuenta del Docente del Banco");
                        numeroCuenta = scanner.next();
                        formulario.ingresarValores(numeroCuenta);
                        System.out.println("Ingrese el Nombre del Banco de la Cuenta del Docente");
                        nombreBanco = scanner.next();
                        formulario.ingresarValores(nombreBanco);
                        //Solicita almacenar el salario
                        formulario.solicitarGestorSalario();
                        System.out.println("El pago del salario se ha registrado correctamente...");

                    } else {
                        System.out.println("Cédula de Docente no existe en los registros...");
                    }

                    //Vacía el formulario
                    formulario.limpiarValores();
                    break;
            }

        }






    }
}

