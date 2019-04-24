/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.TipoNovedadMapeo;
import Modelo.TipoNovedadModelo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexandra
 */
public class TipoNovedadLogica {
    String nombreTipoNovedad;
    int idTipoNovedad;
    int idconcepto;
    double porcentaje;

    public TipoNovedadLogica() {
    }

    public String getNombreTipoNovedad() {
        return nombreTipoNovedad;
    }

    public void setNombreTipoNovedad(String nombreTipoNovedad) {
        this.nombreTipoNovedad = nombreTipoNovedad;
    }

    public int getIdTipoNovedad() {
        return idTipoNovedad;
    }

    public void setIdTipoNovedad(int idTipoNovedad) {
        this.idTipoNovedad = idTipoNovedad;
    }

    public int getIdconcepto() {
        return idconcepto;
    }

    public void setIdconcepto(int idconcepto) {
        this.idconcepto = idconcepto;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    public int idconceptoPorIdNovedad(int idtipoNovedad){
        TipoNovedadMapeo tnM=new TipoNovedadMapeo();
        try {
          return  tnM.consultarTodoTipoNovedad(idtipoNovedad).getIdconcepto();
        } catch (SQLException ex) {
            Logger.getLogger(TipoNovedadLogica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public ArrayList<TipoNovedadModelo> tiposNovedades() throws SQLException{
        TipoNovedadMapeo tnMapeo=new TipoNovedadMapeo();
        ArrayList<TipoNovedadModelo> tnovedades=tnMapeo.consultarTodoListaTipoNovedad();
        return tnovedades;
    }
    
    
}
