package org.tarea2;

import java.util.LinkedList;
import java.util.Queue;

public class RegistroAdopciones {

    Queue<Adopciones> registroAdopciones = new LinkedList<>();

    public void agregarAdopciones(Adopciones a){
        registroAdopciones.offer(a);
    }

    public void mostrarAdopciones(){
        registroAdopciones.poll();
    }

    public void eliminarAdopciones(){
        registroAdopciones.poll();
    }




}
