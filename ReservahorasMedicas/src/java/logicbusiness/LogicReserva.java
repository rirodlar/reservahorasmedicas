/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbusiness;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import orm.Hora_medicaDAO;
import orm.PacienteDAO;

/**
 *
 * @author rrodriguez
 */
public class LogicReserva {
     public LogicReserva(){
    }
    
    public String reservarHoraControlMedico(String arrayHoraMedica, int idPaciente) throws PersistentException{
        String reserva ="";
        PersistentTransaction t = orm.SintítuloPersistentManager.instance().getSession().beginTransaction();
        
        orm.Paciente lormPaciente = PacienteDAO.loadPacienteByORMID(idPaciente);

        orm.Reserva ormReserva = orm.ReservaDAO.createReserva();
        ormReserva.setPaciente(lormPaciente);
        ormReserva.setPersona_id_ingresa_reserva(lormPaciente.getPersona());
        orm.ReservaDAO.save(ormReserva);
        
        orm.Tipo_hora ormTipo_hora = orm.Tipo_horaDAO.loadTipo_horaByQuery("id=2", null);
        System.out.println(ormTipo_hora.getDescripcion());
        
        String[] horasMedicas = arrayHoraMedica.split(",");
        System.out.println(horasMedicas.length);
       
        for (String horasMedica : horasMedicas) {
            orm.Hora_medica ormHora_medica = Hora_medicaDAO.loadHora_medicaByORMID(Integer.parseInt(horasMedica));
            orm.Reserva_bloque ormReserva_bloque = orm.Reserva_bloqueDAO.createReserva_bloque();
            ormReserva_bloque.setTipo_hora(ormTipo_hora);
            ormReserva_bloque.setHora_medica(ormHora_medica);
            ormReserva_bloque.setReserva(ormReserva);
            orm.Reserva_bloqueDAO.save(ormReserva_bloque);
        }
        t.commit();
        reserva = Integer.toString(ormReserva.getId());
        return reserva;
    }
    
    public static void main(String[] args) throws PersistentException {
        LogicReserva lr = new LogicReserva();
        String horas = "4,5";
        int paciente = 2;
        lr.reservarHoraControlMedico(horas, paciente);
    }

    public String reservarHoraControlMedico(String arrayHorasMedicas, String idPaciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
