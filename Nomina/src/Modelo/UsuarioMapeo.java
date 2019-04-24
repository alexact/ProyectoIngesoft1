/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Globales.Conexion;
import static java.sql.JDBCType.NULL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioMapeo {

    public UsuarioMapeo() {
        
    
    }
    
    public Usuario validarUsuario(String usuario) throws SQLException{
        Conexion conexion= new Conexion();
        
        String sql = "select nombreusuario,contrasena from usuarios where nombreusuario = '"+usuario+"'";
        String nombreUsuario="";
        String nombreContrasena="";
        ResultSet resultado = conexion.consulta(sql);
        while(resultado.next()){
            nombreUsuario = resultado.getString("nombreusuario");
            nombreContrasena = resultado.getString("contrasena");
            
        }
        conexion.cerrar();
        Usuario usuarioo = new Usuario(nombreUsuario, nombreContrasena);
        return usuarioo;
    } 
    public ArrayList validarRoles(String usuario) throws SQLException{
        Conexion conexion= new Conexion();
        
        String sql = "select administradorsistema,gestornomina,reclutador,capacitador from usuarios where nombreUsuario = '"+usuario+"'";
        String nombreUsuario="";
        String nombreContrasena="";
        boolean administradorSistema =false;
        boolean gestorNomina = false;
        boolean reclutador = false;
        boolean capacitador = false;
        ResultSet resultado = conexion.consulta(sql);
        while(resultado.next()){
            administradorSistema = resultado.getBoolean("administradorsistema");
            gestorNomina = resultado.getBoolean("gestornomina");
            reclutador = resultado.getBoolean("reclutador");
            capacitador = resultado.getBoolean("capacitador");
        }
        conexion.cerrar();
        ArrayList rolesObtenidos = new ArrayList(4);
        rolesObtenidos.add(administradorSistema);
        rolesObtenidos.add(gestorNomina);
        rolesObtenidos.add(reclutador);
        rolesObtenidos.add(capacitador);
        return rolesObtenidos;
    } 
    

    public boolean InsertarNuevoUsuario(Usuario usuarioo)throws SQLException{            
        ArrayList rolesEscogidos = new ArrayList(4);
        rolesEscogidos = usuarioo.getRolesEscogidos();
        boolean administrador=(boolean) rolesEscogidos.get(0);
        boolean gestor=(boolean) rolesEscogidos.get(1);
        boolean reclutador=(boolean) rolesEscogidos.get(2);
        boolean capacitador=(boolean) rolesEscogidos.get(3);
        String sql ="INSERT INTO usuarios (id,nombreusuario, contrasena, administradorsistema,gestornomina,reclutador,capacitador, cedula) VALUES ("+
                 usuarioo.getId()+",'"+
                 usuarioo.getUsuario()+"','"+
                 usuarioo.getContrasena()+"',"+
                 administrador+","+
                 gestor+","+
                 reclutador+","+
                 capacitador+",'"+
                 usuarioo.getCedulaUsuario()+"');"; 
   
        Conexion conexion=new Conexion();
        boolean guardar=conexion.transaccion(sql);
        conexion.cerrar();
        if(guardar){
            return true;
        }else{
           return false;
        }        
    }

    public String validarCedula(String cedulaTrabajador) throws SQLException {
        Conexion conexion= new Conexion();
        String sql = "select nombreusuario from usuarios where cedula = '"+cedulaTrabajador+"'";
        String nombreUsuario="";
        ResultSet resultado = conexion.consulta(sql);
        while(resultado.next()){
            nombreUsuario = resultado.getString("nombreusuario");       
        }
        conexion.cerrar();
        return nombreUsuario;
    }
    
    public boolean actualizarUsuario(Usuario usuario) throws SQLException{
        ArrayList rolesEscogidos = new ArrayList(4);
        rolesEscogidos = usuario.getRolesEscogidos();
        boolean administrador=(boolean) rolesEscogidos.get(0);
        boolean gestor=(boolean) rolesEscogidos.get(1);
        boolean reclutador=(boolean) rolesEscogidos.get(2);
        boolean capacitador=(boolean) rolesEscogidos.get(3);
        String sql ="update usuarios set id = "+usuario.getId()+" , nombreusuario = '"+usuario.getUsuario()+ "', contrasena ='"+usuario.getContrasena()+"', administradorsistema ="+administrador+" ,gestornomina ="+gestor+" , reclutador ="+reclutador+" , capacitador ="+capacitador+" where cedula = '"+usuario.getCedulaUsuario()+"'";
        Conexion conexion=new Conexion();
        boolean guardar=conexion.transaccion(sql);
        conexion.cerrar();
        if(guardar){
            return true;
        }else{
           return false;
        }          
    }

    public boolean asignarRoles(Usuario usuario) throws SQLException{
        ArrayList rolesEscogidos = new ArrayList(4);
        rolesEscogidos = usuario.getRolesEscogidos();
        boolean administrador=(boolean) rolesEscogidos.get(0);
        boolean gestor=(boolean) rolesEscogidos.get(1);
        boolean reclutador=(boolean) rolesEscogidos.get(2);
        boolean capacitador=(boolean) rolesEscogidos.get(3);
        String sql ="update usuarios set administradorsistema ="+administrador+" ,gestornomina ="+gestor+" , reclutador ="+reclutador+" , capacitador ="+capacitador+" where cedula = '"+usuario.getCedulaUsuario()+"'";
        Conexion conexion=new Conexion();
        boolean guardar=conexion.transaccion(sql);
        conexion.cerrar();
        if(guardar){
            return true;
        }else{
           return false;
        }          
    }     
    
}


