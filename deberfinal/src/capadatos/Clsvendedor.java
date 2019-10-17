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
public class Clsvendedor {
    int clvvendedor;
    String nomvendedor;
    String apellidovendedor;
    String dirvendedor;
    String telfvendedor;
    String celvendedor;
    public Clsvendedor ()
    {
        clvvendedor = 0;
        nomvendedor = null;
        apellidovendedor = null;
        dirvendedor = null;
        telfvendedor = null;
        celvendedor = null;
        
        
    }

    public int getClvclientes() {
        return clvvendedor;
    }

    public int getClvvendedor() {
        return clvvendedor;
    }

    public void setClvvendedor(int clvvendedor) {
        this.clvvendedor = clvvendedor;
    }

    public String getNomvendedor() {
        return nomvendedor;
    }

    public void setNomvendedor(String nomvendedor) {
        this.nomvendedor = nomvendedor;
    }

    public String getApellidovendedor() {
        return apellidovendedor;
    }

    public void setApellidovendedor(String apellidovendedor) {
        this.apellidovendedor = apellidovendedor;
    }

    public String getDirvendedor() {
        return dirvendedor;
    }

    public void setDirvendedor(String dirvendedor) {
        this.dirvendedor = dirvendedor;
    }

    public String getTelfvendedor() {
        return telfvendedor;
    }

    public void setTelfvendedor(String telfvendedor) {
        this.telfvendedor = telfvendedor;
    }

    public String getCelvendedor() {
        return celvendedor;
    }

    public void setCelvendedor(String celvendedor) {
        this.celvendedor = celvendedor;
    }

    
    
    public void leer (ResultSet vendedor) throws SQLException
         {
             
             clvvendedor = vendedor.getInt("clvvendedor");
             nomvendedor = vendedor.getString("nomvendedor");
       apellidovendedor = vendedor.getString("apellidovendedor");
        dirvendedor = vendedor.getString("dirvendedor");
        telfvendedor = vendedor.getString("telfvendedor");
        celvendedor = vendedor.getString("celvendedor");
       
       
        
         }
    
}
