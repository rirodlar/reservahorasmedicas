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
public class Reserva_bloqueProcessor {
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
	
	private int tipo_hora_tipo_horaid;
	
	public void setTipo_hora_tipo_horaid(int value) {
		this.tipo_hora_tipo_horaid = value;
	}
	
	public int getTipo_hora_tipo_horaid() {
		return tipo_hora_tipo_horaid;
	}
	
	private int reserva_reservaid;
	
	public void setReserva_reservaid(int value) {
		this.reserva_reservaid = value;
	}
	
	public int getReserva_reservaid() {
		return reserva_reservaid;
	}
	
	private int hora_medica_hora_medicaid;
	
	public void setHora_medica_hora_medicaid(int value) {
		this.hora_medica_hora_medicaid = value;
	}
	
	public int getHora_medica_hora_medicaid() {
		return hora_medica_hora_medicaid;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.Reserva_bloque _reserva_bloque = orm.Reserva_bloqueDAO.loadReserva_bloqueByORMID(getId());
				if (_reserva_bloque!= null) {
					copyFromBean(_reserva_bloque);
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
				orm.Reserva_bloque _reserva_bloque = orm.Reserva_bloqueDAO.createReserva_bloque();
				copyToBean(_reserva_bloque);
				if (orm.Reserva_bloqueDAO.save(_reserva_bloque)) {
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
				orm.Reserva_bloque _reserva_bloque= orm.Reserva_bloqueDAO.loadReserva_bloqueByORMID(getId());
				if (_reserva_bloque != null) {
					copyToBean(_reserva_bloque);
					if (orm.Reserva_bloqueDAO.save(_reserva_bloque)) {
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
				orm.Reserva_bloque _reserva_bloque = orm.Reserva_bloqueDAO.loadReserva_bloqueByORMID(getId());
				if (_reserva_bloque != null && orm.Reserva_bloqueDAO.deleteAndDissociate(_reserva_bloque)) {
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
	
	private void copyFromBean(orm.Reserva_bloque _reserva_bloque) {
		setId(_reserva_bloque.getORMID());
		
		{
			orm.Tipo_hora _tipo_hora = _reserva_bloque.getTipo_hora();
			if (_tipo_hora != null) {
				setTipo_hora_tipo_horaid(_tipo_hora.getORMID());
			}
		}
		
		
		{
			orm.Reserva _reserva = _reserva_bloque.getReserva();
			if (_reserva != null) {
				setReserva_reservaid(_reserva.getORMID());
			}
		}
		
		
		{
			orm.Hora_medica _hora_medica = _reserva_bloque.getHora_medica();
			if (_hora_medica != null) {
				setHora_medica_hora_medicaid(_hora_medica.getORMID());
			}
		}
		
	}
	
	private void copyToBean(orm.Reserva_bloque _reserva_bloque) {
		try  {
			orm.Tipo_hora _tipo_hora = orm.Tipo_horaDAO.loadTipo_horaByORMID(getTipo_hora_tipo_horaid());
			_reserva_bloque.setTipo_hora(_tipo_hora);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.Reserva _reserva = orm.ReservaDAO.loadReservaByORMID(getReserva_reservaid());
			_reserva_bloque.setReserva(_reserva);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.Hora_medica _hora_medica = orm.Hora_medicaDAO.loadHora_medicaByORMID(getHora_medica_hora_medicaid());
			_reserva_bloque.setHora_medica(_hora_medica);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

