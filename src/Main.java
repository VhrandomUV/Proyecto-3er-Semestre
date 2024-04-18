import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    Cliente cliente1 = new Cliente("Tito Soto", "12.345.678-9","Calle 1, 01", "+5691123123");
    Cuenta cuenta1 = crearCuenta(cliente1, "Ahorros");

        cuenta1.deposito(1000);
        cuenta1.giro(100);



    }
    public static Cuenta crearCuenta(Cliente cliente, String tipoCuenta){
        Cuenta cuenta = new Cuenta("001",cliente.nombre,tipoCuenta);

            cliente.cuentas = Arrays.copyOf(cliente.cuentas, cliente.cuentas.length + 1);
            cliente.cuentas[cliente.cuentas.length -1]= cuenta;

        System.out.println(cuenta.toString());


        return cuenta;
    }
}