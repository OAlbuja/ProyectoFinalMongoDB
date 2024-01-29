package com.bezkoder.spring.data.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Socio")
public class Tutorial {
  @Id
  private String id;

  private String nombre;
  private String apellido;
  private String cedula;
  private String tipoDeLicencia;
  private boolean published;
  private Direccion direccion;

  // Constructor, getters y setters

  public Tutorial() {
  }

  public Tutorial(String nombre, String apellido, String cedula, String tipoDeLicencia, boolean published, Direccion direccion) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.cedula = cedula;
    this.tipoDeLicencia = tipoDeLicencia;
    this.published = published;
    this.direccion = direccion;
  }

  public static class Direccion {
    private String sector;
    private String callePrincipal;
    private String calleSecundaria;
    private String numero;

    public Direccion() {
    }

    public Direccion(String sector, String callePrincipal, String calleSecundaria, String numero) {
      this.sector = sector;
      this.callePrincipal = callePrincipal;
      this.calleSecundaria = calleSecundaria;
      this.numero = numero;
    }

    // Getters
    public String getSector() {
      return sector;
    }

    public String getCallePrincipal() {
      return callePrincipal;
    }

    public String getCalleSecundaria() {
      return calleSecundaria;
    }

    public String getNumero() {
      return numero;
    }

    // Setters
    public void setSector(String sector) {
      this.sector = sector;
    }

    public void setCallePrincipal(String callePrincipal) {
      this.callePrincipal = callePrincipal;
    }

    public void setCalleSecundaria(String calleSecundaria) {
      this.calleSecundaria = calleSecundaria;
    }

    public void setNumero(String numero) {
      this.numero = numero;
    }

    @Override
    public String toString() {
      return "Direccion [sector=" + sector + ", callePrincipal=" + callePrincipal +
          ", calleSecundaria=" + calleSecundaria + ", numero=" + numero + "]";
    }
  }

  // Getters y setters para los nuevos atributos
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getCedula() {
    return cedula;
  }

  public void setCedula(String cedula) {
    this.cedula = cedula;
  }

  public String getTipoDeLicencia() {
    return tipoDeLicencia;
  }

  public void setTipoDeLicencia(String tipoDeLicencia) {
    this.tipoDeLicencia = tipoDeLicencia;
  }
  public boolean isPublished() {
    return published;
  }

  public void setPublished(boolean isPublished) {
    this.published = isPublished;
  }

  public Direccion getDireccion() {
    return direccion;
  }

  public void setDireccion(Direccion direccion) {
    this.direccion = direccion;
  }

  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
        + ", tipoDeLicencia=" + tipoDeLicencia + ", published=" + published + ", direccion=" + direccion + "]";
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
