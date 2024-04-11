import java.util.ArrayList;

public class Cliente {
    public String nombre;

    public String rut;
    public  String direccion;
    public  String numTelefono;

    public Cuenta[] cuentas = new Cuenta[0];


    public Cliente(String nombre, String rut , String direccion, String numTelefono) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.numTelefono = numTelefono;

    }
}
