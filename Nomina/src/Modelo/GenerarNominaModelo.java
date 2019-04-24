/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alexandra
 */
public class GenerarNominaModelo {
    private int idGNomina;
    private ArrayList<Conceptos> conceptos;
    private ArrayList<NovedadModelo> novedades;
    private String nombreTrabajador;
    private int salarioBase;
    private String cargo;
    private Date fechaNomina;

    public GenerarNominaModelo() {
    }

    public GenerarNominaModelo(int idGNomina, ArrayList<Conceptos> conceptos, 
            ArrayList<NovedadModelo> novedades, String nombreTrabajador, int salarioBase, Date fechaNomina) {
        this.idGNomina = idGNomina;
        this.conceptos = conceptos;
        this.novedades = novedades;
        this.nombreTrabajador = nombreTrabajador;
        this.salarioBase = salarioBase;
        this.fechaNomina = fechaNomina;
    }


    public int getIdGNomina() {
        return idGNomina;
    }

    public void setIdGNomina(int idGNomina) {
        this.idGNomina = idGNomina;
    }

    public ArrayList<Conceptos> getConceptos() {
        return conceptos;
    }

    public void setConceptos(ArrayList<Conceptos> conceptos) {
        this.conceptos = conceptos;
    }

    public ArrayList<NovedadModelo> getNovedades() {
        return novedades;
    }

    public void setNovedades(ArrayList<NovedadModelo> novedades) {
        this.novedades = novedades;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Date getFechaNomina() {
        return fechaNomina;
    }

    public void setFechaNomina(Date fechaNomina) {
        this.fechaNomina = fechaNomina;
    }

   
   }
