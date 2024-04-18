import java.util.Arrays;

public class Cuenta {
    private String numCuenta;
    private String titular;
    private int saldo;
    private String tipo;

    public Cuenta(String numCuenta, String titular, String tipo) {
        this.numCuenta = numCuenta;
        this.titular = titular;

        this.tipo = tipo;
    }

    public void deposito(int cantidad) {
        this.saldo += cantidad;
        System.out.println(toString());
    }

    public void giro(int cantidad){
        this.saldo -= cantidad;
        System.out.println(toString());
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

    public Cuenta(Cliente cliente, String tipo) {
        this.numCuenta= "001";
        this.titular = cliente.nombre;
        this.tipo = tipo;
        cliente.cuentas = Arrays.copyOf(cliente.cuentas, cliente.cuentas.length + 1);
        cliente.cuentas[cliente.cuentas.length -1]= this;

        System.out.println("Crear: "+ tipo+" {"+
                "numCuenta='" + numCuenta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo+"}");
    }
}
