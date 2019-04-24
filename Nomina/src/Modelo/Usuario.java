/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Vector;

public class Usuario {
    int idUsuario;
    String usuario;
    String contrasena;
    String cedulaUsuario;
    ArrayList rolesEscogidos = new ArrayList(4);

    public void setId(int id) {
        this.idUsuario = idUsuario;
    }

    public void setRolesEscogidos(ArrayList rolesEscogidos) {
        this.rolesEscogidos = rolesEscogidos;
    }

    public int getId() {
        return idUsuario;
    }

    public ArrayList getRolesEscogidos() {
        return rolesEscogidos;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public void setRoles(ArrayList rolesEscogidos) {
        this.rolesEscogidos = rolesEscogidos;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public  ArrayList getRoles() {
        return rolesEscogidos;
    }
    
    
    public Usuario(int idUsuario,String usuario,String contrasena,String cedula,ArrayList rolesEscogidos){
        this.idUsuario=idUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.cedulaUsuario=cedula;
        this.rolesEscogidos = rolesEscogidos;
    }
    
    public Usuario(String usuario,String contrasena){
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    
    public String getUsuario() {
	return usuario;
    }
    public void setUsuario(String usuario) {
	this.usuario = usuario;
    }
    
    public String getContrasena() {
	return contrasena;
    }
    public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
    }
    

    
}