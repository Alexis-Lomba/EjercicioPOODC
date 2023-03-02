package Ejercicios.herencia;

public class Prueba {
    public static void main(String[] args) {

        ClaseHija_Chef chef1 = new ClaseHija_Chef("Miguel", "Zapata", 1.75, "Gusteau");
        chef1.impresionDatosChef("Miguel", "Zapata", 1.75, "Gusteau");
        System.out.println(chef1.saludoPersona("Miguel", "Zapata"));

        ClaseHija_Profesor profesor1 = new ClaseHija_Profesor("Emiliano", "Flores", 1.70, "No.12");
        profesor1.impresionDatosProfesor("Emiliano","Flores",1.70,"No.12");
        System.out.println(profesor1.saludoPersona("Emiliano","Zapata"));

    }
}
