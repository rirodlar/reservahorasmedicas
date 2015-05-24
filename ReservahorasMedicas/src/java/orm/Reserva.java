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
@Table(name="reserva")
public class Reserva implements Serializable {
	public Reserva() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_RESERVA_RESERVA_BLOQUE) {
			return ORM_reserva_bloque;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_RESERVA_PERSONA_ID_INGRESA_RESERVA) {
			this.persona_id_ingresa_reserva = (orm.Persona) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_RESERVA_PACIENTE) {
			this.paciente = (orm.Paciente) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_RESERVA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_RESERVA_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=orm.Paciente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="paciente_id", referencedColumnName="id", nullable=false) })	
	public orm.Paciente paciente;
	
	@ManyToOne(targetEntity=orm.Persona.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="persona_id_ingresa_reserva", referencedColumnName="id", nullable=false) })	
	public orm.Persona persona_id_ingresa_reserva;
	
	@Column(name="fecha", nullable=true)	
	private java.sql.Timestamp fecha;
	
	@OneToMany(mappedBy="reserva", targetEntity=orm.Reserva_bloque.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.FALSE)	
	private java.util.Set ORM_reserva_bloque = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setFecha(java.sql.Timestamp value) {
		this.fecha = value;
	}
	
	public java.sql.Timestamp getFecha() {
		return fecha;
	}
	
	public void setPersona_id_ingresa_reserva(orm.Persona value) {
		if (persona_id_ingresa_reserva != null) {
			persona_id_ingresa_reserva.reserva.remove(this);
		}
		if (value != null) {
			value.reserva.add(this);
		}
	}
	
	public orm.Persona getPersona_id_ingresa_reserva() {
		return persona_id_ingresa_reserva;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Persona_id_ingresa_reserva(orm.Persona value) {
		this.persona_id_ingresa_reserva = value;
	}
	
	private orm.Persona getORM_Persona_id_ingresa_reserva() {
		return persona_id_ingresa_reserva;
	}
	
	public void setPaciente(orm.Paciente value) {
		if (paciente != null) {
			paciente.reserva.remove(this);
		}
		if (value != null) {
			value.reserva.add(this);
		}
	}
	
	public orm.Paciente getPaciente() {
		return paciente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Paciente(orm.Paciente value) {
		this.paciente = value;
	}
	
	private orm.Paciente getORM_Paciente() {
		return paciente;
	}
	
	private void setORM_Reserva_bloque(java.util.Set value) {
		this.ORM_reserva_bloque = value;
	}
	
	private java.util.Set getORM_Reserva_bloque() {
		return ORM_reserva_bloque;
	}
	
	@Transient	
	public final orm.Reserva_bloqueSetCollection reserva_bloque = new orm.Reserva_bloqueSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_RESERVA_RESERVA_BLOQUE, orm.ORMConstants.KEY_RESERVA_BLOQUE_RESERVA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
