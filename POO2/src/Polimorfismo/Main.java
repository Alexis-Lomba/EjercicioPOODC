package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Galletas miVicio[]=new Galletas[4];

        //polimorfismo
        miVicio[0]=new Galletas("Barritas","internacional","jovenes y niños");
        miVicio[1]=new GalletasCanelitas("Canelitas","internacional","jovenes y niños",30);
        miVicio[2]=new GalletasEmperador("Emperador","internacional","jovenes y niños",142);
        miVicio[3]=new GalletasPolvorones("Polvorones","internacional","jovenes y niños",14);

        for(Galletas galletas: miVicio){
            System.out.println(galletas.Detalles());
            System.out.println("");
        }
    }
}
