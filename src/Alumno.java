public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private double nota1;
    private double nota2;
    private double nota3;
    private double asistencia;
    private double examenfinal;
    private double notafinal;
    private String notaCualitativa;

    // -constructor- //
    public Alumno(String nombre, String apellido, String telefono, String email, double nota1, double nota2, double nota3, double asistencia, double examenfinal) {
        this.id = 0;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.asistencia = asistencia;
        this.examenfinal = examenfinal;
        this.notafinal = nota1 * 0.2 + nota2 * 0.2 + nota3 * 0.2 + asistencia * 0.1 + examenfinal * 0.3;
    }

    // -getter y setter- //

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(double asistencia) {
        this.asistencia = asistencia;
    }

    public double getExamenfinal() {
        return examenfinal;
    }

    public void setExamenfinal(double examenfinal) {
        this.examenfinal = examenfinal;
    }

    public double getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(double notafinal) {
        this.notafinal = notafinal;
    }

    public String getNotaCualitativa() {
        return notaCualitativa;
    }

    public void setNotaCualitativa(String notaCualitativa) {
        this.notaCualitativa = notaCualitativa;
    }

    public String toStr() {
        // Asumiendo anchos de campo fijos, ajusta los números según sea necesario
        return String.format("%-4d %-20s %-15s %-6d %-10s", id, nombre, apellido, telefono, email, nota1, nota2, nota3, asistencia, examenfinal);
    }

    private void calcularnotaCualitativaFinal(Alumno alumno) {
        double notafinal;
        notafinal = alumno.getNotafinal();

        if (this.notafinal >= 5.0 && notafinal < 7.0) {
            alumno.setNotaCualitativa("Aprobado");
        } else if (this.notafinal >= 7.0 && notafinal <= 9.0) {
            alumno.setNotaCualitativa("Notable!");
        } else if (this.notafinal >= 9.0 && notafinal <= 10.0) {
            alumno.setNotaCualitativa("Sobresaliente!!");
        } else  {
            alumno.setNotaCualitativa("Suspenso...");
        }
    }
}
