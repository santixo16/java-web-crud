/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
    public int getIdProducto(){
        return this.idProducto;
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
