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
@Table(name="tipo_hora")
public class Tipo_hora implements Serializable {
	public Tipo_hora() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TIPO_HORA_RESERVA_BLOQUE) {
			return ORM_reserva_bloque;
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
	@GeneratedValue(generator="ORM_TIPO_HORA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_TIPO_HORA_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="descripcion", nullable=true, length=20)	
	private String descripcion;
	
	@OneToMany(mappedBy="tipo_hora", targetEntity=orm.Reserva_bloque.class)	
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
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	private void setORM_Reserva_bloque(java.util.Set value) {
		this.ORM_reserva_bloque = value;
	}
	
	private java.util.Set getORM_Reserva_bloque() {
		return ORM_reserva_bloque;
	}
	
	@Transient	
	public final orm.Reserva_bloqueSetCollection reserva_bloque = new orm.Reserva_bloqueSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TIPO_HORA_RESERVA_BLOQUE, orm.ORMConstants.KEY_RESERVA_BLOQUE_TIPO_HORA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
