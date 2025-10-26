package Terminal;
import java.util.ArrayList;
import java.util.List;


public class EmpresaTransportista {

    private String razonSocial;
    private String cuit;
    private List<Camion> camiones;
    private List<Conductor> conductores;

    public EmpresaTransportista(String razonSocial, String cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.camiones = new ArrayList<>();
        this.conductores = new ArrayList<>();
    }

    public void agregarCamion(Camion camion) {
        this.camiones.add(camion);
    }

    public void agregarConductor(Conductor conductor) {
        this.conductores.add(conductor);
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public List<Camion> getCamiones() {
        return camiones;
    }

    public void addCamion(Camion camion) {
        this.camiones.add(camion);
    }

    public List<Conductor> getConductores() {
        return conductores;
    }

    public void addConductores(Conductor conductor) {
        this.conductores.add(conductor);
    }
}
