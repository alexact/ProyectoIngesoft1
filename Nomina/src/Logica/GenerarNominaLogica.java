/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Conceptos;
import Modelo.ListaConceptosModelo;
import Modelo.GenerarNominaModelo;
import Modelo.contrato;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alexandra
 */
public class GenerarNominaLogica {

    int idTrabajador;
    GenerarNominaModelo gMM = new GenerarNominaModelo();
    TrabajadorLogica tb = new TrabajadorLogica();
    LogicaCrearContrato lCC = new LogicaCrearContrato();
    NovedadesLogica nv=new NovedadesLogica();
   

    

    public GenerarNominaLogica generarNomina(int idTrabajador) {
        this.idTrabajador = idTrabajador;
       //  ArrayList<String> conceptosNomina=conceptosDeNomina();
        return null;
  
    }
 /*   public ArrayList<String> conceptosDeNomina(){
        ArrayList<String> conceptosNomina=metodo de la clase conceptosLogica;
     //clase conceptoLogica ---> Se crea el objeto y se llama un metodo que
         //retorne un arrylist de string con los conceptos 
         return conceptosNominaM
    }

    public boolean contratoactivo() {
         //Hay que crear un metodo en ContratoLogica que me diga si el contrato está activo
        if (lCC.contratoActivo()) {
            return true;
        } else {
            return false;
        }
    }*/

    //Metodo que devuelve el nombre del trabajador a partir de la cedula
    public void datosTrabajadorId() {

        this.gMM.setNombreTrabajador("El trabajador no existe");
        if (tb.retornarTrabajador(this.idTrabajador).getNombre() != null
                || tb.retornarTrabajador(this.idTrabajador).getApellido() != null) {
            this.gMM.setNombreTrabajador(tb.retornarTrabajador(this.idTrabajador).getNombre() + " "
                    + tb.retornarTrabajador(this.idTrabajador).getApellido());
        }
    }

    public void salarioBase() {
        LogicaCrearContrato contratoLogica = new LogicaCrearContrato();
        String nombreCargo = tb.retornarTrabajador(this.idTrabajador).getCargo().getNombreCargo();
        //Necesito un metodo en contrato que pida el id del trabajador y el nombre del cargo para que me traiga ese contrato)
    //    int salarioBase = contratoLogica.salario(idTrabajador, nombreCargo);
     //   this.gMM.setSalarioBase(salarioBase);
    }

    public void devengados() {
            
            
    }

    public void deducciones() throws SQLException {
        //Seguridad social por parte del trabajador
        TipoNovedadLogica tvL=new TipoNovedadLogica();
        int seguridadSocial=(int) (this.gMM.getSalarioBase()*0.67);
        
        ArrayList<ListaConceptosModelo> deduccionesModelo=new  ArrayList<>();
        boolean fin=false;
        int i=0;
        deduccionesModelo.add(new ListaConceptosModelo("Seguridad Social", seguridadSocial,5));
        while (fin){
        
        i++;
        int tipoNovedad=nv.consultarNovedadesPorID(idTrabajador).getTipoNovedad();
        tvL.idconceptoPorIdNovedad(tipoNovedad);
        }
        
        
        

    }
}
