/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Mapeo.MapeoCursos;
import Mapeo.MapeoModeloCursos;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class LogicaCursos {
    
    public void guardarCursos(MapeoModeloCursos modelo) throws SQLException{
        MapeoCursos mapeo = new MapeoCursos();
        mapeo.insert(modelo);
    }
    
    public void modificarCursos(MapeoModeloCursos modelo) throws SQLException{
        MapeoCursos mapeo = new MapeoCursos();
        mapeo.update(modelo);
    }
    
    public ArrayList<MapeoModeloCursos> cargarCursos(MapeoModeloCursos modelo) throws SQLException{
        MapeoCursos mapeo = new MapeoCursos();
        ArrayList<MapeoModeloCursos> resp = mapeo.cargarCursos(modelo);
        return resp;
    }
    
}
