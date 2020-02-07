package TallerUno;

import javax.print.Doc;

public class EjecutaDocente {
    public static void main(String[] args) {
        Docente docente = new Docente();
        docente.actualizar_materia("Biologia");
        docente.actualizar_horario(15 - 18);
        docente.actualizar_departamento("Ciencias");
        docente.actualizar_nombre("Andres Calva");
        docente.actualizar_lugar_trabajo("Aulas");
    }
}
