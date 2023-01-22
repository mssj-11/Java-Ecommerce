package JavaBeans;
import java.io.Serializable;
/**
 *
 * @author HP   -   Java Bean "Categoria"
 */
public class Categoria implements Serializable{
    //  Atributos
    private int id_categoria;
    private String nombre;
    private boolean visible;
    private int categoria_superior;
    
    //  Constructor vacio
    public Categoria() {
    }
    
    
    //  Constructor con los parametros
    public Categoria(int id_categoria, String nombre, boolean visible, int categoria_superior ) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
        this.visible = visible;
        this.categoria_superior = categoria_superior;
    }
    
    
    //  Getters y Setters
    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
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

    
    public int getCategoria_superior() {
        return categoria_superior;
    }

    public void setCategoria_superior(int categoria_superior) {
        this.categoria_superior = categoria_superior;
    }
    
    
}