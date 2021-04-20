/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author krOzer
 */
public class AdaptadorArchivo implements ArregloElementos{
    

    int contador=0;
    private Connection con;
    private ConexionArchivo conec;
    
    
    @Override
    public Elemento getElemento(String p){
        conec = conec.getConexion("jdbc:derby://localhost:1527/ELEMENTO","ADMINISTRADOR","123456");
        con = conec.getConeccion();
        Elemento el = new Elemento();
        String dato = "";
        try{
            Statement ps = con.createStatement();
            ResultSet rs =ps.executeQuery("SELECT DATO FROM ADMINISTRADOR.DATO WHERE DATO = '"+p+"'");
            while(rs.next()){;
                System.out.println("Elemento: " +rs.getString(1));
                dato = rs.getString(1);

            }
        }catch(Exception e){
            System.err.println("Error al listar " + e);
        }
        el.setDato(dato);
        return el;
    }
    
    @Override
    public void listar(){
        conec = conec.getConexion("jdbc:derby://localhost:1527/ELEMENTO","ADMINISTRADOR","123456");
        con = conec.getConeccion();
        try{
            Statement ps = con.createStatement();
            ResultSet rs =ps.executeQuery("SELECT * FROM ADMINISTRADOR.DATO");
            while(rs.next()){;
                System.out.println("Elemento: " +rs.getString(1));

            }
        }catch(Exception e){
            System.err.println("Error al listar " + e);
        }
    }
    
    @Override
    public void addElemento(Elemento elemento){
        conec = conec.getConexion("jdbc:derby://localhost:1527/ELEMENTO","ADMINISTRADOR","123456");
        con = conec.getConeccion();
        try {
            java.sql.Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO ADMINISTRADOR.DATO (DATO) VALUES ('" + elemento.dato + "')");
        } catch (Exception e) {
        }
    }
}
