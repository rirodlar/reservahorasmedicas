/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListSintítuloData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Tipo_hora...");
		orm.Tipo_hora[] ormTipo_horas = orm.Tipo_horaDAO.listTipo_horaByQuery(null, null);
		int length = Math.min(ormTipo_horas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormTipo_horas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Reserva...");
		orm.Reserva[] ormReservas = orm.ReservaDAO.listReservaByQuery(null, null);
		length = Math.min(ormReservas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormReservas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Hora_medica...");
		orm.Hora_medica[] ormHora_medicas = orm.Hora_medicaDAO.listHora_medicaByQuery(null, null);
		length = Math.min(ormHora_medicas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormHora_medicas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Especialidad_medico...");
		orm.Especialidad_medico[] ormEspecialidad_medicos = orm.Especialidad_medicoDAO.listEspecialidad_medicoByQuery(null, null);
		length = Math.min(ormEspecialidad_medicos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEspecialidad_medicos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Reserva_bloque...");
		orm.Reserva_bloque[] ormReserva_bloques = orm.Reserva_bloqueDAO.listReserva_bloqueByQuery(null, null);
		length = Math.min(ormReserva_bloques.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormReserva_bloques[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Box...");
		orm.Box[] ormBoxs = orm.BoxDAO.listBoxByQuery(null, null);
		length = Math.min(ormBoxs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormBoxs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Persona...");
		orm.Persona[] ormPersonas = orm.PersonaDAO.listPersonaByQuery(null, null);
		length = Math.min(ormPersonas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Medico...");
		orm.Medico[] ormMedicos = orm.MedicoDAO.listMedicoByQuery(null, null);
		length = Math.min(ormMedicos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormMedicos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paciente...");
		orm.Paciente[] ormPacientes = orm.PacienteDAO.listPacienteByQuery(null, null);
		length = Math.min(ormPacientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPacientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Director...");
		orm.Director[] ormDirectors = orm.DirectorDAO.listDirectorByQuery(null, null);
		length = Math.min(ormDirectors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormDirectors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Especialidad...");
		orm.Especialidad[] ormEspecialidads = orm.EspecialidadDAO.listEspecialidadByQuery(null, null);
		length = Math.min(ormEspecialidads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEspecialidads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Tipo_hora by Criteria...");
		orm.Tipo_horaCriteria lormTipo_horaCriteria = new orm.Tipo_horaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormTipo_horaCriteria.id.eq();
		lormTipo_horaCriteria.setMaxResults(ROW_COUNT);
		orm.Tipo_hora[] ormTipo_horas = lormTipo_horaCriteria.listTipo_hora();
		int length =ormTipo_horas== null ? 0 : Math.min(ormTipo_horas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormTipo_horas[i]);
		}
		System.out.println(length + " Tipo_hora record(s) retrieved."); 
		
		System.out.println("Listing Reserva by Criteria...");
		orm.ReservaCriteria lormReservaCriteria = new orm.ReservaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormReservaCriteria.id.eq();
		lormReservaCriteria.setMaxResults(ROW_COUNT);
		orm.Reserva[] ormReservas = lormReservaCriteria.listReserva();
		length =ormReservas== null ? 0 : Math.min(ormReservas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormReservas[i]);
		}
		System.out.println(length + " Reserva record(s) retrieved."); 
		
		System.out.println("Listing Hora_medica by Criteria...");
		orm.Hora_medicaCriteria lormHora_medicaCriteria = new orm.Hora_medicaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormHora_medicaCriteria.id.eq();
		lormHora_medicaCriteria.setMaxResults(ROW_COUNT);
		orm.Hora_medica[] ormHora_medicas = lormHora_medicaCriteria.listHora_medica();
		length =ormHora_medicas== null ? 0 : Math.min(ormHora_medicas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormHora_medicas[i]);
		}
		System.out.println(length + " Hora_medica record(s) retrieved."); 
		
		System.out.println("Listing Especialidad_medico by Criteria...");
		orm.Especialidad_medicoCriteria lormEspecialidad_medicoCriteria = new orm.Especialidad_medicoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEspecialidad_medicoCriteria.id.eq();
		lormEspecialidad_medicoCriteria.setMaxResults(ROW_COUNT);
		orm.Especialidad_medico[] ormEspecialidad_medicos = lormEspecialidad_medicoCriteria.listEspecialidad_medico();
		length =ormEspecialidad_medicos== null ? 0 : Math.min(ormEspecialidad_medicos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEspecialidad_medicos[i]);
		}
		System.out.println(length + " Especialidad_medico record(s) retrieved."); 
		
		System.out.println("Listing Reserva_bloque by Criteria...");
		orm.Reserva_bloqueCriteria lormReserva_bloqueCriteria = new orm.Reserva_bloqueCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormReserva_bloqueCriteria.id.eq();
		lormReserva_bloqueCriteria.setMaxResults(ROW_COUNT);
		orm.Reserva_bloque[] ormReserva_bloques = lormReserva_bloqueCriteria.listReserva_bloque();
		length =ormReserva_bloques== null ? 0 : Math.min(ormReserva_bloques.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormReserva_bloques[i]);
		}
		System.out.println(length + " Reserva_bloque record(s) retrieved."); 
		
		System.out.println("Listing Box by Criteria...");
		orm.BoxCriteria lormBoxCriteria = new orm.BoxCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormBoxCriteria.id_box.eq();
		lormBoxCriteria.setMaxResults(ROW_COUNT);
		orm.Box[] ormBoxs = lormBoxCriteria.listBox();
		length =ormBoxs== null ? 0 : Math.min(ormBoxs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormBoxs[i]);
		}
		System.out.println(length + " Box record(s) retrieved."); 
		
		System.out.println("Listing Persona by Criteria...");
		orm.PersonaCriteria lormPersonaCriteria = new orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersonaCriteria.id.eq();
		lormPersonaCriteria.setMaxResults(ROW_COUNT);
		orm.Persona[] ormPersonas = lormPersonaCriteria.listPersona();
		length =ormPersonas== null ? 0 : Math.min(ormPersonas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " Persona record(s) retrieved."); 
		
		System.out.println("Listing Medico by Criteria...");
		orm.MedicoCriteria lormMedicoCriteria = new orm.MedicoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormMedicoCriteria.id.eq();
		lormMedicoCriteria.setMaxResults(ROW_COUNT);
		orm.Medico[] ormMedicos = lormMedicoCriteria.listMedico();
		length =ormMedicos== null ? 0 : Math.min(ormMedicos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormMedicos[i]);
		}
		System.out.println(length + " Medico record(s) retrieved."); 
		
		System.out.println("Listing Paciente by Criteria...");
		orm.PacienteCriteria lormPacienteCriteria = new orm.PacienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPacienteCriteria.id.eq();
		lormPacienteCriteria.setMaxResults(ROW_COUNT);
		orm.Paciente[] ormPacientes = lormPacienteCriteria.listPaciente();
		length =ormPacientes== null ? 0 : Math.min(ormPacientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPacientes[i]);
		}
		System.out.println(length + " Paciente record(s) retrieved."); 
		
		System.out.println("Listing Director by Criteria...");
		orm.DirectorCriteria lormDirectorCriteria = new orm.DirectorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormDirectorCriteria.id.eq();
		lormDirectorCriteria.setMaxResults(ROW_COUNT);
		orm.Director[] ormDirectors = lormDirectorCriteria.listDirector();
		length =ormDirectors== null ? 0 : Math.min(ormDirectors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormDirectors[i]);
		}
		System.out.println(length + " Director record(s) retrieved."); 
		
		System.out.println("Listing Especialidad by Criteria...");
		orm.EspecialidadCriteria lormEspecialidadCriteria = new orm.EspecialidadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEspecialidadCriteria.id.eq();
		lormEspecialidadCriteria.setMaxResults(ROW_COUNT);
		orm.Especialidad[] ormEspecialidads = lormEspecialidadCriteria.listEspecialidad();
		length =ormEspecialidads== null ? 0 : Math.min(ormEspecialidads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEspecialidads[i]);
		}
		System.out.println(length + " Especialidad record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListSintítuloData listSintítuloData = new ListSintítuloData();
			try {
				listSintítuloData.listTestData();
				//listSintítuloData.listByCriteria();
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
