/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class RegVendedores {
     private int _claveVendedor;
    private String _nomVendedor;
    private String _apellVendedor;
    private String _dirVendedor;
    private String _tlfVendedor;
    private String _celVendedor;
    
    
    public RegVendedores(){
       _claveVendedor=0;
      _nomVendedor=null;
    _apellVendedor=null;
     _dirVendedor=null;
     _tlfVendedor=null;
     _celVendedor=null;
    }
    public void leer(ResultSet cliente) throws SQLException{
     _claveVendedor=cliente.getInt("claveVendedor");
     _nomVendedor=cliente.getString("nomVendedor");
     _apellVendedor=cliente.getString("apellVendedor");
     _dirVendedor=cliente.getString("dirVendedor");
     _tlfVendedor=cliente.getString("tlfVendedor");
    _celVendedor=cliente.getString("celVendedor");
     
    }

    public int getClaveVendedor() {
        return _claveVendedor;
    }

    public void setClaveVendedor(int _claveVendedor) {
        this._claveVendedor = _claveVendedor;
    }

    public String getNomVendedor() {
        return _nomVendedor;
    }

    public void setNomVendedor(String _nomVendedor) {
        this._nomVendedor = _nomVendedor;
    }

    public String getApellVendedor() {
        return _apellVendedor;
    }

    public void setApellVendedor(String _apellVendedor) {
        this._apellVendedor = _apellVendedor;
    }

    public String getDirVendedor() {
        return _dirVendedor;
    }

    public void setDirVendedor(String _dirVendedor) {
        this._dirVendedor = _dirVendedor;
    }

    public String getTlfVendedor() {
        return _tlfVendedor;
    }

    public void setTlfVendedor(String _tlfVendedor) {
        this._tlfVendedor = _tlfVendedor;
    }

    public String getCelVendedor() {
        return _celVendedor;
    }

    public void setCelVendedor(String _celVendedor) {
        this._celVendedor = _celVendedor;
    }
    
}
