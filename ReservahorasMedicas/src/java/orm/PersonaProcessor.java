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
public class PersonaProcessor {
	private int id;
	
	private String rut;
	
	private String nombres;
	
	private String apellido_paterno;
	
	private String apellido_materno;
	
	private String email;
	
	private java.util.Date fecha_nacimiento;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setRut(String value) {
		this.rut = value;
	}
	
	public String getRut() {
		return rut == null ? "" : rut;
	}
	
	public void setNombres(String value) {
		this.nombres = value;
	}
	
	public String getNombres() {
		return nombres == null ? "" : nombres;
	}
	
	public void setApellido_paterno(String value) {
		this.apellido_paterno = value;
	}
	
	public String getApellido_paterno() {
		return apellido_paterno == null ? "" : apellido_paterno;
	}
	
	public void setApellido_materno(String value) {
		this.apellido_materno = value;
	}
	
	public String getApellido_materno() {
		return apellido_materno == null ? "" : apellido_materno;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email == null ? "" : email;
	}
	
	public void setFecha_nacimiento(java.util.Date value) {
		this.fecha_nacimiento = value;
	}
	
	public java.util.Date getFecha_nacimiento() {
		return fecha_nacimiento;
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
	
	private int paciente_pacienteid;
	
	public void setPaciente_pacienteid(int value) {
		this.paciente_pacienteid = value;
	}
	
	public int getPaciente_pacienteid() {
		return paciente_pacienteid;
	}
	
	private int director_directorid;
	
	public void setDirector_directorid(int value) {
		this.director_directorid = value;
	}
	
	public int getDirector_directorid() {
		return director_directorid;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.Persona _persona = orm.PersonaDAO.loadPersonaByORMID(getId());
				if (_persona!= null) {
					copyFromBean(_persona);
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
				orm.Persona _persona = orm.PersonaDAO.createPersona();
				copyToBean(_persona);
				if (orm.PersonaDAO.save(_persona)) {
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
				orm.Persona _persona= orm.PersonaDAO.loadPersonaByORMID(getId());
				if (_persona != null) {
					copyToBean(_persona);
					if (orm.PersonaDAO.save(_persona)) {
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
				orm.Persona _persona = orm.PersonaDAO.loadPersonaByORMID(getId());
				if (_persona != null && orm.PersonaDAO.deleteAndDissociate(_persona)) {
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
	
	private void copyFromBean(orm.Persona _persona) {
		setRut(_persona.getRut());
		setNombres(_persona.getNombres());
		setApellido_paterno(_persona.getApellido_paterno());
		setApellido_materno(_persona.getApellido_materno());
		setEmail(_persona.getEmail());
		setFecha_nacimiento(_persona.getFecha_nacimiento());
		setId(_persona.getORMID());
		
		{
			orm.Medico _medico = _persona.getMedico();
			if (_medico != null) {
				setMedico_medicoid(_medico.getORMID());
			}
		}
		
		
		{
			orm.Paciente _paciente = _persona.getPaciente();
			if (_paciente != null) {
				setPaciente_pacienteid(_paciente.getORMID());
			}
		}
		
		
		{
			orm.Director _director = _persona.getDirector();
			if (_director != null) {
				setDirector_directorid(_director.getORMID());
			}
		}
		
	}
	
	private void copyToBean(orm.Persona _persona) {
		_persona.setRut(getRut());
		_persona.setNombres(getNombres());
		_persona.setApellido_paterno(getApellido_paterno());
		_persona.setApellido_materno(getApellido_materno());
		_persona.setEmail(getEmail());
		_persona.setFecha_nacimiento(getFecha_nacimiento());
		try  {
			orm.Medico _medico = orm.MedicoDAO.loadMedicoByORMID(getMedico_medicoid());
			_persona.setMedico(_medico);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.Paciente _paciente = orm.PacienteDAO.loadPacienteByORMID(getPaciente_pacienteid());
			_persona.setPaciente(_paciente);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.Director _director = orm.DirectorDAO.loadDirectorByORMID(getDirector_directorid());
			_persona.setDirector(_director);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

