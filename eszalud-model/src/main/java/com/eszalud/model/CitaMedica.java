package com.eszalud.model;

import java.time.LocalDateTime;

public class CitaMedica {
    private final String idPaciente;
    private final String idDoctor;
    private final String idEspecialidad;
    private final LocalDateTime fechaHora;
    private final String estado;

    public CitaMedica(
            String idPaciente,
            String idDoctor,
            String idEspecialidad,
            LocalDateTime fechaHora,
            String estado
    ) {

        if (idPaciente == null) {
            throw new IllegalArgumentException(
                    "El identificador del paciente no puede ser null"
            );
        }
        if (idDoctor == null) {
            throw new IllegalArgumentException(
                    "El identificador del doctor no puede ser null"
            );
        }
        if (idEspecialidad == null) {
            throw new IllegalArgumentException(
                    "El identificador de la especialidad no puede ser null"
            );
        }
        if (fechaHora == null) {
            throw new IllegalArgumentException(
                    "La fecha y hora de la cita no puede ser null"
            );
        }

        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
        this.idEspecialidad = idEspecialidad;
        this.fechaHora = fechaHora;
        this.estado = (estado == null) ? "PROGRAMADA" : estado;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public String getIdEspecialidad() {
        return idEspecialidad;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getEstado() {
        return estado;
    }
}