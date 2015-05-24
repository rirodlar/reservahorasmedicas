/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

import org.orm.PersistentException;
public class ReservaProcessor {
	private int id;
	
	private java.sql.Timestamp fecha;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setFecha(java.sql.Timestamp value) {
		this.fecha = value;
	}
	
	public java.sql.Timestamp getFecha() {
		return fecha;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int persona_id_ingresa_reserva_personaid;
	
	public void setPersona_id_ingresa_reserva_personaid(int value) {
		this.persona_id_ingresa_reserva_personaid = value;
	}
	
	public int getPersona_id_ingresa_reserva_personaid() {
		return persona_id_ingresa_reserva_personaid;
	}
	
	private int paciente_pacienteid;
	
	public void setPaciente_pacienteid(int value) {
		this.paciente_pacienteid = value;
	}
	
	public int getPaciente_pacienteid() {
		return paciente_pacienteid;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.Reserva _reserva = orm.ReservaDAO.loadReservaByORMID(getId());
				if (_reserva!= null) {
					copyFromBean(_reserva);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				orm.Reserva _reserva = orm.ReservaDAO.createReserva();
				copyToBean(_reserva);
				if (orm.ReservaDAO.save(_reserva)) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				orm.Reserva _reserva= orm.ReservaDAO.loadReservaByORMID(getId());
				if (_reserva != null) {
					copyToBean(_reserva);
					if (orm.ReservaDAO.save(_reserva)) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				orm.Reserva _reserva = orm.ReservaDAO.loadReservaByORMID(getId());
				if (_reserva != null && orm.ReservaDAO.deleteAndDissociate(_reserva)) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(orm.Reserva _reserva) {
		setFecha(_reserva.getFecha());
		setId(_reserva.getORMID());
		
		{
			orm.Persona _persona = _reserva.getPersona_id_ingresa_reserva();
			if (_persona != null) {
				setPersona_id_ingresa_reserva_personaid(_persona.getORMID());
			}
		}
		
		
		{
			orm.Paciente _paciente = _reserva.getPaciente();
			if (_paciente != null) {
				setPaciente_pacienteid(_paciente.getORMID());
			}
		}
		
	}
	
	private void copyToBean(orm.Reserva _reserva) {
		_reserva.setFecha(getFecha());
		try  {
			orm.Persona _persona_id_ingresa_reserva = orm.PersonaDAO.loadPersonaByORMID(getPersona_id_ingresa_reserva_personaid());
			_reserva.setPersona_id_ingresa_reserva(_persona_id_ingresa_reserva);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.Paciente _paciente = orm.PacienteDAO.loadPacienteByORMID(getPaciente_pacienteid());
			_reserva.setPaciente(_paciente);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

