package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    Connection SQLConexion;
    
    public Conexion(){
        //Ruta URL Base de Datos
        String host = "localhost";
        String  puerto = "3306";
        String nameDB = "sistemaventa";
        
        //Acceder Basde de Datos
        String usuario =  "root";
        String pass = "";
        
        //Driver, implementa de forma nativa el protocolo de comunicación con la base de datos
        String driver  = "com.mysql.cj.jdbc.Driver";
        
        //Contruir URL, SSL = false es un certificado en el cual se pregunta la seguridad, lo desabilitamos
        String databaseURL = "jdbc:mysql://"+host+":"+puerto+"/"+nameDB+"?useSSL=false";
        
        try{
            Class.forName(driver);
            SQLConexion = DriverManager.getConnection(databaseURL,usuario,pass);
            System.out.println("Base de Datos Conectada");
        }catch(Exception e  ){
            
        }
    }
        //metodo que retorna la conexión
        public Connection getConectarDB(){
            return SQLConexion;
        }
    
    }

