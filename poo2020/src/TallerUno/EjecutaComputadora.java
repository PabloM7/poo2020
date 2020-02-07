package TallerUno;

public class EjecutaComputadora {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        computadora.actualizar_marca("Asus");
        computadora.actualizar_sistema_operativo("Windows");
        computadora.actualizar_precio(1500);
        computadora.actualizar_caracteristicas("Core duo");
    }
}
