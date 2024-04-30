public abstract class Cuenta {
    private String numCuenta;
    private String titular;
    protected int saldo;
    private String tipo;



    public void transferencia(int cantidad, Cuenta destino) {
        this.saldo -= cantidad;
        destino.saldo += cantidad;
        System.out.println("Deposito $"+cantidad +" Destino "+destino.numCuenta+toString());
    }

    public void deposito(int cantidad ){
        this.saldo += cantidad;
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





    }
}
