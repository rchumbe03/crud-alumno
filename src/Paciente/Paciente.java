package Paciente;


public class Paciente {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String correo;
    private String registro;
    private String clasificacion;
    private boolean borrado;

    // Constructor //

    public Paciente(String nombre, String apellido, int edad, String telefono, String correo, String registro, String clasificacion) {
        this.id = 0;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.registro = registro;
        this.clasificacion = clasificacion;
    }

    // Getter y Setter //

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

    public double getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public boolean isBorrado() {
        return borrado;
    }
    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    public String toStr() {

        // Espacios de datos
        return String.format("%-5d %-9s %-11s %-6s %-13s %-33s %-24s %-10s",
                id, nombre, apellido, edad, telefono, correo, registro, clasificacion);
    }
}
