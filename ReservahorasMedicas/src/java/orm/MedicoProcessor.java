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
public class MedicoProcessor {
	private int id;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int persona_personaid;
	
	public void setPersona_personaid(int value) {
		this.persona_personaid = value;
	}
	
	public int getPersona_personaid() {
		return persona_personaid;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.Medico _medico = orm.MedicoDAO.loadMedicoByORMID(getId());
				if (_medico!= null) {
					copyFromBean(_medico);
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
				orm.Medico _medico = orm.MedicoDAO.createMedico();
				copyToBean(_medico);
				if (orm.MedicoDAO.save(_medico)) {
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
				orm.Medico _medico= orm.MedicoDAO.loadMedicoByORMID(getId());
				if (_medico != null) {
					copyToBean(_medico);
					if (orm.MedicoDAO.save(_medico)) {
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
				orm.Medico _medico = orm.MedicoDAO.loadMedicoByORMID(getId());
				if (_medico != null && orm.MedicoDAO.deleteAndDissociate(_medico)) {
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
	
	private void copyFromBean(orm.Medico _medico) {
		setId(_medico.getORMID());
		
		{
			orm.Persona _persona = _medico.getPersona();
			if (_persona != null) {
				setPersona_personaid(_persona.getORMID());
			}
		}
		
	}
	
	private void copyToBean(orm.Medico _medico) {
		try  {
			orm.Persona _persona = orm.PersonaDAO.loadPersonaByORMID(getPersona_personaid());
			_medico.setPersona(_persona);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

