/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Logica.LogicaCrearContrato;
import Modelo.Trabajador;
import java.io.IOException;
import java.util.Calendar;

/**
 *
 * @author salas
 */
public class controlContrato {
    Trabajador existe = new Trabajador();
    TrabajadorControl j = new TrabajadorControl();

    public controlContrato() {
    }
    
    public void crearContratoIndefinido(long cedula,String estadoCivil,String ciudadRP,String diaFSL,
            Calendar fechaIn, String tiempoPago,int horaI,int horaFin,
            int salario) throws IOException{
        LogicaCrearContrato logi = new LogicaCrearContrato();
        logi.contratoIndefinido(cedula, estadoCivil, ciudadRP, diaFSL, fechaIn, tiempoPago,
                horaI,horaFin,salario);
    }
    public Trabajador buscarTrabajador(long cedula){      
        existe = j.retornarTrabajador(cedula);
        return existe;
    }

}
