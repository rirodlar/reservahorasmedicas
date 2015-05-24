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

public class Tipo_horaDAO {
	public static Tipo_hora loadTipo_horaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return loadTipo_horaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora getTipo_horaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return getTipo_horaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora loadTipo_horaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return loadTipo_horaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora getTipo_horaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return getTipo_horaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora loadTipo_horaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Tipo_hora) session.load(orm.Tipo_hora.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora getTipo_horaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Tipo_hora) session.get(orm.Tipo_hora.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora loadTipo_horaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tipo_hora) session.load(orm.Tipo_hora.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora getTipo_horaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tipo_hora) session.get(orm.Tipo_hora.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipo_hora(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return queryTipo_hora(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipo_hora(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return queryTipo_hora(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora[] listTipo_horaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return listTipo_horaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora[] listTipo_horaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return listTipo_horaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipo_hora(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipo_hora as Tipo_hora");
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
	
	public static List queryTipo_hora(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipo_hora as Tipo_hora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipo_hora", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora[] listTipo_horaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipo_hora(session, condition, orderBy);
			return (Tipo_hora[]) list.toArray(new Tipo_hora[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora[] listTipo_horaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipo_hora(session, condition, orderBy, lockMode);
			return (Tipo_hora[]) list.toArray(new Tipo_hora[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora loadTipo_horaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return loadTipo_horaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora loadTipo_horaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return loadTipo_horaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora loadTipo_horaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tipo_hora[] tipo_horas = listTipo_horaByQuery(session, condition, orderBy);
		if (tipo_horas != null && tipo_horas.length > 0)
			return tipo_horas[0];
		else
			return null;
	}
	
	public static Tipo_hora loadTipo_horaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tipo_hora[] tipo_horas = listTipo_horaByQuery(session, condition, orderBy, lockMode);
		if (tipo_horas != null && tipo_horas.length > 0)
			return tipo_horas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipo_horaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return iterateTipo_horaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipo_horaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return iterateTipo_horaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipo_horaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipo_hora as Tipo_hora");
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
	
	public static java.util.Iterator iterateTipo_horaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipo_hora as Tipo_hora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipo_hora", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora createTipo_hora() {
		return new orm.Tipo_hora();
	}
	
	public static boolean save(orm.Tipo_hora tipo_hora) throws PersistentException {
		try {
			orm.SintítuloPersistentManager.instance().saveObject(tipo_hora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Tipo_hora tipo_hora) throws PersistentException {
		try {
			orm.SintítuloPersistentManager.instance().deleteObject(tipo_hora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Tipo_hora tipo_hora)throws PersistentException {
		try {
			orm.Reserva_bloque[] lReserva_bloques = tipo_hora.reserva_bloque.toArray();
			for(int i = 0; i < lReserva_bloques.length; i++) {
				lReserva_bloques[i].setTipo_hora(null);
			}
			return delete(tipo_hora);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Tipo_hora tipo_hora, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Reserva_bloque[] lReserva_bloques = tipo_hora.reserva_bloque.toArray();
			for(int i = 0; i < lReserva_bloques.length; i++) {
				lReserva_bloques[i].setTipo_hora(null);
			}
			try {
				session.delete(tipo_hora);
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
	
	public static boolean refresh(orm.Tipo_hora tipo_hora) throws PersistentException {
		try {
			orm.SintítuloPersistentManager.instance().getSession().refresh(tipo_hora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Tipo_hora tipo_hora) throws PersistentException {
		try {
			orm.SintítuloPersistentManager.instance().getSession().evict(tipo_hora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_hora loadTipo_horaByCriteria(Tipo_horaCriteria tipo_horaCriteria) {
		Tipo_hora[] tipo_horas = listTipo_horaByCriteria(tipo_horaCriteria);
		if(tipo_horas == null || tipo_horas.length == 0) {
			return null;
		}
		return tipo_horas[0];
	}
	
	public static Tipo_hora[] listTipo_horaByCriteria(Tipo_horaCriteria tipo_horaCriteria) {
		return tipo_horaCriteria.listTipo_hora();
	}
}
