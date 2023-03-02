package Ejercicios.herencia;

public class ClaseHija_Profesor extends ClasePadre_Persona{
    //Heredamos de la clase Persona, por lo que tendremos acceso a las funciones y atributos que no sean privados
    private String escuela;

    //Constructor agregando la variable escuela
    public ClaseHija_Profesor(String nombre, String apellido, double estatura, String escuela) {
        super(nombre, apellido, estatura);
        this.escuela = escuela;
    }

    //El metodo no regresa ningun valor por lo que se imprime el parametro en el metodo
    public void impresionDatosProfesor (String nombre, String apellido, double estatura, String escuela){
        System.out.println("Nombre del chef: " + nombre);
        System.out.println("Apellido del chef: " + apellido);
        System.out.println("Estatura del chef: " + estatura);
        System.out.println("Escuela en el que trabaja: " + escuela);
    }

}
