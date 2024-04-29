import java.util.Arrays;

public class Cuenta {
    private String numCuenta;
    private String titular;
    private int saldo;
    private String tipo;



    public void deposito(int cantidad) {
        this.saldo += cantidad;
        System.out.println("Deposito $"+cantidad +" "+toString());
    }

    public void giro(int cantidad){
        this.saldo -= cantidad;
        System.out.println("Giro $"+cantidad +" "+toString());
    }

    @Override
    public String toString() {
        return "{" +
                "numCuenta='" + numCuenta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=$" + saldo +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public Cuenta(Cliente cliente, String tipo, String numCuenta) {
        this.numCuenta= numCuenta;
        this.titular = cliente.nombre;
        this.tipo = tipo;
        cliente.cuentas.add(this);

        System.out.println("Crear: "+ tipo+" {"+
                "numCuenta='" + numCuenta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo+"}");
    }
}
