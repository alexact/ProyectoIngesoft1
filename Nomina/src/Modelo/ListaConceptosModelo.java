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
public class ListaConceptosModelo {
    String concepto;
    int valor;
    int idConcepto;

    public ListaConceptosModelo() {
    }

    public ListaConceptosModelo(String concepto, int valor, int idConcepto) {
        this.concepto = concepto;
        this.valor = valor;
        this.idConcepto = idConcepto;
    }
    
    

    public int getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(int idConcepto) {
        this.idConcepto = idConcepto;
    }
    
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}
