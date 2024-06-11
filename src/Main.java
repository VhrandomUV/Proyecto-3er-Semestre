import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException {

        HashMap<String, Cliente> mapaClientes = new HashMap<>();
        HashMap<String, Cuenta> mapaCuentas = new HashMap<>();
        List<String[]> transacciones = new ArrayList<>();

        Scanner lee = new Scanner(new BufferedReader(new FileReader("entrada.txt")));
        while (lee.hasNext()) {
            String[] info = lee.nextLine().split("\\|\\|");
            transacciones.add(info);
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy/HH:mm:ss:SSSSSSSS");
        transacciones.sort((a, b) -> {
            try {
                return sdf.parse(a[a.length - 1]).compareTo(sdf.parse(b[b.length - 1]));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        });

        PrintWriter writer = new PrintWriter(new FileWriter("salida.txt"));

        for (String[] info : transacciones) {
            String tipo = info[0];
            String output = "";
            switch (tipo) {
                case "Cliente":
                    String nombre = info[1];
                    String rut = info[2];
                    String direccion = info[3];
                    String telefono = info[4];
                    String fecha = info[5];
                    if (mapaClientes.containsKey(rut)) {
                        output = "Cliente ya existe";
                    } else {
                        Cliente cliente = new Cliente(nombre, rut, direccion, telefono);
                        mapaClientes.put(rut, cliente);
                        output = cliente.toString() + "||" + fecha;
                    }
                    writer.println(output);
                    break;
                case "Crear":
                    rut = info[5];
                    Cliente cliente = mapaClientes.get(rut);
                    String numCuenta = info[2];
                    Cuenta cuenta = null;
                    fecha = info[6];

                    if (Objects.equals(info[1], "Vista")) {
                        cuenta = new Vista(cliente, numCuenta);
                    } else if (Objects.equals(info[1], "Ahorros")) {
                        cuenta = new Ahorros(cliente, numCuenta);
                    } else if (Objects.equals(info[1], "Corriente")) {
                        cuenta = new Corriente(cliente, numCuenta);
                    }
                    mapaCuentas.put(numCuenta, cuenta);
                    output = cuenta.output(cliente, fecha);
                    writer.println(output);
                    break;

                case "Deposito":
                    numCuenta = info[2];
                    fecha = info[6];
                    Cuenta cuentaDep = mapaCuentas.get(numCuenta);
                    output = cuentaDep.deposito(Integer.parseInt(info[1])) + fecha;
                    writer.println(output);
                    break;

                case "Transferencia":
                    numCuenta = info[3];
                    fecha = info[7];
                    Cuenta cuentaTransf1 = mapaCuentas.get(numCuenta);
                    Cuenta cuentaTransf2 = mapaCuentas.get(info[2]);
                    output = cuentaTransf1.transferencia(Integer.parseInt(info[1]), cuentaTransf2) + fecha;
                    writer.println(output);
                    break;

                case "Giro":
                    numCuenta = info[2];
                    fecha = info[6];
                    Cuenta cuentaGiro = mapaCuentas.get(info[2]);
                    output = cuentaGiro.giro(Integer.parseInt(info[1])) + fecha;
                    writer.println(output);
                    break;
            }
        }
        writer.close();
        lee.close();
    }
}
