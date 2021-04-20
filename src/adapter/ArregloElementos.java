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
public interface ArregloElementos {
    
    public Elemento getElemento(String P);
    
    public void addElemento(Elemento elemento);
    
    public void listar();
}
