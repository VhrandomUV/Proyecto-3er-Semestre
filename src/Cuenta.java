public class Cuenta {
    public String numCuenta;
    public String titular;
    public int saldo;
    public String tipo;

    public Cuenta(String numCuenta, String titular, String tipo) {
        this.numCuenta = numCuenta;
        this.titular = titular;

        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numCuenta='" + numCuenta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
