package herencia_empleado;

public class EmpleadoAsalariado extends Empleado{
    private double salario;
    /**
     * Metodo constructor
     * @param nombre
     * @param cargo
     * @param dependencia
     * @param salario
     */
    public EmpleadoAsalariado(String nombre, String cargo, String dependencia, double salario){
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
