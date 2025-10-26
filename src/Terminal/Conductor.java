package Terminal;

public class Conductor {

    private String nombre;
    private String dni;
    private String licencia;
    private boolean autorizado;

    public Conductor(String nombre, String dni, String licencia) {
        this.nombre = nombre;
        this.dni = dni;
        this.licencia = licencia;
        this.autorizado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }
}