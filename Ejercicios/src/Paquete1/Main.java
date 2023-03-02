package Paquete1;

import java.util.Scanner;

import static Paquete1.Persona.estatura;
import static Paquete1.Persona.metodoImprimir;

public class Main {
    //Constructor de la clase
    public Main() {

    }
    public static void main(String[] args) {
        //Creamos el objeto Scanner
        Scanner consola = new Scanner(System.in);

        //final no puede heredar la clase
        //abstract se utiliza para una clase que no puede ser instanciada
        //static no se necesita instanciar

        Persona persona1 = new Persona();
        //nombre de la persona
        System.out.println(persona1.getNombre());
        persona1.setNombre("Daniel");
        System.out.println(persona1.getNombre());


        //apellido de la persona
        System.out.println(persona1.getApellido());
        persona1.setApellido("Bodoque");
        System.out.println(persona1.getApellido());

        //edad de la persona
        System.out.println(persona1.getEdad());
        persona1.setEdad(20);
        System.out.println(persona1.getEdad());

        metodoImprimir("Mau");
        metodoImprimir(persona1.nombre);
        metodoImprimir(String.valueOf(estatura));

    }



}