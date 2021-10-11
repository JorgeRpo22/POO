package poo.vehiculo.dominio.bici;

public class BicicletaMTB extends Bicicleta {
    @Override
    public void acelerar(int incremento) {
        System.out.println("Acelerando bici de montaña... 🚵️");
        this.velocidad += incremento / 2;
    }

    @Override
    public String toString() {
        return "MTB";
    }
}