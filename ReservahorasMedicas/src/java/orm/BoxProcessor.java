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
public class BoxProcessor {
	private int id_box;
	
	private String nombre;
	
	private String action="";
	
	public void setId_box(int value) {
		this.id_box = value;
	}
	
	public int getId_box() {
		return id_box;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre == null ? "" : nombre;
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
				orm.Box _box = orm.BoxDAO.loadBoxByORMID(getId_box());
				if (_box!= null) {
					copyFromBean(_box);
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
				orm.Box _box = orm.BoxDAO.createBox();
				copyToBean(_box);
				if (orm.BoxDAO.save(_box)) {
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
				orm.Box _box= orm.BoxDAO.loadBoxByORMID(getId_box());
				if (_box != null) {
					copyToBean(_box);
					if (orm.BoxDAO.save(_box)) {
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
				orm.Box _box = orm.BoxDAO.loadBoxByORMID(getId_box());
				if (_box != null && orm.BoxDAO.deleteAndDissociate(_box)) {
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
	
	private void copyFromBean(orm.Box _box) {
		setNombre(_box.getNombre());
		setId_box(_box.getORMID());
	}
	
	private void copyToBean(orm.Box _box) {
		_box.setNombre(getNombre());
	}
	
}

