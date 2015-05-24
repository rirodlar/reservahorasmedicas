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
@Table(name="persona")
public class Persona implements Serializable {
	public Persona() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PERSONA_RESERVA) {
			return ORM_reserva;
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
	@GeneratedValue(generator="ORM_PERSONA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_PERSONA_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="rut", nullable=true, length=15)	
	private String rut;
	
	@Column(name="nombres", nullable=true, length=50)	
	private String nombres;
	
	@Column(name="apellido_paterno", nullable=true, length=60)	
	private String apellido_paterno;
	
	@Column(name="apellido_materno", nullable=true, length=50)	
	private String apellido_materno;
	
	@Column(name="email", nullable=true, length=75)	
	private String email;
	
	@Column(name="fecha_nacimiento", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha_nacimiento;
	
	@OneToMany(mappedBy="persona_id_ingresa_reserva", targetEntity=orm.Reserva.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.FALSE)	
	private java.util.Set ORM_reserva = new java.util.HashSet();
	
	@OneToOne(mappedBy="persona", targetEntity=orm.Medico.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	public orm.Medico medico;
	
	@OneToOne(mappedBy="persona", targetEntity=orm.Paciente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	public orm.Paciente paciente;
	
	@OneToOne(mappedBy="persona", targetEntity=orm.Director.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	public orm.Director director;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setRut(String value) {
		this.rut = value;
	}
	
	public String getRut() {
		return rut;
	}
	
	public void setNombres(String value) {
		this.nombres = value;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public void setApellido_paterno(String value) {
		this.apellido_paterno = value;
	}
	
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	
	public void setApellido_materno(String value) {
		this.apellido_materno = value;
	}
	
	public String getApellido_materno() {
		return apellido_materno;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setFecha_nacimiento(java.util.Date value) {
		this.fecha_nacimiento = value;
	}
	
	public java.util.Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	
	private void setORM_Reserva(java.util.Set value) {
		this.ORM_reserva = value;
	}
	
	private java.util.Set getORM_Reserva() {
		return ORM_reserva;
	}
	
	@Transient	
	public final orm.ReservaSetCollection reserva = new orm.ReservaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PERSONA_RESERVA, orm.ORMConstants.KEY_RESERVA_PERSONA_ID_INGRESA_RESERVA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setMedico(orm.Medico value) {
		if (this.medico != value) {
			orm.Medico lmedico = this.medico;
			this.medico = value;
			if (value != null) {
				medico.setPersona(this);
			}
			else {
				lmedico.setPersona(null);
			}
		}
	}
	
	public orm.Medico getMedico() {
		return medico;
	}
	
	public void setPaciente(orm.Paciente value) {
		if (this.paciente != value) {
			orm.Paciente lpaciente = this.paciente;
			this.paciente = value;
			if (value != null) {
				paciente.setPersona(this);
			}
			else {
				lpaciente.setPersona(null);
			}
		}
	}
	
	public orm.Paciente getPaciente() {
		return paciente;
	}
	
	public void setDirector(orm.Director value) {
		if (this.director != value) {
			orm.Director ldirector = this.director;
			this.director = value;
			if (value != null) {
				director.setPersona(this);
			}
			else {
				ldirector.setPersona(null);
			}
		}
	}
	
	public orm.Director getDirector() {
		return director;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
