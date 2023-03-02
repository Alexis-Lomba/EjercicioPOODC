package Encapsulamiento;

public class Alumno {
    private int anioIngreso;
    private boolean paseDirecto;

    //se establece el año de ingreso con un set
    public void setAnioIngreso(int anioIngreso){
        this.anioIngreso=anioIngreso;
    }

    //se muestra la edad con un get
    public int getAnioIngreso(){
        return anioIngreso;
    }

    public boolean isPaseDirecto() {
        return paseDirecto;
    }

    public void setPaseDirecto(boolean paseDirecto) {
        this.paseDirecto = paseDirecto;
    }
}
