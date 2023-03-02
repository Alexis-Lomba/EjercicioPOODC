package Polimorfismo;

public class GalletasCanelitas extends Galletas{
    private int gramos;

    public GalletasCanelitas(String marca, String nivDistrib, String consumidores, int gramos) {
        super(marca, nivDistrib, consumidores);
        this.gramos = gramos;
    }

    public int getGramos() {
        return gramos;
    }

    public String Detalles(){
    return "Marca: "+nombre+"\nNivel de distribucion: "+nivDistrib+"\nConsumidores: "+consumidores+
        "\nGramos por paquete: "+gramos;
    }
}
