package CapaNegocio;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClsConexion {
/*OBERSVACION: Puede que se deba insertar de nuevo las librerías
    Posible error: 
    AL MOMENTO DE ELIMINAR UN CLIENTE/VENDEDOR Y VOLVER A VER EL REGISTRO DE CLIENTES/VENDEDOR SALTA ERROR
    
    */
    private Connection base;
    private Statement tabla;
    private ResultSet ventas;

    public ClsConexion(String dirbase) {
        try {
            base = DriverManager.getConnection("jdbc:ucanaccess://" + dirbase);
            System.out.println("***CONEXIÓN EXITOSA***");
            tabla = base.createStatement(ResultSet.FETCH_UNKNOWN, ResultSet.TYPE_SCROLL_SENSITIVE);

        } catch (Exception err) {
            System.out.println("***CONEXIÓN FALLIDA***" + err);
        }

    }

    public ResultSet _ventas() {
        return ventas;
    }

    //para ver
    public boolean consulta(String _tabla) throws SQLException {
        boolean comprobar = false;
        String comando = " SELECT * FROM " + _tabla;
        ventas = null;
        tabla.execute(comando);
        ventas = tabla.getResultSet();
        if (ventas != null) {
            comprobar = true;
        }
        return comprobar;
    }

    //ver productos comprados
    public boolean vercompra(int clave) throws SQLException {
        ventas = null;
        boolean comprobar = false;
        String comando = "SELECT * FROM TbProductos WHERE claveProducto  = " + clave;
        tabla.execute(comando);
        ventas = tabla.getResultSet();
        if (ventas != null) {
            comprobar = true;
        }
        return comprobar;
    }

    //INGRESAR CLIENTES
    public boolean registrarCliente(String n, String a, String f, String d, String c, String e) throws SQLException {
        ventas = null;
        boolean registrar = false;
        try {
            String insertar = "INSERT INTO TbClientes"
                    + "(nomCliente,apellCliente,fechaCliente,dirCliente,celCliente,emailCliente)"
                    + "VALUES"
                    + "('" + n + "','" + a + "','" + f + "','" + d + "','" + c + "','" + e + "');";
            tabla = base.createStatement();
            tabla.execute(insertar);
            ventas = tabla.getResultSet();
            if (ventas != null) {
                registrar = true;
            }
        } catch (SQLException re) {
            System.out.println("No" + re);
        }
        return registrar;
    }

    // ACTUALIZAR CLIENTE
    public boolean actualizarCliente(String d, String c, String e, int clave) throws SQLException {
        ventas = null;

        boolean actualizar = false;
        try {
            String comando = "UPDATE TbClientes SET dirCliente= '" + d + "'," + "celCliente ='" + c + "'," + "emailCliente ='" + e + "'"
                    + "WHERE ClaveCliente =" + clave;

            tabla = base.createStatement();
            tabla.execute(comando);
            ventas = tabla.getResultSet();
            actualizar = true;
        } catch (SQLException err) {
            System.out.println("No" + err);
        }
        return actualizar;
    }

    //eliminar cliente DE TABLA CLIENTE
    public boolean eliminarcliente(int _clave) {
        ventas = null;

        boolean eliminar = false;
        try {
            String comando = "DELETE FROM TbClientes WHERE ClaveCliente = " + _clave;
            tabla = base.createStatement();
            tabla.execute(comando);
            ventas = tabla.getResultSet();
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("No" + e);
        }
        return eliminar;
    }

    //ELIMINAR CLIENTE DE TABLA CABFACTURA
    public boolean eliminarclientedeCab(int _clave) {
        ventas = null;

        boolean eliminar = false;
        try {
            String comando = "DELETE FROM TbCabFactura WHERE claveCliente = " + _clave;
            tabla = base.createStatement();
            tabla.execute(comando);
            ventas = tabla.getResultSet();
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("No" + e);
        }
        return eliminar;
    }
    //ELIMINAR CLIENTE DE TABLA DEL FACTURA

    public boolean eliminarclienteDeL(int _clave) {
        ventas = null;

        boolean eliminar = false;
        try {
            String comando = "DELETE FROM TbDelFactura WHERE claveCliente = " + _clave;
            tabla = base.createStatement();
            tabla.execute(comando);
            ventas = tabla.getResultSet();
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("No" + e);
        }
        return eliminar;
    }

    //ELIMINAR VENDEDOR de TABLA VENDEDOR
    public boolean eliminarvendedor(int _clave) {
        ventas = null;

        boolean eliminar = false;
        try {
            String comando = "DELETE FROM TbVendedor WHERE claveVendedor = " + _clave;
            tabla = base.createStatement();
            tabla.execute(comando);
            ventas = tabla.getResultSet();
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("No" + e);
        }
        return eliminar;
    }
//ELIMINAR VENDEDOR DE TABLA CAB FACTURA

    public boolean eliminarvendedorCAB(int _clave) {
        ventas = null;

        boolean eliminar = false;
        try {
            String comando = "DELETE FROM TbCabFactura WHERE claveVendedor = " + _clave;
            tabla = base.createStatement();
            tabla.execute(comando);
            ventas = tabla.getResultSet();
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("No" + e);
        }
        return eliminar;
    }

    //REGISTRAR VENDEDORES
    public boolean registrarVendedor(String n, String a, String d, String t, String c) throws SQLException {
        ventas = null;
        boolean registrar = false;
        try {
            String insertar = "INSERT INTO TbVendedor"
                    + "(nomVendedor,apellVendedor,dirVendedor,tlfVendedor,celVendedor)"
                    + "VALUES"
                    + "('" + n + "','" + a + "','" + d + "','" + t + "','" + c + "');";
            tabla = base.createStatement();
            tabla.execute(insertar);
            ventas = tabla.getResultSet();
            if (ventas != null) {
                registrar = true;
            }
        } catch (SQLException re) {
            System.out.println("No" + re);
        }
        return registrar;
    }
//ACTUALIZAR VENDEDOR

    public boolean actualizarVendedor(String d, String t, String c, int clave) throws SQLException {
        ventas = null;

        boolean actualizar = false;
        try {
            String comando = "UPDATE TbVendedor SET dirVendedor= '" + d + "'," + "tlfVendedor ='" + t + "'," + "celVendedor ='" + c + "'"
                    + "WHERE claveVendedor =" + clave;

            tabla = base.createStatement();
            tabla.execute(comando);
            ventas = tabla.getResultSet();
            actualizar = true;
        } catch (SQLException err) {
            System.out.println("No" + err);
        }
        return actualizar;
    }

    //Registrar Producto
    public boolean registrarProducto(String n, String p, String c, String u) throws SQLException {
        ventas = null;
        boolean registrar = false;
        try {
            String insertar = "INSERT INTO TbProductos"
                    + "(nomProducto,precioProducto,cantProducto,unidProducto)"
                    + "VALUES"
                    + "('" + n + "','" + p + "','" + c + "','" + u + "');";
            tabla = base.createStatement();
            tabla.execute(insertar);
            ventas = tabla.getResultSet();
            if (ventas != null) {
                registrar = true;
            }
        } catch (SQLException re) {
            System.out.println("No" + re);
        }
        return registrar;
    }
    // ver un cliente

    public boolean verCliente(int clave) throws SQLException {
        ventas = null;
        boolean comprobar = false;
        String comando = "SELECT * FROM TbClientes WHERE ClaveCliente  = " + clave;
        tabla.execute(comando);
        ventas = tabla.getResultSet();
        if (ventas != null) {
            comprobar = true;
        }
        return comprobar;
    }

    //ver un vendedor
    public boolean verVendedor(int clave) throws SQLException {
        boolean comprobar = false;
        String comando = "SELECT * FROM TbVendedor WHERE claveVendedor  = " + clave;
        ventas = null;
        tabla.execute(comando);
        ventas = tabla.getResultSet();
        if (ventas != null) {
            comprobar = true;
        }
        return comprobar;
    }

    public void siguiente() {
        try {

            if (!(ventas.next())) {
                ventas.first();
            }
        } catch (SQLException err) {
            System.out.println("***ERROR AL RECORRER");
        }
    }

    public void anterior() {
        try {
            if (!(ventas.previous())) {
                ventas.last();
            }
        } catch (SQLException err) {
            System.out.println("***ERROR AL RECORRER");
        }
    }
}
