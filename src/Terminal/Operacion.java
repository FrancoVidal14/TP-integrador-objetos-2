package Terminal;

import java.time.LocalDateTime;

abstract class Operacion {

    protected Camion camion;
    protected Conductor conductor;

    public Operacion(Camion camion, Conductor conductor) {
        this.camion = camion;
        this.conductor = conductor;
    }

    // Métodos comunes
    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public boolean estaAutorizado() {
        return camion.isAutorizado() && conductor.isAutorizado();
    }

    public abstract boolean validarAcceso(LocalDateTime horaActual);
}