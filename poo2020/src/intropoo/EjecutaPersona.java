package intropoo;

public class EjecutaPersona {

    public static void main(String[] args) {
        //Creacion de objeto
        Persona persona = new Persona("Masculino", "catolica", "20", "Juanito");
        System.out.println(persona.getNombre());
        System.out.println("edad: "+persona.getEdad());
        System.out.println("religion :"+persona.getReligion());
        System.out.println("genero: "+persona.getGenero());

        //Creacion de objeto constructor
        Persona persona2 = new Persona("Masculino", "catolica", "20", "Juanito");
        Persona persona3 = new Persona("Femenino", "catolica", "24", "Ana");

    }
}
