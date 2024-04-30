public class Vista extends Cuenta{
    public Vista(Cliente cliente, String numCuenta) {
        super(cliente, "Vista", numCuenta);

    }

    @Override
    public void giro(int cantidad){

        this.saldo -= (300 + cantidad);
        System.out.println("Giro $"+cantidad +" costo transaccion $300 "+toString());

    }
}
