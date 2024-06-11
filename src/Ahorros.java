public class Ahorros extends Cuenta{
    public Ahorros(Cliente cliente, String numCuenta) {
        super(cliente, "Ahorros", numCuenta);
    }

    @Override
    public String giro(int cantidad) {
        if(cantidad < 5000){
        this.saldo -= cantidad;
            return  "Giro $"+cantidad +" "+toString();
        }
        else{
            return  "Solo puedes rertirar >$5000";
        }
    }
}
