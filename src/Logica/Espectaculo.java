package Logica;

import java.time.LocalDate;

public class Espectaculo {

    private String codEspectaculo;
    private String nombreEspectaculo;
    private String genero;
    private LocalDate fechaEspectaculo;
    private int numeroEntradas;

    public Espectaculo(String codEspectaculo, String nombreEspectaculo, String genero, LocalDate fechaEspectaculo,
            int numeroEntradas) {
        this.codEspectaculo = codEspectaculo;
        this.nombreEspectaculo = nombreEspectaculo;
        this.genero = genero;
        this.fechaEspectaculo = fechaEspectaculo;
        this.numeroEntradas = numeroEntradas;
    }

    public String getCodEspectaculo() {
        return codEspectaculo;
    }

    public void setCodEspectaculo(String codEspectaculo) {
        this.codEspectaculo = codEspectaculo;
    }

    public String getNombreEspectaculo() {
        return nombreEspectaculo;
    }

    public void setNombreEspectaculo(String nombreEspectaculo) {
        this.nombreEspectaculo = nombreEspectaculo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFechaEspectaculo() {
        return fechaEspectaculo;
    }

    public void setFechaEspectaculo(LocalDate fechaEspectaculo) {
        this.fechaEspectaculo = fechaEspectaculo;
    }

    public int getNumeroEntradas() {
        return numeroEntradas;
    }

    public void setNumeroEntradas(int numeroEntradas) {
        this.numeroEntradas = numeroEntradas;
    }

}
