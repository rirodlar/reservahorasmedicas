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
public class Hora_medicaProcessor {
	private int id;
	
	private java.sql.Timestamp hora_inicio;
	
	private int tiempo_periodo = 15;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setHora_inicio(java.sql.Timestamp value) {
		this.hora_inicio = value;
	}
	
	public java.sql.Timestamp getHora_inicio() {
		return hora_inicio;
	}
	
	public void setTiempo_periodo(int value) {
		this.tiempo_periodo = value;
	}
	
	public int getTiempo_periodo() {
		return tiempo_periodo;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int box_boxid_box;
	
	public void setBox_boxid_box(int value) {
		this.box_boxid_box = value;
	}
	
	public int getBox_boxid_box() {
		return box_boxid_box;
	}
	
	private int medico_medicoid;
	
	public void setMedico_medicoid(int value) {
		this.medico_medicoid = value;
	}
	
	public int getMedico_medicoid() {
		return medico_medicoid;
	}
	
	private int reserva_bloque_reserva_bloqueid;
	
	public void setReserva_bloque_reserva_bloqueid(int value) {
		this.reserva_bloque_reserva_bloqueid = value;
	}
	
	public int getReserva_bloque_reserva_bloqueid() {
		return reserva_bloque_reserva_bloqueid;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.Hora_medica _hora_medica = orm.Hora_medicaDAO.loadHora_medicaByORMID(getId());
				if (_hora_medica!= null) {
					copyFromBean(_hora_medica);
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
				orm.Hora_medica _hora_medica = orm.Hora_medicaDAO.createHora_medica();
				copyToBean(_hora_medica);
				if (orm.Hora_medicaDAO.save(_hora_medica)) {
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
				orm.Hora_medica _hora_medica= orm.Hora_medicaDAO.loadHora_medicaByORMID(getId());
				if (_hora_medica != null) {
					copyToBean(_hora_medica);
					if (orm.Hora_medicaDAO.save(_hora_medica)) {
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
				orm.Hora_medica _hora_medica = orm.Hora_medicaDAO.loadHora_medicaByORMID(getId());
				if (_hora_medica != null && orm.Hora_medicaDAO.deleteAndDissociate(_hora_medica)) {
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
	
	private void copyFromBean(orm.Hora_medica _hora_medica) {
		setHora_inicio(_hora_medica.getHora_inicio());
		setTiempo_periodo(_hora_medica.getTiempo_periodo());
		setId(_hora_medica.getORMID());
		
		{
			orm.Box _box = _hora_medica.getBox();
			if (_box != null) {
				setBox_boxid_box(_box.getORMID());
			}
		}
		
		
		{
			orm.Medico _medico = _hora_medica.getMedico();
			if (_medico != null) {
				setMedico_medicoid(_medico.getORMID());
			}
		}
		
		
		{
			orm.Reserva_bloque _reserva_bloque = _hora_medica.getReserva_bloque();
			if (_reserva_bloque != null) {
				setReserva_bloque_reserva_bloqueid(_reserva_bloque.getORMID());
			}
		}
		
	}
	
	private void copyToBean(orm.Hora_medica _hora_medica) {
		_hora_medica.setHora_inicio(getHora_inicio());
		_hora_medica.setTiempo_periodo(getTiempo_periodo());
		try  {
			orm.Box _box = orm.BoxDAO.loadBoxByORMID(getBox_boxid_box());
			_hora_medica.setBox(_box);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.Medico _medico = orm.MedicoDAO.loadMedicoByORMID(getMedico_medicoid());
			_hora_medica.setMedico(_medico);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.Reserva_bloque _reserva_bloque = orm.Reserva_bloqueDAO.loadReserva_bloqueByORMID(getReserva_bloque_reserva_bloqueid());
			_hora_medica.setReserva_bloque(_reserva_bloque);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

