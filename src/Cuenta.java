import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Cuenta {
    private String numCuenta;
    private String titular;
    protected int saldo;
    private String tipo;



    public void transferencia(int cantidad, Cuenta destino) {
        this.saldo -= cantidad;
        destino.saldo += cantidad;
        System.out.println("Transferencia||$"+cantidad +"|| Destino "+destino.numCuenta + "||"+toString());
    }

    public void deposito(int cantidad ){
        this.saldo += cantidad;
        System.out.println("Deposito||$"+ cantidad+ "||"+toString());
    }
    public void giro(int cantidad){
        this.saldo -= cantidad;
        System.out.println("Giro||$"+cantidad +"||"+toString());
    }

    @Override
    public String toString() {
        return numCuenta + "||" + titular + "||" + saldo +"||"+ tipo + "||"+ getDate()  ;
    }

    public Cuenta(Cliente cliente, String tipo, String numCuenta) {
        this.numCuenta= numCuenta;
        this.titular = cliente.getNombre();
        this.tipo = tipo;
        cliente.getCuentas().add(this);


        System.out.println( "Crear "+this.tipo +"||"+this.numCuenta+"||$" + this.saldo +"||"+ this.titular+ "||" + cliente.getRut() +"||"+ getDate());

    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getDate(){
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy/HH:mm:ss:nn");
        String formattedDate = fecha.format(myFormatObj);
        return  formattedDate;
    }
}
