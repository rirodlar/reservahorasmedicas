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
@Table(name="reserva_bloque")
public class Reserva_bloque implements Serializable {
	public Reserva_bloque() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_RESERVA_BLOQUE_TIPO_HORA) {
			this.tipo_hora = (orm.Tipo_hora) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_RESERVA_BLOQUE_RESERVA) {
			this.reserva = (orm.Reserva) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_RESERVA_BLOQUE_HORA_MEDICA) {
			this.hora_medica = (orm.Hora_medica) owner;
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
	@GeneratedValue(generator="ORM_RESERVA_BLOQUE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_RESERVA_BLOQUE_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=orm.Reserva.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="reserva_id", referencedColumnName="id", nullable=false) })	
	public orm.Reserva reserva;
	
	@OneToOne(targetEntity=orm.Hora_medica.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="hora_medica_id", nullable=false) })	
	public orm.Hora_medica hora_medica;
	
	@ManyToOne(targetEntity=orm.Tipo_hora.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="tipo_horaid", referencedColumnName="id", nullable=false) })	
	public orm.Tipo_hora tipo_hora;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setTipo_hora(orm.Tipo_hora value) {
		if (tipo_hora != null) {
			tipo_hora.reserva_bloque.remove(this);
		}
		if (value != null) {
			value.reserva_bloque.add(this);
		}
	}
	
	public orm.Tipo_hora getTipo_hora() {
		return tipo_hora;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tipo_hora(orm.Tipo_hora value) {
		this.tipo_hora = value;
	}
	
	private orm.Tipo_hora getORM_Tipo_hora() {
		return tipo_hora;
	}
	
	public void setReserva(orm.Reserva value) {
		if (reserva != null) {
			reserva.reserva_bloque.remove(this);
		}
		if (value != null) {
			value.reserva_bloque.add(this);
		}
	}
	
	public orm.Reserva getReserva() {
		return reserva;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Reserva(orm.Reserva value) {
		this.reserva = value;
	}
	
	private orm.Reserva getORM_Reserva() {
		return reserva;
	}
	
	public void setHora_medica(orm.Hora_medica value) {
		if (this.hora_medica != value) {
			orm.Hora_medica lhora_medica = this.hora_medica;
			this.hora_medica = value;
			if (value != null) {
				hora_medica.setReserva_bloque(this);
			}
			else {
				lhora_medica.setReserva_bloque(null);
			}
		}
	}
	
	public orm.Hora_medica getHora_medica() {
		return hora_medica;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
