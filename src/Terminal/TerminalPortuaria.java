package Terminal;

import java.time.LocalDateTime;

class TerminalPortuaria {

    public boolean permitirAcceso(Operacion operacion, LocalDateTime horaActual) {

        if (!operacion.estaAutorizado()) {
            System.out.println("Acceso denegado: camión o conductor no autorizado.");
            return false;
        }

        boolean resultado = operacion.validarAcceso(horaActual);

        if (!resultado) {
            System.out.println("Acceso denegado: fuera del horario permitido.");
        } else {
            System.out.println("Acceso autorizado.");
        }

        return resultado;
    }
}