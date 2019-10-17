
package CapaNegocio;

import java.sql.ResultSet;
import java.sql.SQLException;


public class RegClientes {
    
    private int _claveCliente;
    private String _nomCliente;
    private String _apellCliente;
    private String _dirCliente;
    private String _fechaCliente;
    private String _numCliente;
    private String _emailCliente;
    
    public RegClientes(){
       _claveCliente=0;
     _nomCliente=null;
     _apellCliente=null;
     _dirCliente=null;
     _fechaCliente=null;
    _numCliente=null;
     _emailCliente=null;
    }
    public void leer(ResultSet cliente) throws SQLException{
     _claveCliente=cliente.getInt("claveCliente");
     _nomCliente=cliente.getString("nomCliente");
     _apellCliente=cliente.getString("apellCliente");
     _dirCliente=cliente.getString("dirCliente");
     _fechaCliente=cliente.getString("fechaCliente");
    _numCliente=cliente.getString("celCliente");
     _emailCliente=cliente.getString("emailCliente");
    }

    public int getClaveCliente() {
        return _claveCliente;
    }

    public void setClaveCliente(int _claveCliente) {
        this._claveCliente = _claveCliente;
    }

    public String getNomCliente() {
        return _nomCliente;
    }

    public void setNomCliente(String _nomCliente) {
        this._nomCliente = _nomCliente;
    }

    public String getApellCliente() {
        return _apellCliente;
    }

    public void setApellCliente(String _apellCliente) {
        this._apellCliente = _apellCliente;
    }

    public String getDirCliente() {
        return _dirCliente;
    }

    public void setDirCliente(String _dirCliente) {
        this._dirCliente = _dirCliente;
    }

    public String getFechaCliente() {
        return _fechaCliente;
    }

    public void setFechaCliente(String _fechaCliente) {
        this._fechaCliente = _fechaCliente;
    }

    public String getNumCliente() {
        return _numCliente;
    }

    public void setNumCliente(String _numCliente) {
        this._numCliente = _numCliente;
    }

    public String getEmailCliente() {
        return _emailCliente;
    }

    public void setEmailCliente(String _emailCliente) {
        this._emailCliente = _emailCliente;
    }
  
    
}
