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

public class Hora_medicaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression boxId;
	public final AssociationExpression box;
	public final IntegerExpression medicoId;
	public final AssociationExpression medico;
	public final TimestampExpression hora_inicio;
	public final IntegerExpression tiempo_periodo;
	public final IntegerExpression reserva_bloqueId;
	public final AssociationExpression reserva_bloque;
	
	public Hora_medicaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		boxId = new IntegerExpression("box.id_box", this);
		box = new AssociationExpression("box", this);
		medicoId = new IntegerExpression("medico.id", this);
		medico = new AssociationExpression("medico", this);
		hora_inicio = new TimestampExpression("hora_inicio", this);
		tiempo_periodo = new IntegerExpression("tiempo_periodo", this);
		reserva_bloqueId = new IntegerExpression("reserva_bloque.id", this);
		reserva_bloque = new AssociationExpression("reserva_bloque", this);
	}
	
	public Hora_medicaCriteria(PersistentSession session) {
		this(session.createCriteria(Hora_medica.class));
	}
	
	public Hora_medicaCriteria() throws PersistentException {
		this(orm.SintítuloPersistentManager.instance().getSession());
	}
	
	public BoxCriteria createBoxCriteria() {
		return new BoxCriteria(createCriteria("box"));
	}
	
	public MedicoCriteria createMedicoCriteria() {
		return new MedicoCriteria(createCriteria("medico"));
	}
	
	public Reserva_bloqueCriteria createReserva_bloqueCriteria() {
		return new Reserva_bloqueCriteria(createCriteria("reserva_bloque"));
	}
	
	public Hora_medica uniqueHora_medica() {
		return (Hora_medica) super.uniqueResult();
	}
	
	public Hora_medica[] listHora_medica() {
		java.util.List list = super.list();
		return (Hora_medica[]) list.toArray(new Hora_medica[list.size()]);
	}
}

