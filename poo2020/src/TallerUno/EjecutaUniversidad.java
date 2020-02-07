package TallerUno;

public class EjecutaUniversidad {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        universidad.actualizar_direccion("Calle Paris");
        universidad.actualizar_carrera("Derecho, Turismo");
        universidad.actualizar_area("Socio-Humanistica");
        universidad.actualizar_docente("Juan Valverde");
    }
}
