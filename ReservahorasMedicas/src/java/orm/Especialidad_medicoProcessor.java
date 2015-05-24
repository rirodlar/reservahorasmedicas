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
public class Especialidad_medicoProcessor {
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
	
	private int medico_medicoid;
	
	public void setMedico_medicoid(int value) {
		this.medico_medicoid = value;
	}
	
	public int getMedico_medicoid() {
		return medico_medicoid;
	}
	
	private int especialidad_especialidadid;
	
	public void setEspecialidad_especialidadid(int value) {
		this.especialidad_especialidadid = value;
	}
	
	public int getEspecialidad_especialidadid() {
		return especialidad_especialidadid;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.Especialidad_medico _especialidad_medico = orm.Especialidad_medicoDAO.loadEspecialidad_medicoByORMID(getId());
				if (_especialidad_medico!= null) {
					copyFromBean(_especialidad_medico);
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
				orm.Especialidad_medico _especialidad_medico = orm.Especialidad_medicoDAO.createEspecialidad_medico();
				copyToBean(_especialidad_medico);
				if (orm.Especialidad_medicoDAO.save(_especialidad_medico)) {
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
				orm.Especialidad_medico _especialidad_medico= orm.Especialidad_medicoDAO.loadEspecialidad_medicoByORMID(getId());
				if (_especialidad_medico != null) {
					copyToBean(_especialidad_medico);
					if (orm.Especialidad_medicoDAO.save(_especialidad_medico)) {
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
				orm.Especialidad_medico _especialidad_medico = orm.Especialidad_medicoDAO.loadEspecialidad_medicoByORMID(getId());
				if (_especialidad_medico != null && orm.Especialidad_medicoDAO.deleteAndDissociate(_especialidad_medico)) {
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
	
	private void copyFromBean(orm.Especialidad_medico _especialidad_medico) {
		setId(_especialidad_medico.getORMID());
		
		{
			orm.Medico _medico = _especialidad_medico.getMedico();
			if (_medico != null) {
				setMedico_medicoid(_medico.getORMID());
			}
		}
		
		
		{
			orm.Especialidad _especialidad = _especialidad_medico.getEspecialidad();
			if (_especialidad != null) {
				setEspecialidad_especialidadid(_especialidad.getORMID());
			}
		}
		
	}
	
	private void copyToBean(orm.Especialidad_medico _especialidad_medico) {
		try  {
			orm.Medico _medico = orm.MedicoDAO.loadMedicoByORMID(getMedico_medicoid());
			_especialidad_medico.setMedico(_medico);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.Especialidad _especialidad = orm.EspecialidadDAO.loadEspecialidadByORMID(getEspecialidad_especialidadid());
			_especialidad_medico.setEspecialidad(_especialidad);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

