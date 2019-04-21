/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Logica.NovedadesLogica;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexandra
 */
public class NovedadesControl {
    NovedadesLogica nl;
   private int idtrabajador;
   private String nombreTrabajador;
   private int tipoNovedad;
   private String nombreNovedad;
   private int cantidadHoras;
   private String fechaInicio;
   private String fechaFin;
   private int idNovedades;

    public NovedadesControl() {
    }
   
   
    public NovedadesControl(int idTrabajador, String nombreTipoNovedad, int cantHoras, String fechaInicio, String fechaFin) throws SQLException {
        guardarNovedades(idTrabajador, nombreTipoNovedad, cantHoras, fechaInicio, fechaFin);
    }
    public NovedadesControl(int idNovedad) throws SQLException{
       nl=new NovedadesLogica();
   
          // nl.editarNovedades(cantHoras, idNovedad);
        nl.consultarNovedadesPorID(idNovedad);
        setIdtrabajador(nl.getIdtrabajador());
        setNombreTrabajador (nl.getNombreNovedad());
        setTipoNovedad (nl.getTipoNovedad());
        setNombreNovedad (nl.getNombreNovedad());
        setCantidadHoras (nl.getCantidadHoras());
        setFechaInicio(nl.getFechaInicio());
        setFechaFin(nl.getFechaFin());
        setIdNovedades(nl.getIdNovedades());
    }

    public NovedadesLogica getNl() {
        return nl;
    }

    public void setNl(NovedadesLogica nl) {
        this.nl = nl;
    }

    public int getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public int getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(int tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
    }

    public String getNombreNovedad() {
        return nombreNovedad;
    }

    public void setNombreNovedad(String nombreNovedad) {
        this.nombreNovedad = nombreNovedad;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getIdNovedades() {
        return idNovedades;
    }

    public void setIdNovedades(int idNovedades) {
        this.idNovedades = idNovedades;
    }
    
    public boolean ExisteTrabPorCedula(int idTrabajador) throws SQLException{
         NovedadesLogica nl=new NovedadesLogica();
        return nl.consultarNombreTrabajador(idTrabajador);
    }
    public String consultanombreTrabPorCedula(int idTrabajador) throws SQLException{ 
         NovedadesLogica nl=new NovedadesLogica();
        System.out.println("traba "+ nl.getNombreTrabajador());
        return nl.getNombreTrabajador();
    }
    public void editarNovedades(int idNovedad, String nombreTipoNovedad,
            int cantHoras, String fechaInicio, String fechaFin) throws SQLException{
         NovedadesLogica nl=new NovedadesLogica();
          // nl.editarNovedades(cantHoras, idNovedad);
        
        nl.setIdtrabajador(getIdtrabajador());
        nl.setNombreTrabajador (getNombreNovedad());
        nl.setTipoNovedad (getTipoNovedad());
        nl.setNombreNovedad (getNombreNovedad());
        nl.setCantidadHoras (getCantidadHoras());
        nl.setFechaInicio(getFechaInicio());
        nl.setFechaFin(getFechaFin());
        nl.setIdNovedades(nl.getIdNovedades());
        nl.editarNovedades(nl);
    }
  
    public void guardarNovedades(int idTrabajador, String nombreTipoNovedad, int cantHoras, String fechaInicio, String fechaFin) throws SQLException{
        NovedadesLogica nl=new NovedadesLogica();
        nl.guardarNovedades(idTrabajador, nombreTipoNovedad, cantHoras, fechaInicio, fechaFin);
    }
    public DefaultTableModel listaNovedades(int idTrabajador) throws SQLException{
        NovedadesLogica novedadesLogica=new NovedadesLogica();
        DefaultTableModel nvLTabla= novedadesLogica.listarNovedades(idTrabajador);
        return nvLTabla;
    }
   public ArrayList<String> tiposNovedad() throws SQLException{
       NovedadesLogica novedadesLogica=new NovedadesLogica();
        return novedadesLogica.consultarTiposDeNovedad("A");
   } 
     public ArrayList<String> tiposIncapacidad() throws SQLException{
       NovedadesLogica novedadesLogica=new NovedadesLogica();
        return novedadesLogica.consultarTiposDeNovedad("I");
   } 
    public void eliminarRegistro(int idNovedad){
        NovedadesLogica nvL=new NovedadesLogica();
        nvL.eliminarNovedad(idNovedad);
    }
    
    
}
