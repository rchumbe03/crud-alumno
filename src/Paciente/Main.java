package Paciente;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerNum = new Scanner(System.in).useLocale(Locale.US);
    static GestorPaciente gp = new GestorPaciente();

    // Menù //
    private static void menu() {
        System.out.println("Menu de Opciones ");
        System.out.println("====================");
        System.out.println("1. Crear Paciente");
        System.out.println("2. Mostrar Paciente");
        System.out.println("3. Modificar Paciente");
        System.out.println("4. Eliminar Paciente");
        System.out.println("5  Añadir Pacientes (Default)");
        System.out.println("0. Salir");
        System.out.println();
        System.out.print("Ingrese una opcion: ");
    }
    public static void main(String[] args) {
        int opcion;
        System.out.println("crud de alumnos");
        boolean salir = false;
        do {
            menu();
            opcion = scannerNum.nextInt();
            switch (opcion) {
                case 1:
                    agregarPaciente();
                    break;
                case 2:
                    mostrarPaciente();
                    break;
                case 3:
                    actualizarPaciente();
                    break;
                case 4:
                    eliminarPaciente();
                    break;
                case 5:
                    mocearAlumno();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (!salir);
        System.out.println("Adios!");
    }

    private static void agregarPaciente() {
        String nombre;
        String apellido;
        int edad;
        String telefono;
        String correo;
        String registro;
        String clasificacion;

        // Formulario AgregarPaciente //
        System.out.println("Formulario para Agregar Alumno");
        System.out.println("==============================");
        System.out.println();
        System.out.print("Nombre : ");
        nombre = scannerStr.nextLine();
        System.out.print("Apellido : ");
        apellido = scannerStr.nextLine();
        System.out.print("Edad : ");
        edad = scannerNum.nextInt();
        System.out.print("telefono : ");
        telefono = scannerStr.nextLine();
        System.out.print("Correo electronico : ");
        correo = scannerStr.nextLine();
        System.out.print("Registro de tensiòn arterial : ");
        registro = scannerStr.nextLine();
        System.out.print("Clasificación de riesgo cardiopatía : ");
        clasificacion = scannerStr.nextLine();
        gp.agregarPaciente(new Paciente(nombre, apellido, edad, telefono, correo, registro, clasificacion));
        System.out.println("\nPaciente agregado con exito.......!");
        pausa();
    }
    private static void pausa() {
        System.out.println();
        System.out.println("Ingrese ENTER para continuar...");
        scannerStr.nextLine();
    }
    private static void cabeceraListarPacientes() {
        // Salida de datos con variable local
        System.out.println("\n\n          Lista de Paciente");
        System.out.println("=========================================================================================================================");
        System.out.println("ID    Nombre    Apellido    Edad    Telefono            Correo                  Tensión arterial    Riesgo de cardiopatia");
        System.out.println("=========================================================================================================================");
    }
    private static void mostrarPaciente() {
        cabeceraListarPacientes();
        for (Paciente p : gp.listarPacientes()) {
            System.out.println(p.toStr());
        }
        pausa();
    }
    private static void actualizarPaciente() {
        // Mostrar lista de Pacientes
        System.out.println("Lista de Pacientes:");
        cabeceraListarPacientes();
        for (Paciente p : gp.listarPacientes()) {
            System.out.println(p.toStr());
        }

        // Solicitar al usuario el ID
        System.out.print("Ingrese el ID del paciente: ");
        int idPaciente = scannerNum.nextInt();

        // Buscar el Paciente
        Paciente pacienteActualizar = null;
        for (Paciente p : gp.listarPacientes()) {
            if (p.getId() == idPaciente) {
                pacienteActualizar = p;
                break;
            }
        }

        // Verificar si se encontró el alumno
        if (pacienteActualizar != null) {
            // Solicitar al usuario los nuevos datos del alumno
            System.out.println("Ingrese los nuevos datos del alumno:");
            System.out.print("Nombre : ");
            String nuevoNombre = scannerStr.nextLine();
            System.out.print("Apellido : ");
            String nuevoApellido = scannerStr.nextLine();
            System.out.print("Edad : ");
            int nuevaEdad = scannerNum.nextInt();
            System.out.print("Telefono : ");
            String nuevoTelefono = scannerStr.nextLine();
            System.out.print("Correo : ");
            String nuevoCorreo = scannerStr.nextLine();
            System.out.print("Registro de tensión arterial : ");
            String nuevoRegistro = scannerStr.nextLine();
            System.out.print("Clasificación de riesgo de cardiopatia : ");
            String nuevaClasificacion = scannerStr.nextLine();

            // Actualizar los datos //
            pacienteActualizar.setNombre(nuevoNombre);
            pacienteActualizar.setApellido(nuevoApellido);
            pacienteActualizar.setEdad(nuevaEdad);
            pacienteActualizar.setTelefono(nuevoTelefono);
            pacienteActualizar.setCorreo(nuevoCorreo);
            pacienteActualizar.setRegistro(nuevoRegistro);
            pacienteActualizar.setClasificacion(nuevaClasificacion);

            System.out.println("Paciente actualizado con éxito.");
        } else {
            System.out.println("No se encontró ningún alumno con el ID proporcionado.");
        }

        pausa();
    }
    private static void eliminarPaciente() {
        System.out.print("Ingrese el ID del alumno que desea eliminar: ");
        int idPaciente = scannerNum.nextInt();
        gp.eliminarPaciente(idPaciente);
        pausa();
    }
    private static void  mocearAlumno() {
        gp.agregarPaciente(new Paciente("Renzo", "Chumbe", 19, "988473111", "rchumberosas03@gmail.com", "sistolica", "bajo"));
        gp.agregarPaciente(new Paciente("Flavia", "Timaná", 19, "646782918", "flaviadelpilar1@gmail.com", "diastolica", "medio"));
        gp.agregarPaciente(new Paciente("Mauricio", "Rosas", 20, "906482918", "mauricio21@gmail.com", "diastolica", "medio"));
        gp.agregarPaciente(new Paciente("Luis", "León", 25, "275800738", "luisfernando14@gmail.com", "sistolica", "alto"));
        gp.agregarPaciente(new Paciente("Rodrigo", "Rodriguez", 22, "693820218", "Rodrigocr@gmail.com", "diastolica", "alto"));
        System.out.println("\n5 registros agrados con exito.......!");
        pausa();
    }
}
