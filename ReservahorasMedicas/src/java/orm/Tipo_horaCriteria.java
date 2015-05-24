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

public class Tipo_horaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression descripcion;
	public final CollectionExpression reserva_bloque;
	
	public Tipo_horaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		descripcion = new StringExpression("descripcion", this);
		reserva_bloque = new CollectionExpression("ORM_reserva_bloque", this);
	}
	
	public Tipo_horaCriteria(PersistentSession session) {
		this(session.createCriteria(Tipo_hora.class));
	}
	
	public Tipo_horaCriteria() throws PersistentException {
		this(orm.SintítuloPersistentManager.instance().getSession());
	}
	
	public Reserva_bloqueCriteria createReserva_bloqueCriteria() {
		return new Reserva_bloqueCriteria(createCriteria("ORM_reserva_bloque"));
	}
	
	public Tipo_hora uniqueTipo_hora() {
		return (Tipo_hora) super.uniqueResult();
	}
	
	public Tipo_hora[] listTipo_hora() {
		java.util.List list = super.list();
		return (Tipo_hora[]) list.toArray(new Tipo_hora[list.size()]);
	}
}

