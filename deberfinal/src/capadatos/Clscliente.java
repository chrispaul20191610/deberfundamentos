/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Clscliente {
    int clvclientes;
    String nomcliente;
    String apellcliente;
    String fecclientes;
    String dirclientes;
    String telfclientes;
    String celclientes;
    String emailclientes;
    
   
    
    public Clscliente ()
    {
        clvclientes = 0;
        nomcliente = null;
        apellcliente = null;
        fecclientes = null;
        dirclientes = null;
        telfclientes = null;
        celclientes = null;
        emailclientes = null;
        
    }

    public int getClvclientes() {
        return clvclientes;
    }

    public void setClvclientes(int clvclientes) {
        this.clvclientes = clvclientes;
    }

    public String getNomcliente() {
        return nomcliente;
    }

    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
    }

    public String getApellcliente() {
        return apellcliente;
    }

    public void setApellcliente(String apellcliente) {
        this.apellcliente = apellcliente;
    }

    public String getFecclientes() {
        return fecclientes;
    }

    public void setFecclientes(String fecclientes) {
        this.fecclientes = fecclientes;
    }

    public String getDirclientes() {
        return dirclientes;
    }

    public void setDirclientes(String dirclientes) {
        this.dirclientes = dirclientes;
    }

    public String getTelfclientes() {
        return telfclientes;
    }

    public void setTelfclientes(String telfclientes) {
        this.telfclientes = telfclientes;
    }

    public String getCelclientes() {
        return celclientes;
    }

    public void setCelclientes(String celclientes) {
        this.celclientes = celclientes;
    }

    public String getEmailclientes() {
        return emailclientes;
    }

    public void setEmailclientes(String emailclientes) {
        this.emailclientes = emailclientes;
    }
    
    
    public void leer (ResultSet cliente) throws SQLException
         {
             
          
             clvclientes = cliente.getInt("clvcliente");
        nomcliente = cliente.getString("nomcliente");
        apellcliente = cliente.getString("apellcliente");
        fecclientes = cliente.getString("fecclientes");
        dirclientes = cliente.getString("dircliente");
        telfclientes = cliente.getString("telfclientes");
        celclientes = cliente.getString("celclientes");
        emailclientes = cliente.getString("emailclientes");
         }
    
     
    
}
