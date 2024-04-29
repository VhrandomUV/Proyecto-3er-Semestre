public class Ahorros extends Cuenta{
    public Ahorros(Cliente cliente, String numCuenta) {
        super(cliente, "Ahorros", numCuenta);
    }

    @Override
    public void giro(int cantidad) {
        if(cantidad < 5000){
        this.saldo -= cantidad;
            System.out.println("Giro $"+cantidad +" "+toString());
        }
        else{
            System.out.println("Solo puedes rertirar >$5000");
        }
    }
}



