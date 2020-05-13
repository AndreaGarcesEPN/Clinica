package Programa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public class Paciente {
    
    private int numPaciente;
    private String estadoPaciente;
    private String apellido1;
    private String apellido2;
    private String nombre;
    private String nombreCompleto;
    private int historiaClinica;
    private String sexo;
    private String fechaNacimiento;
    private int edad;
    private String grupoSanguineo;
    private String cedula;
    private String telefono;
    private String celular;
    private String direccion;
    private String provincia;
    private String email;
    private String observaciones;
    private String antPersonales;
    private String antFamiliares;
    private String alergias;
    private String vacunas;
    private String ocupacion;
    private String instruccion;

    public Paciente(String estadoPaciente, String apellido1, String apellido2, String nombre, String nombreCompleto, int historiaClinica, String sexo, String fechaNacimiento, int edad, String grupoSanguineo, String cedula, String telefono, String celular, String direccion, String provincia, String email, String observaciones, String antPersonales, String antFamiliares, String alergias, String vacunas, String ocupacion, String instruccion) {
        this.estadoPaciente = estadoPaciente;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre = nombre;
        this.nombreCompleto = nombreCompleto;
        this.historiaClinica = historiaClinica;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.grupoSanguineo = grupoSanguineo;
        this.cedula = cedula;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.provincia = provincia;
        this.email = email;
        this.observaciones = observaciones;
        this.antPersonales = antPersonales;
        this.antFamiliares = antFamiliares;
        this.alergias = alergias;
        this.vacunas = vacunas;
        this.ocupacion = ocupacion;
        this.instruccion = instruccion;
    }

    @Override
    public String toString() {
        return cedula + "', '" + estadoPaciente + "', '" + apellido1 + "', '" + apellido2 + "', '" + nombre + "', '" + nombreCompleto + "', " + historiaClinica + ", '" + sexo + "', '" + fechaNacimiento + "', " + edad + ", '" + grupoSanguineo + "', '" + telefono + "', '" + celular + "', '" + direccion + "', '" + provincia + "', '" + email + "', '" + observaciones + "', '" + antPersonales + "', '" + antFamiliares + "', '" + alergias + "', '" + vacunas + "', '" + ocupacion + "', '" + instruccion + "');";
    }

    public int getNumPaciente() {
        return numPaciente;
    }

    public void setNumPaciente(int numPaciente) {
        this.numPaciente = numPaciente;
    }

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(int historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAntPersonales() {
        return antPersonales;
    }

    public void setAntPersonales(String antPersonales) {
        this.antPersonales = antPersonales;
    }

    public String getAntFamiliares() {
        return antFamiliares;
    }

    public void setAntFamiliares(String antFamiliares) {
        this.antFamiliares = antFamiliares;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }
    
}
