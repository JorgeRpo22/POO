package poo.desafio2.dominio;

public class Vendedor extends Directo{
    public static final long SALARIO_BASE_MENOR = 1000000;
    public static final double PORC_COMISION_5_5 = 0.055;
    public static final double PORC_COMISION_4_5 = 0.045;

    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;

    }

    public long calcularComision() {
        long comision = 0;
        if (this.getSalario() <= SALARIO_BASE_MENOR) {
            comision = (long)(ventasDelMes*PORC_COMISION_5_5);
        } else {
            comision = (long)(ventasDelMes*PORC_COMISION_4_5);
        }
        return comision;
    }

    @Override
    public long calcularSalario() {
        long saldo = super.calcularSalario() + calcularComision();
        return saldo;
    }
}