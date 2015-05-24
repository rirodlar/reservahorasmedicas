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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ReservaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression pacienteId;
	public final AssociationExpression paciente;
	public final IntegerExpression persona_id_ingresa_reservaId;
	public final AssociationExpression persona_id_ingresa_reserva;
	public final TimestampExpression fecha;
	public final CollectionExpression reserva_bloque;
	
	public ReservaDetachedCriteria() {
		super(orm.Reserva.class, orm.ReservaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.id", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
		persona_id_ingresa_reservaId = new IntegerExpression("persona_id_ingresa_reserva.id", this.getDetachedCriteria());
		persona_id_ingresa_reserva = new AssociationExpression("persona_id_ingresa_reserva", this.getDetachedCriteria());
		fecha = new TimestampExpression("fecha", this.getDetachedCriteria());
		reserva_bloque = new CollectionExpression("ORM_reserva_bloque", this.getDetachedCriteria());
	}
	
	public ReservaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ReservaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.id", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
		persona_id_ingresa_reservaId = new IntegerExpression("persona_id_ingresa_reserva.id", this.getDetachedCriteria());
		persona_id_ingresa_reserva = new AssociationExpression("persona_id_ingresa_reserva", this.getDetachedCriteria());
		fecha = new TimestampExpression("fecha", this.getDetachedCriteria());
		reserva_bloque = new CollectionExpression("ORM_reserva_bloque", this.getDetachedCriteria());
	}
	
	public PacienteDetachedCriteria createPacienteCriteria() {
		return new PacienteDetachedCriteria(createCriteria("paciente"));
	}
	
	public PersonaDetachedCriteria createPersona_id_ingresa_reservaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona_id_ingresa_reserva"));
	}
	
	public Reserva_bloqueDetachedCriteria createReserva_bloqueCriteria() {
		return new Reserva_bloqueDetachedCriteria(createCriteria("ORM_reserva_bloque"));
	}
	
	public Reserva uniqueReserva(PersistentSession session) {
		return (Reserva) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Reserva[] listReserva(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Reserva[]) list.toArray(new Reserva[list.size()]);
	}
}

