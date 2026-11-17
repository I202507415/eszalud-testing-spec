package com.eszalud.model;

public class Doctor {

    private final String documento;
    private final String nombres;
    private final String apellidos;
    private final String colegiatura;

    public Doctor(String documento,
                  String nombres,
                  String apellidos,
                  String colegiatura) {

        if (documento == null) {
            throw new IllegalArgumentException(
                    "El documento no puede ser null"
            );
        }

        if (nombres == null) {
            throw new IllegalArgumentException(
                    "Los nombres no pueden ser null"
            );
        }
        if (apellidos == null) {
            throw new IllegalArgumentException(
                    "Los apellidos no pueden ser null"
            );
        }


        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.colegiatura = colegiatura;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getColegiatura() {
        return colegiatura;
    }
}
