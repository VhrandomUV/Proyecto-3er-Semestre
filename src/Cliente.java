import java.util.ArrayList;

public class Cliente {
    private String nombre;

    private String rut;
    private   String direccion;
    private   String numTelefono;

    //protected Cuenta[] cuentas = new Cuenta[0];
    private ArrayList <Cuenta> cuentas = new ArrayList<Cuenta>();


    public Cliente(String nombre, String rut , String direccion, String numTelefono) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.numTelefono = numTelefono;

    }



    @Override
    public String toString() {
        return "Cliente||" +
                 nombre +
                " " + rut +
                "||" + direccion +
                " " + numTelefono +
                "||cuentas\n" + getCuentas() ;
    }

    public void infoCliente(){
        System.out.println(toString());
    }


    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
}
