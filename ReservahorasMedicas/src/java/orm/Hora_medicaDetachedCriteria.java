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

public class Hora_medicaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression boxId;
	public final AssociationExpression box;
	public final IntegerExpression medicoId;
	public final AssociationExpression medico;
	public final TimestampExpression hora_inicio;
	public final IntegerExpression tiempo_periodo;
	public final IntegerExpression reserva_bloqueId;
	public final AssociationExpression reserva_bloque;
	
	public Hora_medicaDetachedCriteria() {
		super(orm.Hora_medica.class, orm.Hora_medicaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		boxId = new IntegerExpression("box.id_box", this.getDetachedCriteria());
		box = new AssociationExpression("box", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
		hora_inicio = new TimestampExpression("hora_inicio", this.getDetachedCriteria());
		tiempo_periodo = new IntegerExpression("tiempo_periodo", this.getDetachedCriteria());
		reserva_bloqueId = new IntegerExpression("reserva_bloque.id", this.getDetachedCriteria());
		reserva_bloque = new AssociationExpression("reserva_bloque", this.getDetachedCriteria());
	}
	
	public Hora_medicaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Hora_medicaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		boxId = new IntegerExpression("box.id_box", this.getDetachedCriteria());
		box = new AssociationExpression("box", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
		hora_inicio = new TimestampExpression("hora_inicio", this.getDetachedCriteria());
		tiempo_periodo = new IntegerExpression("tiempo_periodo", this.getDetachedCriteria());
		reserva_bloqueId = new IntegerExpression("reserva_bloque.id", this.getDetachedCriteria());
		reserva_bloque = new AssociationExpression("reserva_bloque", this.getDetachedCriteria());
	}
	
	public BoxDetachedCriteria createBoxCriteria() {
		return new BoxDetachedCriteria(createCriteria("box"));
	}
	
	public MedicoDetachedCriteria createMedicoCriteria() {
		return new MedicoDetachedCriteria(createCriteria("medico"));
	}
	
	public Reserva_bloqueDetachedCriteria createReserva_bloqueCriteria() {
		return new Reserva_bloqueDetachedCriteria(createCriteria("reserva_bloque"));
	}
	
	public Hora_medica uniqueHora_medica(PersistentSession session) {
		return (Hora_medica) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hora_medica[] listHora_medica(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hora_medica[]) list.toArray(new Hora_medica[list.size()]);
	}
}

