import java.util.ArrayList;

public class Cliente {
    protected String nombre;

    private String rut;
    private   String direccion;
    private   String numTelefono;

    protected Cuenta[] cuentas = new Cuenta[0];


    public Cliente(String nombre, String rut , String direccion, String numTelefono) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.numTelefono = numTelefono;

    }
}
