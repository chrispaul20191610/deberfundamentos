/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Clsproductos {
    
   int clvprosucto;
    String nomproducto;
    String precioproducto;
    String cantproducto;
    String unidadproducto;
    
    public Clsproductos ()
    {
        nomproducto = null;
        precioproducto = null;
        cantproducto= null;
        unidadproducto  = null;
        
    }

    public String getNomproducto() {
        return nomproducto;
    }

    public void setNomproducto(String nomproducto) {
        this.nomproducto = nomproducto;
    }

    public String getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(String precioproducto) {
        this.precioproducto = precioproducto;
    }

    public String getCantproducto() {
        return cantproducto;
    }

    public void setCantproducto(String cantproducto) {
        this.cantproducto = cantproducto;
    }

    public String getUnidadproducto() {
        return unidadproducto;
    }

    public void setUnidadproducto(String unidadproducto) {
        this.unidadproducto = unidadproducto;
    }

    public int getClvprosucto() {
        return clvprosucto;
    }

    public void setClvprosucto(int clvprosucto) {
        this.clvprosucto = clvprosucto;
    }
    
    
    
     public void leer (ResultSet producto) throws SQLException
         {
             clvprosucto = producto.getInt("clvprosucto");
             nomproducto =  producto.getString("nomproducto");
             precioproducto = producto.getString("precioproducto");
             cantproducto= producto.getString("cantproducto");
             unidadproducto = producto.getString("unidadproducto");
             
       
       
        
         }
    
}
