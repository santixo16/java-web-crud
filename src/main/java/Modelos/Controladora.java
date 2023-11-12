/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author santi
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearProducto(Producto prod){
        controlPersis.crearProducto(prod);
    } 
    
    public List<Producto> traerProductos(){
        return controlPersis.traerProductos();
    }
    
     public void borrarProducto(int id_eliminar){
        controlPersis.borrarProducto(id_eliminar);               
                
    }
}
