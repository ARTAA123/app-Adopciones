package org.tarea2;

import java.util.UUID;

public class Adopciones {

    private UUID DNI;
    private String nombre;
    private boolean certificacion;
    private String domicilio;
    private double costo;

    public Adopciones(){

    }

    // Constructor Adopciones
    public Adopciones(UUID dni,
                      String nombre,
                      boolean certificacion,
                      String direccion,
                      double precio){
        setDNI(dni);
        setNombre(nombre);
        setCertificacion(certificacion);
        setDomicilio(direccion);
        setCosto(precio);
    }

    public UUID getDNI() {
        return DNI;
    }

    public void setDNI(UUID DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCertificacion() {
        return certificacion;
    }

    public void setCertificacion(boolean certificacion) {
        this.certificacion = certificacion;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
