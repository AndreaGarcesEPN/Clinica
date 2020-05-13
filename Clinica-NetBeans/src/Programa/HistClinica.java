/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author Andrea
 */
public class HistClinica {
    
    private String cedula;
    private String nombreCompleto;
    private String fechaH;
    private String anamnesis;
    private String exploracion;
    private String diagnostico;
    private String tratamiento;

    public HistClinica(String cedula, String nombreCompleto, String fechaH, String anamnesis, String exploracion, String diagnostico, String tratamiento) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.fechaH = fechaH;
        this.anamnesis = anamnesis;
        this.exploracion = exploracion;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    @Override
    public String toString() {
        return "'" + cedula + "', '" + nombreCompleto + "', '" + fechaH + "', '" + anamnesis + "', '" + exploracion + "', '" + diagnostico + "', '" + tratamiento + "');";
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getFechaH() {
        return fechaH;
    }

    public void setFechaH(String fechaH) {
        this.fechaH = fechaH;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getExploracion() {
        return exploracion;
    }

    public void setExploracion(String exploracion) {
        this.exploracion = exploracion;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }  
}
