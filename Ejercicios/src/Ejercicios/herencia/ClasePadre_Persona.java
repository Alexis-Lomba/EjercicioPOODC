package Ejercicios.herencia;

public class ClasePadre_Persona {
    protected String nombre;
    protected String apellido;
    protected double estatura;

    public ClasePadre_Persona(String nombre, String apellido, double estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
    }

    //Saludamos y el metodo regresa un valor que sera impreso en la clase main
    public String saludoPersona(String nombre,String apellido) {
        String saludo = "\nHola " + nombre + " " + apellido;
        return saludo;
    }

}
