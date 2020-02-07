package TallerUno;

public class EjecutaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.actualizar_marca("Toyota");
        vehiculo.actualizar_modelo("Sport");
        vehiculo.actualizar_procedencia("Japon");
        vehiculo.actualizar_cilindraje("2.30");
    }
}
