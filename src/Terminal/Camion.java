package Terminal;

public class Camion {

    private String patente;
    private double capacidadToneladas;
    private boolean autorizado;

    public Camion(String patente, double capacidadToneladas) {
        this.patente = patente;
        this.capacidadToneladas = capacidadToneladas;
        this.autorizado = false;
    }

    public String getPatente() {
        return patente;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }
}