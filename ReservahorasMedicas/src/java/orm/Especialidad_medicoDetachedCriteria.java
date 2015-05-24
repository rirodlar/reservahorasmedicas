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

public class Especialidad_medicoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression especialidadId;
	public final AssociationExpression especialidad;
	public final IntegerExpression medicoId;
	public final AssociationExpression medico;
	
	public Especialidad_medicoDetachedCriteria() {
		super(orm.Especialidad_medico.class, orm.Especialidad_medicoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		especialidadId = new IntegerExpression("especialidad.id", this.getDetachedCriteria());
		especialidad = new AssociationExpression("especialidad", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
	}
	
	public Especialidad_medicoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Especialidad_medicoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		especialidadId = new IntegerExpression("especialidad.id", this.getDetachedCriteria());
		especialidad = new AssociationExpression("especialidad", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
	}
	
	public EspecialidadDetachedCriteria createEspecialidadCriteria() {
		return new EspecialidadDetachedCriteria(createCriteria("especialidad"));
	}
	
	public MedicoDetachedCriteria createMedicoCriteria() {
		return new MedicoDetachedCriteria(createCriteria("medico"));
	}
	
	public Especialidad_medico uniqueEspecialidad_medico(PersistentSession session) {
		return (Especialidad_medico) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Especialidad_medico[] listEspecialidad_medico(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Especialidad_medico[]) list.toArray(new Especialidad_medico[list.size()]);
	}
}

