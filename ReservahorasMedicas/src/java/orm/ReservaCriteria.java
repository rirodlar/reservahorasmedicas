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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ReservaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression pacienteId;
	public final AssociationExpression paciente;
	public final IntegerExpression persona_id_ingresa_reservaId;
	public final AssociationExpression persona_id_ingresa_reserva;
	public final TimestampExpression fecha;
	public final CollectionExpression reserva_bloque;
	
	public ReservaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		pacienteId = new IntegerExpression("paciente.id", this);
		paciente = new AssociationExpression("paciente", this);
		persona_id_ingresa_reservaId = new IntegerExpression("persona_id_ingresa_reserva.id", this);
		persona_id_ingresa_reserva = new AssociationExpression("persona_id_ingresa_reserva", this);
		fecha = new TimestampExpression("fecha", this);
		reserva_bloque = new CollectionExpression("ORM_reserva_bloque", this);
	}
	
	public ReservaCriteria(PersistentSession session) {
		this(session.createCriteria(Reserva.class));
	}
	
	public ReservaCriteria() throws PersistentException {
		this(orm.SintítuloPersistentManager.instance().getSession());
	}
	
	public PacienteCriteria createPacienteCriteria() {
		return new PacienteCriteria(createCriteria("paciente"));
	}
	
	public PersonaCriteria createPersona_id_ingresa_reservaCriteria() {
		return new PersonaCriteria(createCriteria("persona_id_ingresa_reserva"));
	}
	
	public Reserva_bloqueCriteria createReserva_bloqueCriteria() {
		return new Reserva_bloqueCriteria(createCriteria("ORM_reserva_bloque"));
	}
	
	public Reserva uniqueReserva() {
		return (Reserva) super.uniqueResult();
	}
	
	public Reserva[] listReserva() {
		java.util.List list = super.list();
		return (Reserva[]) list.toArray(new Reserva[list.size()]);
	}
}

