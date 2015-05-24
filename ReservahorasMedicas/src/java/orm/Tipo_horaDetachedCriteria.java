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

public class Tipo_horaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression descripcion;
	public final CollectionExpression reserva_bloque;
	
	public Tipo_horaDetachedCriteria() {
		super(orm.Tipo_hora.class, orm.Tipo_horaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		reserva_bloque = new CollectionExpression("ORM_reserva_bloque", this.getDetachedCriteria());
	}
	
	public Tipo_horaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Tipo_horaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		reserva_bloque = new CollectionExpression("ORM_reserva_bloque", this.getDetachedCriteria());
	}
	
	public Reserva_bloqueDetachedCriteria createReserva_bloqueCriteria() {
		return new Reserva_bloqueDetachedCriteria(createCriteria("ORM_reserva_bloque"));
	}
	
	public Tipo_hora uniqueTipo_hora(PersistentSession session) {
		return (Tipo_hora) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tipo_hora[] listTipo_hora(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tipo_hora[]) list.toArray(new Tipo_hora[list.size()]);
	}
}

