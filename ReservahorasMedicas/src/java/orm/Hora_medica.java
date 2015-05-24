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
@Table(name="hora_medica")
public class Hora_medica implements Serializable {
	public Hora_medica() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_HORA_MEDICA_BOX) {
			this.box = (orm.Box) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_HORA_MEDICA_MEDICO) {
			this.medico = (orm.Medico) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_HORA_MEDICA_RESERVA_BLOQUE) {
			this.reserva_bloque = (orm.Reserva_bloque) owner;
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
	@GeneratedValue(generator="ORM_HORA_MEDICA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_HORA_MEDICA_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=orm.Box.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="box_id", referencedColumnName="id_box", nullable=false) })	
	public orm.Box box;
	
	@ManyToOne(targetEntity=orm.Medico.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="medico_id", referencedColumnName="id", nullable=false) })	
	public orm.Medico medico;
	
	@Column(name="hora_inicio", nullable=true)	
	private java.sql.Timestamp hora_inicio;
	
	@Column(name="tiempo_periodo", nullable=true, length=10)	
	private int tiempo_periodo = 15;
	
	@OneToOne(mappedBy="hora_medica", targetEntity=orm.Reserva_bloque.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	public orm.Reserva_bloque reserva_bloque;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
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
	
	public void setBox(orm.Box value) {
		if (box != null) {
			box.hora_medica.remove(this);
		}
		if (value != null) {
			value.hora_medica.add(this);
		}
	}
	
	public orm.Box getBox() {
		return box;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Box(orm.Box value) {
		this.box = value;
	}
	
	private orm.Box getORM_Box() {
		return box;
	}
	
	public void setMedico(orm.Medico value) {
		if (medico != null) {
			medico.hora_medica.remove(this);
		}
		if (value != null) {
			value.hora_medica.add(this);
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
	
	public void setReserva_bloque(orm.Reserva_bloque value) {
		if (this.reserva_bloque != value) {
			orm.Reserva_bloque lreserva_bloque = this.reserva_bloque;
			this.reserva_bloque = value;
			if (value != null) {
				reserva_bloque.setHora_medica(this);
			}
			else {
				lreserva_bloque.setHora_medica(null);
			}
		}
	}
	
	public orm.Reserva_bloque getReserva_bloque() {
		return reserva_bloque;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
