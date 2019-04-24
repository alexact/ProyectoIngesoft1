/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author Admin
 */
public class contrato {
    private long cedula;
    private String ciudadRP;
    private String diaFSL;
    private Calendar fechaIn;
    private String tiempoPago;
    private Calendar horaI;
    private Calendar horaFin;
    private int salario;
    private int codigoContrato;

    public contrato() {
    }

    public contrato(long cedula, String ciudadRP, String diaFSL, Calendar fechaIn, 
            String tiempoPago, Calendar horaI, Calendar horaFin, int salario, 
            int codigoContrato) {
        this.cedula = cedula;
        this.ciudadRP = ciudadRP;
        this.diaFSL = diaFSL;
        this.fechaIn = fechaIn;
        this.tiempoPago = tiempoPago;
        this.horaI = horaI;
        this.horaFin = horaFin;
        this.salario = salario;
        this.codigoContrato = codigoContrato;
    }

    public long getCedula() {
        return cedula;
    }

    public String getCiudadRP() {
        return ciudadRP;
    }

    public String getDiaFSL() {
        return diaFSL;
    }

    public Calendar getFechaIn() {
        return fechaIn;
    }

    public String getTiempoPago() {
        return tiempoPago;
    }

    public Calendar getHoraI() {
        return horaI;
    }

    public Calendar getHoraFin() {
        return horaFin;
    }

    public int getSalario() {
        return salario;
    }

    public int getCodigoContrato() {
        return codigoContrato;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }


    public void setCiudadRP(String ciudadRP) {
        this.ciudadRP = ciudadRP;
    }

    public void setDiaFSL(String diaFSL) {
        this.diaFSL = diaFSL;
    }

    public void setFechaIn(Calendar fechaIn) {
        this.fechaIn = fechaIn;
    }

    public void setTiempoPago(String tiempoPago) {
        this.tiempoPago = tiempoPago;
    }

    public void setHoraI(Calendar horaI) {
        this.horaI = horaI;
    }

    public void setHoraFin(Calendar horaFin) {
        this.horaFin = horaFin;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setCodigoContrato(int codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    
}
