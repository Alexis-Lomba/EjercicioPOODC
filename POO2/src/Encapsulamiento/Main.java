package Encapsulamiento;

public class Main {
    public static void main(String[] args) {
    Alumno alumno=new Alumno();

    alumno.setAnioIngreso(2023);
        System.out.println("El alumno ingreso en el año: " + alumno.getAnioIngreso());

        alumno.setPaseDirecto(true);
        System.out.println("Fue por pase directo? " + alumno.isPaseDirecto());
    }
}
