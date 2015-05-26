/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.ws;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import org.orm.PersistentException;
import orm.Especialidad;
import orm.Medico;

/**
 *
 * @author rrodriguez
 */
@WebService(serviceName = "ReservaHoraMedicaService")
public class ReservaHoraMedicaService {

  /**
     * Web service operation obtenerMedico
     */
    @WebMethod(operationName = "obtenerMedico")
    public String obtenerMedico() {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        logicbusiness.LogicMedico  logicMedico = new logicbusiness.LogicMedico();
        return gson.toJson(logicMedico.obtenerMedicos());
       
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "ObtenerPorcentajeOcupacionBox")
    public String ObtenerPorcentajeOcupacionBox(@WebParam(name = "box") int box, @WebParam(name = "fecha1") String fecha1, @WebParam(name = "fecha2") String fecha2) {
        //TODO write your implementation code here:
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        logicbusiness.LogicBox logicBox = new logicbusiness.LogicBox();
        double porcentaje = logicBox.obtenerOcupacionBox(box, fecha1, fecha2);
        return gson.toJson(porcentaje);
         
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ReservarHoraMedicaControl")
    public String ReservarHoraMedicaControl(@WebParam(name = "arrayHorasMedicas") String arrayHorasMedicas, @WebParam(name = "idPaciente") int idPaciente) {
        //TODO write your implementation code here:
        String reserva = "";
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        logicbusiness.LogicReserva logicReserva = new logicbusiness.LogicReserva();     
        try {
            reserva = logicReserva.reservarHoraControlMedico(arrayHorasMedicas, idPaciente);
        } catch (PersistentException ex) {
            Logger.getLogger(ReservaHoraMedicaService.class.getName()).log(Level.SEVERE, null, ex);
             return gson.toJson(new Error("No se obtuvieron datos"));
        }
        return reserva;
    }
}
