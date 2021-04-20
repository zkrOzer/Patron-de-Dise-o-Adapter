/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author krOzer
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArregloElementos ar = new AdaptadorArchivo();
        Elemento e = new Elemento();
        e.setDato("Prueba Bd");
        ar.addElemento(e);
        
        Elemento e2 = new Elemento();
        e2.setDato("Martinez Morales Josue Ysai");
        ar.addElemento(e2);
        
        ar.listar();

        
    }
    
}
