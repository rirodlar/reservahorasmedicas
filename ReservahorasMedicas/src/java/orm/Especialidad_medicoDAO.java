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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Especialidad_medicoDAO {
	public static Especialidad_medico loadEspecialidad_medicoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return loadEspecialidad_medicoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico getEspecialidad_medicoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return getEspecialidad_medicoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico loadEspecialidad_medicoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return loadEspecialidad_medicoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico getEspecialidad_medicoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return getEspecialidad_medicoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico loadEspecialidad_medicoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Especialidad_medico) session.load(orm.Especialidad_medico.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico getEspecialidad_medicoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Especialidad_medico) session.get(orm.Especialidad_medico.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico loadEspecialidad_medicoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Especialidad_medico) session.load(orm.Especialidad_medico.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico getEspecialidad_medicoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Especialidad_medico) session.get(orm.Especialidad_medico.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEspecialidad_medico(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return queryEspecialidad_medico(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEspecialidad_medico(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return queryEspecialidad_medico(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico[] listEspecialidad_medicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return listEspecialidad_medicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico[] listEspecialidad_medicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return listEspecialidad_medicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEspecialidad_medico(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Especialidad_medico as Especialidad_medico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEspecialidad_medico(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Especialidad_medico as Especialidad_medico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Especialidad_medico", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico[] listEspecialidad_medicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEspecialidad_medico(session, condition, orderBy);
			return (Especialidad_medico[]) list.toArray(new Especialidad_medico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico[] listEspecialidad_medicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEspecialidad_medico(session, condition, orderBy, lockMode);
			return (Especialidad_medico[]) list.toArray(new Especialidad_medico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico loadEspecialidad_medicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return loadEspecialidad_medicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico loadEspecialidad_medicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return loadEspecialidad_medicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico loadEspecialidad_medicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Especialidad_medico[] especialidad_medicos = listEspecialidad_medicoByQuery(session, condition, orderBy);
		if (especialidad_medicos != null && especialidad_medicos.length > 0)
			return especialidad_medicos[0];
		else
			return null;
	}
	
	public static Especialidad_medico loadEspecialidad_medicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Especialidad_medico[] especialidad_medicos = listEspecialidad_medicoByQuery(session, condition, orderBy, lockMode);
		if (especialidad_medicos != null && especialidad_medicos.length > 0)
			return especialidad_medicos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEspecialidad_medicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return iterateEspecialidad_medicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEspecialidad_medicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return iterateEspecialidad_medicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEspecialidad_medicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Especialidad_medico as Especialidad_medico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEspecialidad_medicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Especialidad_medico as Especialidad_medico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Especialidad_medico", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico createEspecialidad_medico() {
		return new orm.Especialidad_medico();
	}
	
	public static boolean save(orm.Especialidad_medico especialidad_medico) throws PersistentException {
		try {
			orm.SintítuloPersistentManager.instance().saveObject(especialidad_medico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Especialidad_medico especialidad_medico) throws PersistentException {
		try {
			orm.SintítuloPersistentManager.instance().deleteObject(especialidad_medico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Especialidad_medico especialidad_medico)throws PersistentException {
		try {
			if(especialidad_medico.getEspecialidad() != null) {
				especialidad_medico.getEspecialidad().especialidad_medico.remove(especialidad_medico);
			}
			
			if(especialidad_medico.getMedico() != null) {
				especialidad_medico.getMedico().especialidad_medico.remove(especialidad_medico);
			}
			
			return delete(especialidad_medico);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Especialidad_medico especialidad_medico, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(especialidad_medico.getEspecialidad() != null) {
				especialidad_medico.getEspecialidad().especialidad_medico.remove(especialidad_medico);
			}
			
			if(especialidad_medico.getMedico() != null) {
				especialidad_medico.getMedico().especialidad_medico.remove(especialidad_medico);
			}
			
			try {
				session.delete(especialidad_medico);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Especialidad_medico especialidad_medico) throws PersistentException {
		try {
			orm.SintítuloPersistentManager.instance().getSession().refresh(especialidad_medico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Especialidad_medico especialidad_medico) throws PersistentException {
		try {
			orm.SintítuloPersistentManager.instance().getSession().evict(especialidad_medico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad_medico loadEspecialidad_medicoByCriteria(Especialidad_medicoCriteria especialidad_medicoCriteria) {
		Especialidad_medico[] especialidad_medicos = listEspecialidad_medicoByCriteria(especialidad_medicoCriteria);
		if(especialidad_medicos == null || especialidad_medicos.length == 0) {
			return null;
		}
		return especialidad_medicos[0];
	}
	
	public static Especialidad_medico[] listEspecialidad_medicoByCriteria(Especialidad_medicoCriteria especialidad_medicoCriteria) {
		return especialidad_medicoCriteria.listEspecialidad_medico();
	}
}
