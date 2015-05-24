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

public class Especialidad_medicoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression especialidadId;
	public final AssociationExpression especialidad;
	public final IntegerExpression medicoId;
	public final AssociationExpression medico;
	
	public Especialidad_medicoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		especialidadId = new IntegerExpression("especialidad.id", this);
		especialidad = new AssociationExpression("especialidad", this);
		medicoId = new IntegerExpression("medico.id", this);
		medico = new AssociationExpression("medico", this);
	}
	
	public Especialidad_medicoCriteria(PersistentSession session) {
		this(session.createCriteria(Especialidad_medico.class));
	}
	
	public Especialidad_medicoCriteria() throws PersistentException {
		this(orm.SintítuloPersistentManager.instance().getSession());
	}
	
	public EspecialidadCriteria createEspecialidadCriteria() {
		return new EspecialidadCriteria(createCriteria("especialidad"));
	}
	
	public MedicoCriteria createMedicoCriteria() {
		return new MedicoCriteria(createCriteria("medico"));
	}
	
	public Especialidad_medico uniqueEspecialidad_medico() {
		return (Especialidad_medico) super.uniqueResult();
	}
	
	public Especialidad_medico[] listEspecialidad_medico() {
		java.util.List list = super.list();
		return (Especialidad_medico[]) list.toArray(new Especialidad_medico[list.size()]);
	}
}

