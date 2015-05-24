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

public class Reserva_bloqueDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression reservaId;
	public final AssociationExpression reserva;
	public final IntegerExpression hora_medicaId;
	public final AssociationExpression hora_medica;
	public final IntegerExpression tipo_horaId;
	public final AssociationExpression tipo_hora;
	
	public Reserva_bloqueDetachedCriteria() {
		super(orm.Reserva_bloque.class, orm.Reserva_bloqueCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		reservaId = new IntegerExpression("reserva.id", this.getDetachedCriteria());
		reserva = new AssociationExpression("reserva", this.getDetachedCriteria());
		hora_medicaId = new IntegerExpression("hora_medica.id", this.getDetachedCriteria());
		hora_medica = new AssociationExpression("hora_medica", this.getDetachedCriteria());
		tipo_horaId = new IntegerExpression("tipo_hora.id", this.getDetachedCriteria());
		tipo_hora = new AssociationExpression("tipo_hora", this.getDetachedCriteria());
	}
	
	public Reserva_bloqueDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Reserva_bloqueCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		reservaId = new IntegerExpression("reserva.id", this.getDetachedCriteria());
		reserva = new AssociationExpression("reserva", this.getDetachedCriteria());
		hora_medicaId = new IntegerExpression("hora_medica.id", this.getDetachedCriteria());
		hora_medica = new AssociationExpression("hora_medica", this.getDetachedCriteria());
		tipo_horaId = new IntegerExpression("tipo_hora.id", this.getDetachedCriteria());
		tipo_hora = new AssociationExpression("tipo_hora", this.getDetachedCriteria());
	}
	
	public ReservaDetachedCriteria createReservaCriteria() {
		return new ReservaDetachedCriteria(createCriteria("reserva"));
	}
	
	public Hora_medicaDetachedCriteria createHora_medicaCriteria() {
		return new Hora_medicaDetachedCriteria(createCriteria("hora_medica"));
	}
	
	public Tipo_horaDetachedCriteria createTipo_horaCriteria() {
		return new Tipo_horaDetachedCriteria(createCriteria("tipo_hora"));
	}
	
	public Reserva_bloque uniqueReserva_bloque(PersistentSession session) {
		return (Reserva_bloque) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Reserva_bloque[] listReserva_bloque(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Reserva_bloque[]) list.toArray(new Reserva_bloque[list.size()]);
	}
}

