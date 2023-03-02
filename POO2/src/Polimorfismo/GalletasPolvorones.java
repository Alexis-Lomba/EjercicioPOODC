package Polimorfismo;

public class GalletasPolvorones extends Galletas{
    private int precio;

    public GalletasPolvorones(String marca, String nivDistrib, String consumidores, int precio) {
        super(marca, nivDistrib, consumidores);
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
    public String Detalles(){
        return "Marca: "+nombre+"\nNivel de distribucion: "+nivDistrib+"\nConsumidores: "+consumidores+
                "\nPrecio del paquete: "+precio;

    }
}
