/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alexandra
 */
public class TipoNovedadModelo {
    String nombreTipoNovedad;
    int idTipoNovedad;
    int idconcepto;
    double porcentaje;

    public TipoNovedadModelo() {
    }

    public TipoNovedadModelo(String nombreTipoNovedad, int idTipoNovedad, int idconcepto, double porcentaje) {
        this.nombreTipoNovedad = nombreTipoNovedad;
        this.idTipoNovedad = idTipoNovedad;
        this.idconcepto = idconcepto;
        this.porcentaje = porcentaje;
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
    
}
