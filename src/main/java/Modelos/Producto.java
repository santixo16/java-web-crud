package modelos;

import java.sql.PreparedStatement;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

/**
 *
 * @author sehernandezc
 */
@Entity
public class Producto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String idProducto;
    private String nombreProducto;
    private String cantidadProducto;
    private String precioProducto;
    private String categoriaProducto;
    
    public Producto(){
        
    }

        public Producto(int id, String idProducto, String nombreProducto, String cantidadProducto, String precioProducto, String categoriaProducto) {
        this.id = id;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.categoriaProducto = categoriaProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  
    
    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(String cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }    
    /*
    public void crearProducto(){        
        ConexionDB conector = new ConexionDB();
        conector.conectar();
        
        try{
            String sql="INSERT INTO producto "
                    + "(idProducto, nombreProducto, cantidadProducto, precioProducto, categoriaProducto)"
                    + "VALUES (?, ?, ?, ?, ?);";            
            PreparedStatement stmt;
            stmt = conector.conn.prepareStatement(sql);
            stmt.setInt(1, idProducto);
            stmt.setString(2, nombreProducto);
            stmt.setInt(3, cantidadProducto);
            stmt.setInt(4, precioProducto);
            stmt.setString(5, categoriaProducto);
            stmt.execute();
            conector.desconectar();
        }catch(Exception error){
            System.out.println("Error al crear un nuevo producto\t" + error);
        }
        
    }
    */

}
