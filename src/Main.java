import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    Cliente cliente1 = new Cliente("Tito Soto", "12.345.678-9","Calle 1, 01", "+5691123123");
    Cuenta cuenta1 = new Cuenta(cliente1, "Ahorros", "001");

        cuenta1.deposito(1000);
        cuenta1.giro(100);


    }

}