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

public class MedicoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final CollectionExpression hora_medica;
	public final CollectionExpression especialidad_medico;
	
	public MedicoDetachedCriteria() {
		super(orm.Medico.class, orm.MedicoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		hora_medica = new CollectionExpression("ORM_hora_medica", this.getDetachedCriteria());
		especialidad_medico = new CollectionExpression("ORM_especialidad_medico", this.getDetachedCriteria());
	}
	
	public MedicoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.MedicoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		hora_medica = new CollectionExpression("ORM_hora_medica", this.getDetachedCriteria());
		especialidad_medico = new CollectionExpression("ORM_especialidad_medico", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public Hora_medicaDetachedCriteria createHora_medicaCriteria() {
		return new Hora_medicaDetachedCriteria(createCriteria("ORM_hora_medica"));
	}
	
	public Especialidad_medicoDetachedCriteria createEspecialidad_medicoCriteria() {
		return new Especialidad_medicoDetachedCriteria(createCriteria("ORM_especialidad_medico"));
	}
	
	public Medico uniqueMedico(PersistentSession session) {
		return (Medico) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Medico[] listMedico(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Medico[]) list.toArray(new Medico[list.size()]);
	}
}

