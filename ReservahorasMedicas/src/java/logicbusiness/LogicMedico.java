/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbusiness;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
import orm.Medico;

/**
 *
 * @author rrodriguez
 */
public class LogicMedico {
    public Medico[] obtenerMedicos(){
        Medico[] medicoResponse = null;
        try {
            medicoResponse =   orm.MedicoDAO.listMedicoByQuery(null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(LogicMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medicoResponse;
    }
}
