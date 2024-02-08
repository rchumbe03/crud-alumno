import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerNum = new Scanner(System.in).useLocale(Locale.US);
    static GestorAlumnos gc = new GestorAlumnos();
    private static void menu() {
        System.out.println("Menu de Opciones");
        System.out.println("====================");
        System.out.println("1. Agregar Alumnos");
        System.out.println("2. Mostrar Alumnos");
        System.out.println("3. Actualizar Alumnos");
        System.out.println("4. Eliminar Alumnos");
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
                    agregarAlumno();
                    break;
                case 2:
                    //mostrarAlumno();
                    break;
                case 3:
                    //actualizarAlumno();
                    break;
                case 4:
                    //eliminarAlumno();
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
    private static void agregarAlumno() {
        String nombre;
        String apellido;
        String telefono;
        String email;
        double nota1;
        double nota2;
        double nota3;
        double asistencia;
        double examenfinal;

        // Formulario agregarAlumno //

        System.out.println("Formulario para Agregar Alumno");
        System.out.println("==============================");
        System.out.println();
        System.out.print("Nombre : ");
        nombre = scannerStr.nextLine();
        System.out.print("Apellido : ");
        apellido = scannerStr.nextLine();
        System.out.print("telefono : ");
        telefono = scannerStr.nextLine();
        System.out.print("Correo electronico : ");
        email = scannerStr.nextLine();
        System.out.print("Nota Núm 1 : ");
        nota1 = scannerNum.nextDouble();
        System.out.print("Nota Núm 2 : ");
        nota2 = scannerNum.nextDouble();
        System.out.print("Nota Núm 3 : ");
        nota3 = scannerNum.nextDouble();
        System.out.print("Nota Asistencia : ");
        asistencia = scannerNum.nextDouble();
        System.out.print("Nota del examen final : ");
        examenfinal = scannerNum.nextDouble();
        gc.agregarAlumno(new Alumno( nombre, apellido, telefono, email, nota1, nota2, nota3, asistencia, examenfinal));
        System.out.println("\nAlumno agregado con exito.......!");
        pausa();
    }
    private static void pausa() {
        System.out.println();
        System.out.println("Presione ENTER para continuar...");
        scannerStr.nextLine();
    }
}
