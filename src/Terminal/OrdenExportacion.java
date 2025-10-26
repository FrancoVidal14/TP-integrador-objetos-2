package Terminal;

import java.time.Duration;
import java.time.LocalDateTime;

class OrdenExportacion extends Operacion {

    private LocalDateTime turnoAsignado;
    private Shipper shipper;
    private Naviera naviera;

    public OrdenExportacion(Camion camion, Conductor conductor, LocalDateTime turnoAsignado, Shipper shipper, Naviera naviera) {
        super(camion, conductor);
        this.turnoAsignado = turnoAsignado;
        this.shipper = shipper;
        this.naviera = naviera;
    }

    public LocalDateTime getTurnoAsignado() { return turnoAsignado; }
    public void setTurnoAsignado(LocalDateTime turnoAsignado) { this.turnoAsignado = turnoAsignado; }

    public Shipper getShipper() { return shipper; }
    public void setShipper(Shipper shipper) { this.shipper = shipper; }

    public Naviera getNaviera() { return naviera; }
    public void setNaviera(Naviera naviera) { this.naviera = naviera; }

    @Override
    public boolean validarAcceso(LocalDateTime horaActual) {
        long diferenciaHoras = Math.abs(Duration.between(turnoAsignado, horaActual).toHours());
        return diferenciaHoras <= 3;
    }
}