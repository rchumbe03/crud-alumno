package Paciente;


import java.util.ArrayList;

public class GestorPaciente {
    private final ArrayList<Paciente> pacientes = new ArrayList<>();
    private int id = 1;

    public void agregarPaciente(Paciente paciente) {
        paciente.setId(id++);
        pacientes.add(paciente);
    }
    public ArrayList<Paciente> listarPacientes() {
        ArrayList<Paciente> pacientesNoBorrados = new ArrayList<>();
        for (Paciente paciente : pacientes) {
            if (!paciente.isBorrado()) {
                pacientesNoBorrados.add(paciente);
            }
        }
        return pacientesNoBorrados;
    }
    public void eliminarPaciente(int idPaciente) {
        for (Paciente paciente : pacientes) {
            if (paciente.getId() == idPaciente) {
                paciente.setBorrado(true);
                System.out.println("Alumno eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ningún alumno con el ID proporcionado.");
    }
}
