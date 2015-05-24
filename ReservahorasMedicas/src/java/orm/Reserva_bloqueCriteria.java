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

public class Reserva_bloqueCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression reservaId;
	public final AssociationExpression reserva;
	public final IntegerExpression hora_medicaId;
	public final AssociationExpression hora_medica;
	public final IntegerExpression tipo_horaId;
	public final AssociationExpression tipo_hora;
	
	public Reserva_bloqueCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		reservaId = new IntegerExpression("reserva.id", this);
		reserva = new AssociationExpression("reserva", this);
		hora_medicaId = new IntegerExpression("hora_medica.id", this);
		hora_medica = new AssociationExpression("hora_medica", this);
		tipo_horaId = new IntegerExpression("tipo_hora.id", this);
		tipo_hora = new AssociationExpression("tipo_hora", this);
	}
	
	public Reserva_bloqueCriteria(PersistentSession session) {
		this(session.createCriteria(Reserva_bloque.class));
	}
	
	public Reserva_bloqueCriteria() throws PersistentException {
		this(orm.SintítuloPersistentManager.instance().getSession());
	}
	
	public ReservaCriteria createReservaCriteria() {
		return new ReservaCriteria(createCriteria("reserva"));
	}
	
	public Hora_medicaCriteria createHora_medicaCriteria() {
		return new Hora_medicaCriteria(createCriteria("hora_medica"));
	}
	
	public Tipo_horaCriteria createTipo_horaCriteria() {
		return new Tipo_horaCriteria(createCriteria("tipo_hora"));
	}
	
	public Reserva_bloque uniqueReserva_bloque() {
		return (Reserva_bloque) super.uniqueResult();
	}
	
	public Reserva_bloque[] listReserva_bloque() {
		java.util.List list = super.list();
		return (Reserva_bloque[]) list.toArray(new Reserva_bloque[list.size()]);
	}
}

