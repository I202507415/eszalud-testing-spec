package com.eszalud.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoctorTest {

    @Test
    @DisplayName("DOC-001: Crear doctor con datos válidos")
    void shouldCreateDoctorWithValidData() {

        Doctor doctor = new Doctor(
                "12345678",
                "Carlos",
                "Ramírez",
                "CMP12345"
        );

        assertNotNull(doctor);
        assertEquals("12345678", doctor.getDocumento());
        assertEquals("Carlos", doctor.getNombres());
        assertEquals("Ramírez", doctor.getApellidos());
        assertEquals("CMP12345", doctor.getColegiatura());


    }

    @Test
    @DisplayName("DOC-002: Crear doctor sin documento")
    void shouldRejectDoctorWithNullDocument() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Doctor(
                    null,
                    "Carlos",
                    "Ramírez",
                    "CMP12345"
            );
        });
    }



}
