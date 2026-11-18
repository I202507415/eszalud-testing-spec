package com.eszalud.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
public class CitaMedicaTest {
    @Test
    @DisplayName("CIT-001: Crear cita médica con datos válidos")
    void shouldCreateMedicalAppointmentWithValidData() {

        LocalDateTime fechaHora =
                LocalDateTime.of(2026, 11, 23, 16, 30);

        CitaMedica cita = new CitaMedica(
                "PAC001",
                "DOC001",
                "ESP001",
                fechaHora,
                "PROGRAMADA"
        );

        assertNotNull(cita);

        assertAll(
                () -> assertEquals("PAC001", cita.getIdPaciente()),
                () -> assertEquals("DOC001", cita.getIdDoctor()),
                () -> assertEquals("ESP001", cita.getIdEspecialidad()),
                () -> assertEquals(fechaHora, cita.getFechaHora()),
                () -> assertEquals("PROGRAMADA", cita.getEstado())
        );
    }
}