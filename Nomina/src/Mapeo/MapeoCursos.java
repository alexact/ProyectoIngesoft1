/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

import Globales.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MapeoCursos {

    public void update(MapeoModeloCursos modelo) {
        Conexion conexion = new Conexion();
        String sql = "UPDATE cursos set nombreCurso='" + modelo.getNombre() + "',descripCurso='" + modelo.getDescripcion()
                + "',codigoestado=" + modelo.getEstado() + ",codigocapac='" + modelo.getCapacitador()
                + "' where codigoCurso= " + modelo.getCodigo();
        conexion.transaccion(sql);
        conexion.cerrar();
    }

    public boolean insert(MapeoModeloCursos modelo) throws SQLException {

        String sql = "INSERT into cursos VALUES(" + modelo.getCodigo() + ",'" + modelo.getNombre()
                + "','" + modelo.getDescripcion() + "'," +modelo.getEstado() + ",'" + modelo.getCapacitador() + "')";
        System.out.println(sql);
        Conexion conexion = new Conexion();
        boolean guardar = conexion.transaccion(sql);
        conexion.cerrar();
        return guardar;
    }

    public ArrayList<MapeoModeloCursos> cargarCursos(MapeoModeloCursos mapeo) throws SQLException {
        ArrayList<MapeoModeloCursos> cursos = new ArrayList<>();
        String sql = "SELECT * from cursos";
        Conexion conexion = new Conexion();
        ResultSet resultados = conexion.consulta(sql);
        while (resultados.next()) {
            mapeo = new MapeoModeloCursos(resultados.getString("nombreCurso"), resultados.getString("descripCurso")
                    , Integer.parseInt(resultados.getString("codigoCurso"))
                    , resultados.getInt("codigoEstado"), resultados.getInt("codigoCapac"));
            cursos.add(mapeo);
            
        }
        resultados.close();
        conexion.cerrar();
        return cursos;
    }
}
