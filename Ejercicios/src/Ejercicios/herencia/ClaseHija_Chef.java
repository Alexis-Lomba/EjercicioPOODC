package Ejercicios.herencia;

public class ClaseHija_Chef extends ClasePadre_Persona {
    //Heredamos de la clase Persona, por lo que tendremos acceso a las funciones y atributos que no sean privados

    private String restaurante;

    //Constructor agregando la variable restaurante
    public ClaseHija_Chef (String nombre, String apellido, double estatura, String restaurante) {
        super(nombre, apellido, estatura);
    }

    //metodo que imprime los datos que fueron especificados en los parametros del metodo y que se imprimen desde el metodo
    public void impresionDatosChef (String nombre, String apellido, double estatura, String restaurante){
        System.out.println("Nombre del chef: " + nombre);
        System.out.println("Apellido del chef: " + apellido);
        System.out.println("Estatura del chef: " + estatura);
        System.out.println("Restaurante en el que trabaja: " + restaurante);
    }

}
