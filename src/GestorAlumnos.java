import java.util.ArrayList;

public class GestorAlumnos {
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    private int id = 1;
    public void agregarAlumno(Alumno alumno) {
        alumno.setId(id++);
        alumnos.add(alumno);
    }

}
