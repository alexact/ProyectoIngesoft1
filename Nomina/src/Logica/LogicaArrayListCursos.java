/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Mapeo.MapeoModeloCursos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicolás Mayorga
 */
public class LogicaArrayListCursos {

    MapeoModeloCursos cursos;
    LogicaCursos logica;
    ArrayList<MapeoModeloCursos> lista;
    private int contadorCodigo;

    public LogicaArrayListCursos() throws SQLException {
        this.lista = new ArrayList<>();
        logica=new LogicaCursos();
        try {
            this.lista = logica.cargarCursos(cursos);
        } catch (Exception e) {
            System.out.println("No hay conexion a la BD, todo se trabaja dentro del entorno de java y no se carga nada");
        }

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

    public ArrayList<String> mostrarCurso(int codigoCurso) {
        ArrayList<String> arrInfo = new ArrayList<>();
        arrInfo.add(Integer.toString(lista.get(codigoCurso).getCodigo()));
        arrInfo.add(lista.get(codigoCurso).getNombre());
        arrInfo.add(lista.get(codigoCurso).getDescripcion());
        arrInfo.add(Integer.toString(lista.get(codigoCurso).getEstado()));
        arrInfo.add(Integer.toString(lista.get(codigoCurso).getCapacitador()));
        return arrInfo;
    }

    public void agregarCurso(String nombre, String descripcion) throws SQLException {
        cursos = new MapeoModeloCursos(nombre, descripcion, contadorCodigo, 1, 0);
        lista.add(cursos);
        try {
            logica.guardarCursos(cursos);
        } catch (Exception e) {
            System.out.println("No hay conexion a la BD, todo se trabaja dentro del entorno de java y no se guarda permanentemente");
        }
        contadorCodigo++;
    }

    public void modificarCurso(int cod, String nombre, String descripcion, int estado, int capacitador) throws SQLException {
        cursos = new MapeoModeloCursos(nombre, descripcion, cod, estado, capacitador);
        lista.set(cod, cursos);
        try {
            logica.modificarCursos(cursos);
        } catch (Exception e) {
            System.out.println("No hay conexion a la BD, todo se trabaja dentro del entorno de java y no se modifica permanentemente");
        }
    }

    public DefaultTableModel listarCursos() throws SQLException {
        LogicaArrayListCursos ll=new LogicaArrayListCursos();
        
        return cursos.listarCursos(ll.lista);
    }

}
