package com.example.ServidorSura5.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="medicos")
public class Medico
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id;
    private String nombre; //35 CARACTERES Y SOLO LETRS
    private String matriculaProfesional; //20 CARACTERES
    private String especialidad; //20 CARACTERES.
    private Integer salario; //SOLO POSITIVOS MENOS DE 10 MEGAS Y MAXIMO 20
    private String ips; //50 CARACTERES
    private String correo; //@SURA.COM.CO
    private String telefono; //12 CARACTERES
    private String direccionConsultorio; //50 CARACTERES
    private Boolean finDeSemanaDisponible;

    public Medico()
    {
    }

    public Medico(long id, String nombre, String matriculaProfesional, String especialidad, Integer salario, String ips, String correo, String telefono, String direccionConsultorio, Boolean finDeSemanaDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.matriculaProfesional = matriculaProfesional;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccionConsultorio = direccionConsultorio;
        this.finDeSemanaDisponible = finDeSemanaDisponible;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public void setMatriculaProfesional(String matriculaProfesional) {
        this.matriculaProfesional = matriculaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccionConsultorio() {
        return direccionConsultorio;
    }

    public void setDireccionConsultorio(String direccionConsultorio) {
        this.direccionConsultorio = direccionConsultorio;
    }

    public Boolean getFinDeSemanaDisponible() {
        return finDeSemanaDisponible;
    }

    public void setFinDeSemanaDisponible(Boolean finDeSemanaDisponible) {
        this.finDeSemanaDisponible = finDeSemanaDisponible;
    }
}
