/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateSintítuloData {
	public void createTestData() throws PersistentException {
		// Insert sample data
		PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
		PersistentTransaction transaction = session.beginTransaction();
		try {
			session.doWork(new org.hibernate.jdbc.Work() {
				public void execute(java.sql.Connection conn) throws java.sql.SQLException {
					java.sql.Statement statement = conn.createStatement();
					statement.executeUpdate("INSERT INTO persona(id, rut, nombres, apellido_paterno, apellido_materno, email, fecha_nacimiento) VALUES (1, '15600399-9', 'ricardo', 'rodriguez', 'lara', 'ricardo.rodriguez.lara@gmail.com', '26-09-1983')");
					statement.executeUpdate("INSERT INTO persona(id, rut, nombres, apellido_paterno, apellido_materno, email, fecha_nacimiento) VALUES (2, '15850096-5', 'matias', 'rodriguez', 'lara', 'matiasro@gmail.com', '12-05-1985')");
					statement.executeUpdate("INSERT INTO persona(id, rut, nombres, apellido_paterno, apellido_materno, email, fecha_nacimiento) VALUES (3, '5555555-5', 'gaston', 'briceño', 'briceño', 'gbriceñe@gmail.com', '')");
					statement.close();
				}
			});
			transaction.commit();
		}
		catch (Exception e) {
			try {
				transaction.rollback();
			}
			catch (PersistentException e1) {
				e.printStackTrace();
			}
			e.printStackTrace();
		}
		
		PersistentTransaction t = orm.SintítuloPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Tipo_hora lormTipo_hora = orm.Tipo_horaDAO.createTipo_hora();
                        
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva_bloque
			orm.Tipo_horaDAO.save(lormTipo_hora);
			orm.Reserva lormReserva = orm.ReservaDAO.createReserva();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva_bloque, persona_id_ingresa_reserva, paciente
			orm.ReservaDAO.save(lormReserva);
			orm.Hora_medica lormHora_medica = orm.Hora_medicaDAO.createHora_medica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva_bloque, medico, box
			orm.Hora_medicaDAO.save(lormHora_medica);
			orm.Especialidad_medico lormEspecialidad_medico = orm.Especialidad_medicoDAO.createEspecialidad_medico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : medico, especialidad
			orm.Especialidad_medicoDAO.save(lormEspecialidad_medico);
			orm.Reserva_bloque lormReserva_bloque = orm.Reserva_bloqueDAO.createReserva_bloque();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tipo_hora, hora_medica, reserva
			orm.Reserva_bloqueDAO.save(lormReserva_bloque);
			orm.Box lormBox = orm.BoxDAO.createBox();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : hora_medica
			orm.BoxDAO.save(lormBox);
			orm.Persona lormPersona = orm.PersonaDAO.createPersona();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : director, paciente, medico, reserva
			orm.PersonaDAO.save(lormPersona);
			orm.Medico lormMedico = orm.MedicoDAO.createMedico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : especialidad_medico, hora_medica, persona
			orm.MedicoDAO.save(lormMedico);
			orm.Paciente lormPaciente = orm.PacienteDAO.createPaciente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva, persona
			orm.PacienteDAO.save(lormPaciente);
			orm.Director lormDirector = orm.DirectorDAO.createDirector();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : persona
			orm.DirectorDAO.save(lormDirector);
			orm.Especialidad lormEspecialidad = orm.EspecialidadDAO.createEspecialidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : especialidad_medico
			orm.EspecialidadDAO.save(lormEspecialidad);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateSintítuloData createSintítuloData = new CreateSintítuloData();
			try {
				createSintítuloData.createTestData();
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
