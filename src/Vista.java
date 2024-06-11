public class Vista extends Cuenta{
    public Vista(Cliente cliente, String numCuenta) {
        super(cliente, "Vista", numCuenta);

    }

    @Override
    public String giro(int cantidad){

        this.saldo -= (300 + cantidad);
        return ("Giro $"+cantidad +" costo transaccion $300 "+toString());

    }
}
