/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;
/**
 *
 * @author Anitta
 */
import java.util.Stack;
public class Pila {

    /**
     * @param args the command line arguments
     */
     //Push agrega dato
        //Pop estraer pila
        //Peek ver ultimo dato de la pila
        //Empty saber si tiene o no tiene datos la pila
    public static void main(String[] args) {
       Stack pila = new Stack ();
       pila.push("juan");
       pila.push(50);
       pila.push("cadena");
       pila.push(49);
       pila.push(51);
       pila.pop();
       pila.pop();
       pila.push(100.5);
       System.out.println("El ultimo elemento de la pila es: " +pila.peek());
       while(pila.empty()==false)
       {
           System.out.println(pila.pop());
       }
        
    }
    
}
