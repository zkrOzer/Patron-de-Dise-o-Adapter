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
public class Arreglo implements ArregloElementos{
    
    Elemento[] elementos = new Elemento[10];
    int contador=0;
    
    @Override
    public Elemento getElemento(String p){
        
        
        for(int i = 0 ; i < contador ; i++){
            if(elementos[i].dato.equalsIgnoreCase(p))
                return elementos[i];
        }  
        System.out.println("No se encontro el elemento");
        return null;
        
    }
    
    @Override
    public void listar(){

        for(int i = 0 ; i < contador ; i++){
            System.out.println("Elemento: " + elementos[i].dato);
        }  
    }
    
    @Override
    public void addElemento(Elemento elemento){
        elementos[contador] = elemento;
        contador++;
    }
}
