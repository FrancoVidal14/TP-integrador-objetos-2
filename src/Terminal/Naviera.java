package Terminal;


public class Naviera {

    private String nombre;
    private String pais;
    private String codigoIMO;

    public Naviera(String nombre, String pais, String codigoIMO) {
        this.nombre = nombre;
        this.pais = pais;
        this.codigoIMO = codigoIMO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getCodigoIMO() {
        return codigoIMO;
    }


}

