/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Globales.Conexion;
import Logica.CargoLogica;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Alexandra
 */
public class TrabajadorMapeo {

    Trabajador tr = new Trabajador();
    CargoLogica cl = new CargoLogica();

    public Trabajador retornaTrabajador(long cedula) throws SQLException {
        Trabajador trabajador = new Trabajador();
        String sql = "SELECT * from trabajador,cargotrabajador where cedulatrabajador=" + cedula;
        Conexion conexion = new Conexion();
        boolean existe;
        ResultSet resultados = conexion.consulta(sql);
        while (resultados.next()) {
            trabajador = new Trabajador(resultados.getLong("cedula"), resultados.getString("nombre"),
                    resultados.getString("apellido"), cl.retornarCargo(resultados.getInt("codigocargo")), resultados.getBoolean("escapacitador"));

        }
        resultados.close();
        System.out.println("DATO: " + trabajador.getNombre() + " " + trabajador.getApellido());
        return trabajador;

    }

    public void updateTrabajador(Trabajador trabajador) throws SQLException {
        Conexion conexion = new Conexion();
        String sql = "update trabajador set cedula =" + trabajador.getIdentificacion() + ", nombre="
                + "'" + trabajador.getNombre() + "'" + ", apellido="
                + "'" + trabajador.getApellido() + "'" + ", fechan="
                + "to_date('" + this.cal(this.calendario(trabajador.getFechaN())) + "','YYYY/MMM/DD'), direccion="
                + "'" + trabajador.getDireccion() + "'" + ", telefono="
                + +trabajador.getTelefono() + ", celular ="
                + +trabajador.getCelular() + ", fpension="
                + "'" + trabajador.getfPension() + "'" + ", fcesantias="
                + "'" + trabajador.getfCesantias() + "'" + ", arl="
                + "'" + trabajador.getArl() + "'" + ", estado="
                + "'" + trabajador.getEstado() + "'" + ", escapacitador="
                + trabajador.isEsCapacitador() + " where cedula="+trabajador.getIdentificacion()+";";
        conexion.transaccion(sql);
        conexion.cerrar();
        System.out.println("DATO: " + trabajador.getNombre() + " " + trabajador.getApellido());

    }

    public void insertTrabajador(Trabajador trabajador) throws SQLException {

        String sql;
        sql = "insert into trabajador(cedula,nombre,apellido,fechaN,direccion,telefono,celular ,fPension ,fCesantias,arl,estado,escapacitador)"
                + " VALUES(" + trabajador.getIdentificacion() + ","
                + "'" + trabajador.getNombre() + "'" + ","
                + "'" + trabajador.getApellido() + "'" + ","
                + "to_date('" + this.cal(this.calendario(trabajador.getFechaN())) + "','YYYY/MMM/DD'),"
                + "'" + trabajador.getDireccion() + "'" + ","
                + +trabajador.getTelefono() + ","
                + +trabajador.getCelular() + ","
                + "'" + trabajador.getfPension() + "'" + ","
                + "'" + trabajador.getfCesantias() + "'" + ","
                + "'" + trabajador.getArl() + "'" + ","
                + "'" + trabajador.getEstado() + "'" + ","
                + trabajador.isEsCapacitador() + ");";

        System.out.println(sql);
        Conexion conexion = new Conexion();
        boolean guardar = conexion.transaccion(sql);
        System.out.println(guardar);
        conexion.cerrar();
        //return guardar;
    }

    public void insertCargoTrabajador(Trabajador trabajador) throws SQLException {

        String sql = "insert into cargotrabajador(cedulatrabajador,codigocargo)"
                + " VALUES(" + trabajador.getIdentificacion() + ","
                + trabajador.getCargo().getCodigoCargo() + ");";
        /*+ novedadModelo.getCantidadHoras() + ",to_date('" + novedadModelo.getFechaInicio() + "','DD/MM/YYYY'),"
                + "to_date('" + novedadModelo.getFechaFin() + "','DD/MM/YYYY'))";*/
        System.out.println(sql);
        Conexion conexion = new Conexion();
        boolean guardar = conexion.transaccion(sql);
        conexion.cerrar();

    }

    public void subirALista() throws SQLException {
        Trabajador trabajador = new Trabajador();
        //System.out.println("antes del que");
        String sql = "SELECT * from trabajador,cargotrabajador where cedulatrabajador = cedula";
        //System.out.println("despues del que");
        Conexion conexion = new Conexion();
        ResultSet resultados = conexion.consulta(sql);
        //System.out.println("despues de consulta");
        //System.out.println("res "+resultados.getCursorName());
        //System.out.println("while"+resultados.next());

        while (resultados.next()) {
            //System.out.println("por aqui");

            //resultados.getString("apellido"), cl.retornarCargo(resultados.getInt("codigocargo")), resultados.getBoolean("escapacitador"));
            trabajador = new Trabajador(resultados.getLong("cedula"), resultados.getString("nombre"),
                    resultados.getString("apellido"), resultados.getDate("fechan"), resultados.getString("direccion"),
                    resultados.getInt("telefono"), resultados.getLong("celular"), resultados.getString("fpension"),
                    resultados.getString("fcesantias"), resultados.getString("arl"), resultados.getString("estado"), cl.retornarCargo(resultados.getInt("codigocargo")), resultados.getBoolean("escapacitador"));
//System.out.println("list"+ resultados.getInt("codigocargo"));
            Trabajador.LISTATRABAJADORES.add(trabajador);
        }
        resultados.close();

    }

    //Convierte Date a Calendar
    public Calendar calendario(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    // Convierte Calendar a String
    public String cal(Calendar calendar) {
        String calendari;
        calendari = calendar.get(Calendar.DAY_OF_MONTH) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.YEAR);
        return calendari;
    }

    /*   public void llenarLista() throws SQLException {
        ArrayList<Trabajador> list = new ArrayList<>();
        list.add(this.subirALista());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getApellido());

        }
    }*/
    public static void main(String[] args) throws SQLException {
        TrabajadorMapeo tm = new TrabajadorMapeo();
        Trabajador tr = new Trabajador();
        //tr = new Trabajador(788, "Camilo", "lido", null, "asdasd", 0, 0, "asdasd", "asdas", "asd", "asdasd");
        tm.insertTrabajador(tr);

    }
}
