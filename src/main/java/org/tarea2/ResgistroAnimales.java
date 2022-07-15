package org.tarea2;


import java.util.Stack;


public class ResgistroAnimales {
    private static Stack<Animales> pila = new Stack<>();

    //Desarrollo de contructores
    public ResgistroAnimales(){}

    public ResgistroAnimales(Stack<Animales> a){
        pila = a;

    }

    public void registro(Animales a){
        pila.push(a);
    }

    public void obtenerRegistrosId() {
        while (!pila.isEmpty()) {
            System.out.println(pila.pop().getIdAnimales());
        }

    }

    public void obtenerRegistrosCompleto(){
        while(!pila.isEmpty()){
            System.out.println(pila.pop().getDescripcion());
        }
    }

    public void obtenerRegistrosPeek(){
        System.out.println(pila.peek());
    }

    public void eliminarRegistro(){
        pila.pop();
    }



}
