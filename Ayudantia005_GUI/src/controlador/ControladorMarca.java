package controlador;
// CRUD

import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Marca;

public class ControladorMarca {
    public boolean agregar(Marca marca)
    {
        try
        {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO marca (nombre, habilitado)";
            sql += " values (?,?)";
            
            PreparedStatement st = cx.prepareStatement(sql);
            st.setString(1, marca.getNombre());
            st.setInt(2, marca.isHabilitado()?1:0);
            
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        }
        catch(Exception ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;        
    }
}
