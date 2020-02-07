package TallerUno;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.actualizar_nombre("Pablo Montaño");
        estudiante.actualizar_edad(21);
        estudiante.actualizar_carrera("Computacion");
        estudiante.actualizar_ciclo(4);
        estudiante.actualizar_genero("Masculino");
    }
}
