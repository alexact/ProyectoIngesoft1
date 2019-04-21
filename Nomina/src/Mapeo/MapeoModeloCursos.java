/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mapeo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicolás Mayorga
 */
public class MapeoModeloCursos {
    
    //Esta clase se encarga de manejar el modelo utilizado en los cursos
    
    private String nombre;
    private String descripcion;
    private int codigo;
    private String estado;
    private String capacitador;

    public MapeoModeloCursos(String nombre, String descripcion, int codigo, String estado, String capacitador) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.estado = estado;
        this.capacitador = capacitador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCapacitador() {
        return capacitador;
    }

    public void setCapacitador(String capacitador) {
        this.capacitador = capacitador;
    }

    public DefaultTableModel listarCursos(ArrayList<MapeoModeloCursos> lista) {
        DefaultTableModel tablaCursos = new DefaultTableModel();
        tablaCursos.addColumn("Código");
        tablaCursos.addColumn("Nombre");
        tablaCursos.addColumn("Descripción");
        tablaCursos.addColumn("Capacitador");
        tablaCursos.addColumn("Estado");
        for (int i = 0; i < lista.size(); i++) {
            MapeoModeloCursos listaCursos = lista.get(i);
            Object[] row = new Object[i];
            tablaCursos.addRow(row);
            tablaCursos.setValueAt(listaCursos.getCodigo(), i, 0);
            tablaCursos.setValueAt(listaCursos.getNombre(), i, 1);
            tablaCursos.setValueAt(listaCursos.getDescripcion(), i, 2);
            tablaCursos.setValueAt(listaCursos.getCapacitador(), i, 3);
            tablaCursos.setValueAt(listaCursos.getEstado(), i, 4);
        }
        return tablaCursos;
    }
    
}
