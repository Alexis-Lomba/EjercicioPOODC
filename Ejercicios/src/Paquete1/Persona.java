package Paquete1;

public class Persona {
    public String nombre = "Carlos";
    protected String apellido = "Zapata";
    private int edad = 24;
    public static double estatura = 1.70;

    public static void metodoImprimir(String arg1){
        System.out.println("Hola " + arg1 + " desde el metodo estatico");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
