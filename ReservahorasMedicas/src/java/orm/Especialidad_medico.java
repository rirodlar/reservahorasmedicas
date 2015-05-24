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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="especialidad_medico")
public class Especialidad_medico implements Serializable {
	public Especialidad_medico() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ESPECIALIDAD_MEDICO_MEDICO) {
			this.medico = (orm.Medico) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_ESPECIALIDAD_MEDICO_ESPECIALIDAD) {
			this.especialidad = (orm.Especialidad) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_ESPECIALIDAD_MEDICO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_ESPECIALIDAD_MEDICO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=orm.Especialidad.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="especialidad_id", referencedColumnName="id", nullable=false) })	
	public orm.Especialidad especialidad;
	
	@ManyToOne(targetEntity=orm.Medico.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="medico_id", referencedColumnName="id", nullable=false) })	
	public orm.Medico medico;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setMedico(orm.Medico value) {
		if (medico != null) {
			medico.especialidad_medico.remove(this);
		}
		if (value != null) {
			value.especialidad_medico.add(this);
		}
	}
	
	public orm.Medico getMedico() {
		return medico;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Medico(orm.Medico value) {
		this.medico = value;
	}
	
	private orm.Medico getORM_Medico() {
		return medico;
	}
	
	public void setEspecialidad(orm.Especialidad value) {
		if (especialidad != null) {
			especialidad.especialidad_medico.remove(this);
		}
		if (value != null) {
			value.especialidad_medico.add(this);
		}
	}
	
	public orm.Especialidad getEspecialidad() {
		return especialidad;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Especialidad(orm.Especialidad value) {
		this.especialidad = value;
	}
	
	private orm.Especialidad getORM_Especialidad() {
		return especialidad;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
