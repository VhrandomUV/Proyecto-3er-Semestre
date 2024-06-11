import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Cuenta {
    private String numCuenta;
    private String titular;
    protected int saldo;
    private String tipo;



    public String transferencia(int cantidad, Cuenta destino) {
        this.saldo -= cantidad;
        destino.saldo += cantidad;
        return "Transferencia||" +cantidad +"|| Destino "+destino.numCuenta + "||"+toString();
    }

    public String deposito(int cantidad ){
        this.saldo += cantidad;
        return  "Deposito||"+ cantidad+ "||"+toString();
    }
    public String giro(int cantidad){
        this.saldo -= cantidad;
        return "Giro||"+cantidad +"||"+toString();
    }

    @Override
    public String toString() {
        return numCuenta + "||" + titular + "||" + saldo +"||"+ tipo + "||";
    }

    public Cuenta(Cliente cliente, String tipo, String numCuenta) {
        this.numCuenta= numCuenta;
        this.titular = cliente.getNombre();
        this.tipo = tipo;
        cliente.getCuentas().add(this);



    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }



    public String output(Cliente cliente, String fecha){
        return "Crear||"+this.tipo +"||"+this.numCuenta+"||$" + this.saldo +"||"+ this.titular+ "||" + cliente.getRut() +"||"+ fecha;
    }


}
