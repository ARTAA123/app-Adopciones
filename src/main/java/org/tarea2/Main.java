package org.tarea2;

public class Main {
    public static void main(String[] args) {
        Animales id1 = new Animales(1, "Mamiferos");
        Animales id2 = new Animales(2, "Rectiles");
        Animales id3 = new Animales(3, "Peces");

        ResgistroAnimales registros = new ResgistroAnimales();
        registros.registro(id1);
        registros.registro(id2);
        registros.registro(id3);

        //registros.obtenerRegistrosId();
        //registros.obtenerRegistrosCompleto();
        registros.obtenerRegistrosPeek();
    }
}