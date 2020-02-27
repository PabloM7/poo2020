package herencia;

public class Administrativo {

    //Atributos propios de la clase Administrativo
    private String dependencia;

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public void gestionar_procesos() {
        System.out.println("Metodo para gestionar procesos");
    }
}
