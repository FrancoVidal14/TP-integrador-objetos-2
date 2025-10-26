package Terminal;

import java.time.Duration;
import java.time.LocalDateTime;

class OrdenImportacion extends Operacion {

    private LocalDateTime fechaDisponible;
    private Consignee consignee;
    private Naviera naviera;

    public OrdenImportacion(Camion camion, Conductor conductor, LocalDateTime fechaDisponible, Consignee consignee, Naviera naviera) {
        super(camion, conductor);
        this.fechaDisponible = fechaDisponible;
        this.consignee = consignee;
        this.naviera = naviera;
    }

    public LocalDateTime getFechaDisponible() { return fechaDisponible; }
    public void setFechaDisponible(LocalDateTime fechaDisponible) { this.fechaDisponible = fechaDisponible; }

    public Consignee getConsignee() { return consignee; }
    public void setConsignee(Consignee consignee) { this.consignee = consignee; }

    public Naviera getNaviera() { return naviera; }
    public void setNaviera(Naviera naviera) { this.naviera = naviera; }

    @Override
    public boolean validarAcceso(LocalDateTime horaActual) {
        long diferenciaHoras = Duration.between(fechaDisponible, horaActual).toHours();
        return diferenciaHoras <= 24 && diferenciaHoras >= 0;
    }
}