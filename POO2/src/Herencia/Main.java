package Herencia;

public class Main {

    public static void main(String[] args){
    Alumno alumno=new Alumno();
    alumno.setNombre("Javier");
    alumno.setApellido("Arreguin");
    
    Maestro maestro=new Maestro();
    maestro.setNombre("Ricardo");
    maestro.setApellido("Perez");
    maestro.setClase("Matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Maestro " + maestro.getClase() + ": " + maestro.getNombre() + " " + maestro.getApellido());
    }
}
