/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Usuario;
import Modelo.UsuarioMapeo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class UsuarioLogica {
    int idUsuario;
    String usuario;
    String contrasena;
    ArrayList rolesEscogidos = new ArrayList(4);
    String cedulaTrabajador;

    public UsuarioLogica(int idUsuario,String usuario, String contrasena,ArrayList rolesEscogidos,String cedulaTrabajador) {
        this.idUsuario=idUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rolesEscogidos=rolesEscogidos;
        this.cedulaTrabajador=cedulaTrabajador;
        
    }
    
    public boolean validarUsuario() throws SQLException{
        UsuarioMapeo  mapeoUsuario = new UsuarioMapeo();
        Usuario usuarioo = mapeoUsuario.validarUsuario(usuario);
        if (usuarioo.getUsuario().equals(usuario)) {
            if(usuarioo.getContrasena().equals(contrasena)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public String validarCedula() throws SQLException{
        UsuarioMapeo  mapeoUsuario = new UsuarioMapeo();
        String usuarioEncontrado = mapeoUsuario.validarCedula(cedulaTrabajador);
        return usuarioEncontrado;
    }
    
    public boolean actualizar()  throws SQLException{
        UsuarioMapeo  mapeoUsuario = new UsuarioMapeo();
        Usuario usuarionuevo =new Usuario(idUsuario,usuario,contrasena,cedulaTrabajador,rolesEscogidos);
        boolean actualizoCorrectamente = mapeoUsuario.actualizarUsuario(usuarionuevo);
        return actualizoCorrectamente;     
    }
    
    
    public boolean asignarRoles()  throws SQLException{
        UsuarioMapeo  mapeoUsuario = new UsuarioMapeo();
        Usuario usuarionuevo =new Usuario(idUsuario,usuario,contrasena,cedulaTrabajador,rolesEscogidos);
        boolean asignoCorrectamente = mapeoUsuario.asignarRoles(usuarionuevo);
        return asignoCorrectamente;     
    }
    
    
    public ArrayList validarRoles() throws SQLException{
        UsuarioMapeo  mapeoUsuario = new UsuarioMapeo();
        ArrayList rolesEcontrados = mapeoUsuario.validarRoles(usuario);       
        return rolesEcontrados;
    }
    
    public boolean ingresarUsuariobd() throws SQLException{
        UsuarioMapeo  mapeoUsuario = new UsuarioMapeo();
        Usuario usuarionuevo =new Usuario(idUsuario,usuario,contrasena,cedulaTrabajador,rolesEscogidos);
        boolean ingresoCorrectamente = mapeoUsuario.InsertarNuevoUsuario(usuarionuevo);
        return ingresoCorrectamente;        
    }
    
    
}