/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sehernandezc
 */
public class ConexionDB {
    
    public Connection conn;
    private String database="tienda";
    private String host="jdbc:mysql://localhost:3306/tienda";    
    private String user="root";
    private String pass="";
    
    public void conectar(){
        try{
            conn=DriverManager.getConnection(host, user, pass);    
            System.out.println("Conexion exitosa a la base de datos: " + database);
        }catch(Exception e){
            System.out.println("Error al conectarse a la base de datos: \t" + database +"\n"+ e);
        }
    }
    
    public void desconectar(){
        conn = null;
    }
    
    
    
}
