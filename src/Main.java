public class Main {
    public static void main(String[] args) {

    Cliente cliente1 = new Cliente("Tito Soto", "12.345.678-9","Calle 1, 01", "+5691123123");
    Cuenta cuenta1 = new Ahorros(cliente1, "001");
    Cuenta cuenta2 = new Vista(cliente1, "002");


        cuenta1.deposito(10000);

        cuenta1.transferencia(1000, cuenta2);
        cuenta1.giro(100);

        cliente1.infoCliente();

    }

}