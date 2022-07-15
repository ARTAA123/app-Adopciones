package org.tarea2;

public class Animales {

        private int idAnimales;
        private String descripcion;

        public Animales(int identificacion, String descripcion){
            setIdAnimales(identificacion);
            setDescripcion(descripcion);
        }

    public int getIdAnimales() {
        return idAnimales;
    }

    public void setIdAnimales(int idAnimales) {
        this.idAnimales = idAnimales;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
