/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Control.TrabajadorControl;
import Modelo.Trabajador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

/**
 *
 * @author salas
 */
public class LogicaCrearContrato {

    public LogicaCrearContrato() {
    }
    
    public void contratoIndefinido(long cedula,String estadoCivilP,String ciudadRP, String diaFSL,
            Calendar fechaIn, String tiempoPago,int horaI,int horaFin,
            int salario) throws IOException{
        TrabajadorControl tl = new TrabajadorControl();
        Trabajador t = tl.retornarTrabajador(cedula);
        String ruta = "C:\\Users\\Alexandra\\Desktop\\contrato "+t.getNombre()+""+t.getApellido()+".txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
             bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("          CONTRATO DE TRABAJO A TIEMPO INDETERMINADO     "+"\r\n\r\n"
                    +"Entre la sociedad Segovias.inc domiciliada en la  ciudad "+"\r\n"
                    +"Santiago de Cali, Valle del Cauca, representada  por  su "+"\r\n"
                    +"presindete Rocio Segovia,  Colombiana,    mayor de  edad "+"\r\n"
                    +"domiciliada en la ciudad Santiango  de Cali y titular de "+"\r\n"
                    +"la cedula de idetidad N° 12345678,  quien a  los efectos "+"\r\n"
                    +"de este documento de denominara EL PATRONO, por su parte, "+"\r\n"
                    +"el ciudadano(a): "+t.getNombre() +" "+t.getApellido() +","+estadoCivilP+"\r\n"
                    +"mayor de edad, domiciliada en "+t.getDireccion()+" ciudad "+"\r\n"
                    +ciudadRP+" y titular de la cedula de   indentidad   N° "+"\r\n"
                    +t.getIdentificacion()+" quien en lo sucesivo se denominara EL TRABAJADOR,"+"\r\n"
                    +"se ha convenido en celebrar  un  CONTRATO  DE TRABAJO  A "+"\r\n"
                    +"TIEMPO  INDETERMINADO,  y  el  cual  se regirá  por  las "+"\r\n"
                    +"siguientres clausulas:"
                    +"\r\n\r\n"
                    +"      IDENTIFICACION DEL CARGO Y HORARIO DEL TRABAJO     "+"\r\n\r\n"
                    +"PRIMERA: EL TRABAJADOR  se  compromete  a  prestar   sus "+"\r\n"
                    +"servicios a EL PATRONO desempeñando el cargo de "+t.getCargo().getNombreCargo()+","+"\r\n"
                    +"de lunes a  "+diaFSL+" laborando de "+ horaI + " a "+ horaFin+"las funciones "+"\r\n"
                    + "del trabajador "+t.getNombre()+"\r\n"
                    +t.getApellido()+" consisten en: "+"\r\n"
                    +t.getCargo().getDescripcionCargo()+"\r\n\r\n"
                    +"                      FECHA DE INGRESO                   "+"\r\n\r\n"
                    +"SEGUNDA: El trabajador prestara sus servicios a el patrono"+"\r\n"
                    +"por tiempo indeterminado desde el "
                    + fechaIn.getTime().getDate()+"/"+(fechaIn.getTime().getMonth()+1)+"/"
                    +(fechaIn.getTime().getYear()+1900)
                    +" desempeñando"+"\r\n"
                    +"el cargo de: "+ t.getCargo().getNombreCargo()+"\r\n"
                    +"                  FORMA, MONTO,FECHA DE PAGO               "+"\r\n\r\n"
                    +"TERCERA: El trabajador devengara un  salario  mensual de:"+"\r\n"
                    + salario+", es decir el salario estipulado  para el  cargo"+"\r\n"
                    +"por la empresa, siendo pagado en: "+tiempoPago);
        } else {
            archivo.createNewFile();
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("          CONTRATO DE TRABAJO A TIEMPO INDETERMINADO     "+"\r\n\r\n"
                    +"Entre la sociedad Segovias.inc domiciliada en la  ciudad "+"\r\n"
                    +"Santiago de Cali, Valle del Cauca, representada  por  su "+"\r\n"
                    +"presindete Rocio Segovia,  Colombiana,    mayor de  edad "+"\r\n"
                    +"domiciliada en la ciudad Santiango  de Cali y titular de "+"\r\n"
                    +"la cedula de idetidad N° 12345678,  quien a  los efectos "+"\r\n"
                    +"de este documento de denominara EL PATRONO, por su parte, "+"\r\n"
                    +"el ciudadano(a): "+t.getNombre() +" "+t.getApellido() +","+estadoCivilP+"\r\n"
                    +"mayor de edad, domiciliada en "+t.getDireccion()+" ciudad "+"\r\n"
                    +ciudadRP+" y titular de la cedula de   indentidad   N° "+"\r\n"
                    +t.getIdentificacion()+" quien en lo sucesivo se denominara EL TRABAJADOR,"+"\r\n"
                    +"se ha convenido en celebrar  un  CONTRATO  DE TRABAJO  A "+"\r\n"
                    +"TIEMPO  INDETERMINADO,  y  el  cual  se regirá  por  las "+"\r\n"
                    +"siguientres clausulas:"
                    +"\r\n\r\n"
                    +"      IDENTIFICACION DEL CARGO Y HORARIO DEL TRABAJO     "+"\r\n\r\n"
                    +"PRIMERA: EL TRABAJADOR  se  compromete  a  prestar   sus "+"\r\n"
                    +"servicios a EL PATRONO desempeñando el cargo de "+t.getCargo().getNombreCargo()+","+"\r\n"
                    +"de lunes a  "+diaFSL+" las funciones del trabajador "+t.getNombre()+"\r\n"
                    +t.getApellido()+" consisten en: "+"\r\n"
                    +t.getCargo().getDescripcionCargo()+"\r\n\r\n"
                    +"                      FECHA DE INGRESO                   "+"\r\n\r\n"
                    +"SEGUNDA: El trabajador prestara sus servicios a el patrono"+"\r\n"
                    +"por tiempo indeterminado desde el "
                    + fechaIn.getTime().getDate()+"/"+(fechaIn.getTime().getMonth()+1)+"/"
                    +(fechaIn.getTime().getYear()+1900)
                    +" desempeñando"+"\r\n"
                    +"el cargo de: "+ t.getCargo().getNombreCargo()+"\r\n"
                    +"                  FORMA, MONTO,FECHA DE PAGO               "+"\r\n\r\n"
                    +"TERCERA: El trabajador devengara un  salario  mensual de:"+"\r\n"
                    + salario+", es decir el salario estipulado  para el  cargo"+"\r\n"
                    +"por la empresa, siendo pagado en: "+tiempoPago);
        }
        bw.close();
    }
}
