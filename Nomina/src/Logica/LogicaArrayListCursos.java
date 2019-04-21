/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Mapeo.MapeoModeloCursos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicolás Mayorga
 */
public class LogicaArrayListCursos {
    
    MapeoModeloCursos cursos;
    ArrayList<MapeoModeloCursos> lista;
    private int contadorCodigo;

    public LogicaArrayListCursos() {
         lista = new ArrayList<>();
    }

    public MapeoModeloCursos getCursos() {
        return cursos;
    }

    public void setCursos(MapeoModeloCursos cursos) {
        this.cursos = cursos;
    }

    public ArrayList<MapeoModeloCursos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<MapeoModeloCursos> lista) {
        this.lista = lista;
    }

    public int getContadorCodigo() {
        return contadorCodigo;
    }

    public void setContadorCodigo(int contadorCodigo) {
        this.contadorCodigo = contadorCodigo;
    }
    
    public ArrayList<String> mostrarCurso(int codigoCurso){
        ArrayList<String> arrInfo= new ArrayList<>();
        arrInfo.add(Integer.toString(lista.get(codigoCurso).getCodigo()));
        arrInfo.add(lista.get(codigoCurso).getNombre());
        arrInfo.add(lista.get(codigoCurso).getDescripcion());
        arrInfo.add(lista.get(codigoCurso).getEstado());
        arrInfo.add(lista.get(codigoCurso).getCapacitador());
        return arrInfo;
    }
    
    public void agregarCurso(String nombre, String descripcion){
        cursos = new MapeoModeloCursos(nombre, descripcion, contadorCodigo, "En curso, con Cupos", null);
        contadorCodigo++;
        lista.add(cursos);
    }
    
    public void modificarCurso(int cod, String nombre, String descripcion, String estado, String capacitador){
        cursos = new MapeoModeloCursos(nombre, descripcion, cod, estado, capacitador);
        lista.set(cod, cursos);
    }
    
    public DefaultTableModel listarCursos(){
        return cursos.listarCursos(lista);
    }
    
}
