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

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="medico")
public class Medico implements Serializable {
	public Medico() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_MEDICO_HORA_MEDICA) {
			return ORM_hora_medica;
		}
		else if (key == orm.ORMConstants.KEY_MEDICO_ESPECIALIDAD_MEDICO) {
			return ORM_especialidad_medico;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_MEDICO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_MEDICO_ID_GENERATOR", strategy="native")
        @Expose
	private int id;
	
	@OneToOne(targetEntity=orm.Persona.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="persona_id", nullable=false) })
        @Expose
	public orm.Persona persona;
	
	@OneToMany(mappedBy="medico", targetEntity=orm.Hora_medica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.FALSE)	
	private java.util.Set ORM_hora_medica = new java.util.HashSet();
	
	@OneToMany(mappedBy="medico", targetEntity=orm.Especialidad_medico.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.FALSE)	
	private java.util.Set ORM_especialidad_medico = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPersona(orm.Persona value) {
		if (this.persona != value) {
			orm.Persona lpersona = this.persona;
			this.persona = value;
			if (value != null) {
				persona.setMedico(this);
			}
			else {
				lpersona.setMedico(null);
			}
		}
	}
	
	public orm.Persona getPersona() {
		return persona;
	}
	
	private void setORM_Hora_medica(java.util.Set value) {
		this.ORM_hora_medica = value;
	}
	
	private java.util.Set getORM_Hora_medica() {
		return ORM_hora_medica;
	}
	
	@Transient	
	public final orm.Hora_medicaSetCollection hora_medica = new orm.Hora_medicaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_MEDICO_HORA_MEDICA, orm.ORMConstants.KEY_HORA_MEDICA_MEDICO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Especialidad_medico(java.util.Set value) {
		this.ORM_especialidad_medico = value;
	}
	
	private java.util.Set getORM_Especialidad_medico() {
		return ORM_especialidad_medico;
	}
	
	@Transient	
	public final orm.Especialidad_medicoSetCollection especialidad_medico = new orm.Especialidad_medicoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_MEDICO_ESPECIALIDAD_MEDICO, orm.ORMConstants.KEY_ESPECIALIDAD_MEDICO_MEDICO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
