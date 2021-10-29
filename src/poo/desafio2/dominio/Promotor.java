package poo.desafio2.dominio;

public class Promotor extends Empleado{
    public static final int VALOR_COMISION_POR_COMPRA_CON_VOLANTE = 17000;

    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;

    public Promotor(String nombre, int volantesRepartidos, long valorVolante, int comprasVolante) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }

    @Override
    public long calcularSalario() {
        long saldo = (volantesRepartidos*valorVolante)+(comprasVolante*VALOR_COMISION_POR_COMPRA_CON_VOLANTE);
        return saldo;
    }
}