/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos;

import static java.lang.System.err;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
 

public class Clsconexion {
   private Connection conexion;
   private Statement tabla;
   private ResultSet RS;
  
  
    
    public Clsconexion ( String dirbase)
    {
      try {
          conexion= DriverManager.getConnection("jdbc:ucanaccess://"+ dirbase);
          tabla=conexion.createStatement(ResultSet.FETCH_UNKNOWN,ResultSet.TYPE_SCROLL_SENSITIVE);
          System.out.println("** conexion correcta **");
            
    }catch (Exception err)
    {
         System.out.println("** conexxion erronea " + err);
    }
    
       
    }
    

    public ResultSet registros() throws SQLException {
       
       return RS;
    }
    
    public boolean consulta ( String _tabla) throws SQLException
    {
        boolean respuesta = false;
        String comandos = "SELECT * FROM " + _tabla;
       RS = null;
       tabla.execute(comandos);
       RS=tabla.getResultSet();
        
        
        if (RS!=null) 
        {
            respuesta = true; 
        }
        return respuesta;
    }
    
  
    
    public void siguiente () throws SQLException 
    {
     
      try {
          if (!(RS.next()))
          {
               RS.first();
          }
      }
      catch(SQLException err)
      {
          RS.first();
           System.out.print("*** error recorrer ***");
      }
       
    }
     public void anterior () throws SQLException 
    {
      try {
          if (!(RS.previous()))
          {
               RS.last();
          }
      }catch(SQLException err)
      {
         // _registros.first();
           System.out.print("*** error recorrer ***" + err);
      }
       
    }
     
     public void modificar (String nombre, String apellido, String fecha, String id) throws SQLException
     {
         int confirmar = JOptionPane.showConfirmDialog(null, " ¿desea modificar datos?");
         if(confirmar == JOptionPane.YES_OPTION)
         {
            conexion  = null;
             
             try{
                
                String Ssql = " UPDATE tbcliente set nomcliente=?, celclientes=?, WHERE clvcliente=? ";
                 PreparedStatement prest = conexion.prepareStatement(Ssql);
                 prest.setString(1, nombre);
                 prest.setString(2, apellido);
                 prest.setString(3, fecha);
                 prest.setString(4, id);
                 
                 if (prest.executeUpdate()>0)
                 {
                     JOptionPane.showMessageDialog(null, "modificacion exitosa", "operacion exitosa", JOptionPane.INFORMATION_MESSAGE);
                 }else 
                 {
                     JOptionPane.showMessageDialog(null, "no se pudo modificar", "operacion fallida", JOptionPane.ERROR_MESSAGE); 
                 }
             }catch(SQLException err)
                     {
                          System.out.print("*** error ***" + err);
                     }finally{
                             if (conexion == null)
                             {
                             try{
                             
                                 conexion.close();
                                 
                             }catch (SQLException err)
                                     {
                                         System.out.print("*** error ***" + err);
                                     }
                             }
                             }
                     
         }
     }

    public void modificar(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}