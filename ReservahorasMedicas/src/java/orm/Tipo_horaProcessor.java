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
public class Tipo_horaProcessor {
	private int id;
	
	private String descripcion;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion == null ? "" : descripcion;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.Tipo_hora _tipo_hora = orm.Tipo_horaDAO.loadTipo_horaByORMID(getId());
				if (_tipo_hora!= null) {
					copyFromBean(_tipo_hora);
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
				orm.Tipo_hora _tipo_hora = orm.Tipo_horaDAO.createTipo_hora();
				copyToBean(_tipo_hora);
				if (orm.Tipo_horaDAO.save(_tipo_hora)) {
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
				orm.Tipo_hora _tipo_hora= orm.Tipo_horaDAO.loadTipo_horaByORMID(getId());
				if (_tipo_hora != null) {
					copyToBean(_tipo_hora);
					if (orm.Tipo_horaDAO.save(_tipo_hora)) {
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
				orm.Tipo_hora _tipo_hora = orm.Tipo_horaDAO.loadTipo_horaByORMID(getId());
				if (_tipo_hora != null && orm.Tipo_horaDAO.deleteAndDissociate(_tipo_hora)) {
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
	
	private void copyFromBean(orm.Tipo_hora _tipo_hora) {
		setDescripcion(_tipo_hora.getDescripcion());
		setId(_tipo_hora.getORMID());
	}
	
	private void copyToBean(orm.Tipo_hora _tipo_hora) {
		_tipo_hora.setDescripcion(getDescripcion());
	}
	
}

