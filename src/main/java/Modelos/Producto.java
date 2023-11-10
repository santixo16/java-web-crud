package modelos;

import java.sql.PreparedStatement;

/**
 *
 * @author sehernandezc
 */
public class Producto {
    
    private int idProducto;
    private String nombreProducto;
    private int cantidadProducto;
    private int precioProducto;
    private String categoriaProducto;
    
    public Producto(){
        
    }

    public Producto(int idProducto, String nombreProducto, int cantidadProducto, int precioProducto, String categoriaProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.categoriaProducto = categoriaProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }    
    
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
    
    public void consultarProducto(){
        
    }
    
    public void listarProducto(){
        
    }
    
    public void eliminarProducto(){
        
    }
    
}
