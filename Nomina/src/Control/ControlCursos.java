/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Logica.LogicaArrayListCursos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicolás Mayorga
 */
public class ControlCursos {
    
    LogicaArrayListCursos arr;

    public ControlCursos() throws SQLException {
         arr = new LogicaArrayListCursos();
    }
    
    public LogicaArrayListCursos getArr() {
        return arr;
    }

    public void setArr(LogicaArrayListCursos arr) {
        this.arr = arr;
    }
    
    public void agregarCurso(String nombre, String descripcion) throws SQLException{
        arr.agregarCurso(nombre, descripcion);
    }
    
    public void modificarCurso(String cod, String nombre, String descripcion, int estado, int capacitador) throws SQLException{
        int codigo = Integer.parseInt(cod);
        arr.modificarCurso(codigo, nombre, descripcion, estado, capacitador);
    }
    
    public DefaultTableModel listarCursos(){
        
        return arr.listarCursos();
    }
    
    public ArrayList<String> mostrarCurso(int codigoCurso){
        return arr.mostrarCurso(codigoCurso);
    }
    
    
}
