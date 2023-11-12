/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Producto;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author santi
 */
public class ControladoraPersistencia {
    
    ProductoJpaController prodJpa = new ProductoJpaController();
    
    //CREATE
    public void crearProducto(Producto prod){
        
        prodJpa.create(prod);
        
    }
    
    //READ
    
    public List<Producto> traerProductos(){
        return prodJpa.findProductoEntities();
    }

    public void borrarProducto(int id_eliminar) {
        try {
            prodJpa.destroy(id_eliminar);
        } catch (NonexistentEntityException ex) {//agregar alert de producto no existente
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
