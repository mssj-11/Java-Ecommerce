package cad;

import JavaBeans.Categoria;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HP   -   Clase de acceso a datos para categorias
 */
public class Categoria_cad {
    public static ArrayList<Categoria> listar() throws SQLException{
        try {
            //  Procedimiento almacenado
            String sql = "{call listar_subCategoria(5)}";
            Connection c=Conexion.conectar();
            CallableStatement sentencia = c.prepareCall(sql);
            ResultSet resultado = sentencia.executeQuery();
            
            //  Creando la lista inicial(vacia)
            ArrayList<Categoria> lista=new ArrayList<>();
            //  Hay registros en la consulta
            while (resultado.next()) {
                Categoria categ=new Categoria();
                categ.setId_categoria(resultado.getInt("id_categoria"));
                categ.setNombre(resultado.getString("nombre"));
                
                //  Agregando los datos a la categoria
                lista.add(categ);
            }
            return lista;   //  Retornando la lista
        } catch (SQLException ex) {
            return null;    //  Si hay error - Retorna NULL
        }
    }
}