/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteSintítuloData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.SintítuloPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Tipo_hora lormTipo_hora = orm.Tipo_horaDAO.loadTipo_horaByQuery(null, null);
			// Delete the persistent object
			orm.Tipo_horaDAO.delete(lormTipo_hora);
			orm.Reserva lormReserva = orm.ReservaDAO.loadReservaByQuery(null, null);
			// Delete the persistent object
			orm.ReservaDAO.delete(lormReserva);
			orm.Hora_medica lormHora_medica = orm.Hora_medicaDAO.loadHora_medicaByQuery(null, null);
			// Delete the persistent object
			orm.Hora_medicaDAO.delete(lormHora_medica);
			orm.Especialidad_medico lormEspecialidad_medico = orm.Especialidad_medicoDAO.loadEspecialidad_medicoByQuery(null, null);
			// Delete the persistent object
			orm.Especialidad_medicoDAO.delete(lormEspecialidad_medico);
			orm.Reserva_bloque lormReserva_bloque = orm.Reserva_bloqueDAO.loadReserva_bloqueByQuery(null, null);
			// Delete the persistent object
			orm.Reserva_bloqueDAO.delete(lormReserva_bloque);
			orm.Box lormBox = orm.BoxDAO.loadBoxByQuery(null, null);
			// Delete the persistent object
			orm.BoxDAO.delete(lormBox);
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Delete the persistent object
			orm.PersonaDAO.delete(lormPersona);
			orm.Medico lormMedico = orm.MedicoDAO.loadMedicoByQuery(null, null);
			// Delete the persistent object
			orm.MedicoDAO.delete(lormMedico);
			orm.Paciente lormPaciente = orm.PacienteDAO.loadPacienteByQuery(null, null);
			// Delete the persistent object
			orm.PacienteDAO.delete(lormPaciente);
			orm.Director lormDirector = orm.DirectorDAO.loadDirectorByQuery(null, null);
			// Delete the persistent object
			orm.DirectorDAO.delete(lormDirector);
			orm.Especialidad lormEspecialidad = orm.EspecialidadDAO.loadEspecialidadByQuery(null, null);
			// Delete the persistent object
			orm.EspecialidadDAO.delete(lormEspecialidad);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteSintítuloData deleteSintítuloData = new DeleteSintítuloData();
			try {
				deleteSintítuloData.deleteTestData();
			}
			finally {
				orm.SintítuloPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
