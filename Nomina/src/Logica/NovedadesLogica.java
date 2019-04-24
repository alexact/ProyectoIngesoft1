/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.ListaConceptosModelo;
import Modelo.NovedadModelo;
import Modelo.NovedadesMapeo;
import Modelo.TipoNovedadMapeo;
import Modelo.TipoNovedadModelo;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexandra
 */
public class NovedadesLogica {

    private int idtrabajador;
    private String nombreTrabajador;
    private int tipoNovedad;
    private String nombreNovedad;
    private int cantidadHoras;
    private String fechaInicio;
    private String fechaFin;
    private int idNovedades;

    public int getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
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

    public NovedadesLogica() {

    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public void eliminarNovedad(int idNovedad) {
        NovedadesMapeo novedadM = new NovedadesMapeo();
        novedadM.delete(idNovedad);
    }

    public boolean consultarNombreTrabajador(int idTrabajador) throws SQLException {
        TrabajadorLogica tbL = new TrabajadorLogica();
        boolean nombreTrabajador;
        System.out.println("nuluto " + tbL.retornarTrabajador(idTrabajador).getNombre());
        if (tbL.retornarTrabajador(idTrabajador).getNombre() != null
                || tbL.retornarTrabajador(idTrabajador).getApellido() != null) {
            setNombreTrabajador(tbL.retornarTrabajador(idTrabajador).getNombre()
                    + " " + tbL.retornarTrabajador(idTrabajador).getApellido());
            return true;
        } else {
            setNombreTrabajador("El Trabajador no existe");
            return false;
        }

    }

    public boolean guardarNovedades(int idTrabajador, String nombreTipoNovedad, int cantHoras, String fechaInicio, String fechaFin) throws SQLException {
        NovedadModelo novedadModelo = new NovedadModelo(idTrabajador, nombreTipoNovedad, cantHoras, fechaInicio, fechaFin);
        NovedadesMapeo novedadesMapeo = new NovedadesMapeo();
        boolean resp = novedadesMapeo.insert(novedadModelo);
        return resp;

    }

    public NovedadModelo editarNovedades(NovedadesLogica nL) throws SQLException {
        System.out.println("Fechas " + nL.getFechaInicio());
        NovedadModelo novedadModelo = consultarNovedadesPorID(nL.getIdNovedades());
        novedadModelo.setNombreNovedad(nL.getNombreNovedad());
        novedadModelo.setCantidadHoras(nL.getCantidadHoras());
        novedadModelo.setFechaInicio(nL.getFechaInicio());
        novedadModelo.setFechaFin(nL.getFechaInicio());
        NovedadesMapeo novedadesMapeo = new NovedadesMapeo();
        novedadesMapeo.update(novedadModelo);
        return novedadModelo;

    }

    public NovedadModelo consultarNovedadesPorID(int idNovedad) throws SQLException {
        NovedadesMapeo novedadesMapeo = new NovedadesMapeo();
        NovedadModelo nvM = novedadesMapeo.consultarNovedadPorIdNovedad(idNovedad);
        setIdtrabajador(nvM.getIdtrabajador());
        setNombreTrabajador(nvM.getNombreNovedad());
        setTipoNovedad(nvM.getTipoNovedad());
        setNombreNovedad(nvM.getNombreNovedad());
        setCantidadHoras(nvM.getCantidadHoras());
        setFechaInicio(nvM.getFechaInicio());
        setFechaFin(nvM.getFechaFin());
        setIdNovedades(nvM.getIdNovedades());
        return nvM;

    }

    public ArrayList<NovedadModelo> consultarNovedades(int idTrabajador) throws SQLException {
        NovedadesMapeo novedadesMapeo = new NovedadesMapeo();
        TrabajadorLogica tbL = new TrabajadorLogica();

        ArrayList<NovedadModelo> nvM = novedadesMapeo.consultarNovedadPorIdTrabajador(idTrabajador);
        String nombreTrabajador = tbL.retornarTrabajador(idTrabajador).getNombre()
                + " " + tbL.retornarTrabajador(idTrabajador).getApellido();
        for (NovedadModelo i : nvM) {
            i.setNombreTrabajador(nombreTrabajador);
            System.out.println("sds ");
        }

        return nvM;

    }

    public ArrayList<String> consultarTiposDeNovedad(String simbolo) throws SQLException {
        if (simbolo.equals("A")) {
            TipoNovedadMapeo tNM = new TipoNovedadMapeo();
            return tNM.consultarTiposDeNovedad();
        } else {
            TipoNovedadMapeo tNM = new TipoNovedadMapeo();
            return tNM.consultarPorTiposDeNovedad(simbolo);
        }
    }
/*
    public ArrayList<ListaConceptosModelo> consultaParaNominaDeducciones(int idTrabajador) throws SQLException {
        ArrayList<NovedadModelo> nvM=consultarNovedades(idTrabajador);
        ArrayList<ListaConceptosModelo> lcM=new ArrayList<>();
    
        TipoNovedadLogica tvL=new TipoNovedadLogica();
        ArrayList<String> tvLA=tvL.();
        
        for (tvLA.get) {
            
        }
        for (NovedadModelo novedadModelo : nvM) {
            if(novedadModelo.getTipoNovedad()
             lcM.add(new ListaConceptosModelo(nombreNovedad, )
        }
       
    }
*/
    public DefaultTableModel listarNovedades(int idTrabajador) throws SQLException {
        ArrayList<NovedadModelo> novedadesModel = consultarNovedades(idTrabajador);

        DefaultTableModel tablaNovedades = new DefaultTableModel() {
            //Metodo para que en la tabla al hacer doble clic no se pueda editar
            @Override
            public boolean isCellEditable(int filas, int columnas) {

                if (columnas >= 0) {
                    return false;
                }
                return true;
            }

        };

        tablaNovedades.addColumn("No.");
        tablaNovedades.addColumn("Tipo de Novedad");
        tablaNovedades.addColumn("Horas");
        tablaNovedades.addColumn("Fecha de Inicio");
        tablaNovedades.addColumn("Fecha de Fin");

        for (int i = 0; i < novedadesModel.size(); i++) {
            System.out.println("prueba " + novedadesModel.get(i).getNombreNovedad());
            Object[] row = new Object[1];
            tablaNovedades.addRow(row);
            tablaNovedades.setValueAt(novedadesModel.get(i).getIdNovedades(), i, 0);
            tablaNovedades.setValueAt(novedadesModel.get(i).getNombreNovedad(), i, 1);
            tablaNovedades.setValueAt(novedadesModel.get(i).getCantidadHoras(), i, 2);
            tablaNovedades.setValueAt(novedadesModel.get(i).getFechaInicio(), i, 3);
            tablaNovedades.setValueAt(novedadesModel.get(i).getFechaFin(), i, 4);
        }
        return tablaNovedades;
    }

}
