package JavaBeans;

import java.io.Serializable;
/**
 *
 * @author HP   -   Java Bean "Marca"
 */
public class Marca implements Serializable{
    //  Atributos de la tabla Marca
    private int id_marca;
    private String nombre;
    private boolean visible;

    //  Constructor vacio
    public Marca() {
    }

    
    //  Constructor con todos los atributos
    public Marca(int id_marca, String nombre, boolean visible) {
        this.id_marca = id_marca;
        this.nombre = nombre;
        this.visible = visible;
    }
    
    
    //  Getters y Setters
    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    
}