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

public class Reserva_bloqueDAO {
	public static Reserva_bloque loadReserva_bloqueByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return loadReserva_bloqueByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque getReserva_bloqueByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return getReserva_bloqueByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque loadReserva_bloqueByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return loadReserva_bloqueByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque getReserva_bloqueByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return getReserva_bloqueByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque loadReserva_bloqueByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Reserva_bloque) session.load(orm.Reserva_bloque.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque getReserva_bloqueByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Reserva_bloque) session.get(orm.Reserva_bloque.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque loadReserva_bloqueByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reserva_bloque) session.load(orm.Reserva_bloque.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque getReserva_bloqueByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reserva_bloque) session.get(orm.Reserva_bloque.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReserva_bloque(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return queryReserva_bloque(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReserva_bloque(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return queryReserva_bloque(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque[] listReserva_bloqueByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return listReserva_bloqueByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque[] listReserva_bloqueByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return listReserva_bloqueByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReserva_bloque(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Reserva_bloque as Reserva_bloque");
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
	
	public static List queryReserva_bloque(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Reserva_bloque as Reserva_bloque");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reserva_bloque", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque[] listReserva_bloqueByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryReserva_bloque(session, condition, orderBy);
			return (Reserva_bloque[]) list.toArray(new Reserva_bloque[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque[] listReserva_bloqueByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryReserva_bloque(session, condition, orderBy, lockMode);
			return (Reserva_bloque[]) list.toArray(new Reserva_bloque[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque loadReserva_bloqueByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return loadReserva_bloqueByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque loadReserva_bloqueByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return loadReserva_bloqueByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque loadReserva_bloqueByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Reserva_bloque[] reserva_bloques = listReserva_bloqueByQuery(session, condition, orderBy);
		if (reserva_bloques != null && reserva_bloques.length > 0)
			return reserva_bloques[0];
		else
			return null;
	}
	
	public static Reserva_bloque loadReserva_bloqueByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Reserva_bloque[] reserva_bloques = listReserva_bloqueByQuery(session, condition, orderBy, lockMode);
		if (reserva_bloques != null && reserva_bloques.length > 0)
			return reserva_bloques[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateReserva_bloqueByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return iterateReserva_bloqueByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReserva_bloqueByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.SintítuloPersistentManager.instance().getSession();
			return iterateReserva_bloqueByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReserva_bloqueByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Reserva_bloque as Reserva_bloque");
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
	
	public static java.util.Iterator iterateReserva_bloqueByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Reserva_bloque as Reserva_bloque");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reserva_bloque", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque createReserva_bloque() {
		return new orm.Reserva_bloque();
	}
	
	public static boolean save(orm.Reserva_bloque reserva_bloque) throws PersistentException {
		try {
			orm.SintítuloPersistentManager.instance().saveObject(reserva_bloque);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Reserva_bloque reserva_bloque) throws PersistentException {
		try {
			orm.SintítuloPersistentManager.instance().deleteObject(reserva_bloque);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Reserva_bloque reserva_bloque)throws PersistentException {
		try {
			if(reserva_bloque.getReserva() != null) {
				reserva_bloque.getReserva().reserva_bloque.remove(reserva_bloque);
			}
			
			if(reserva_bloque.getHora_medica() != null) {
				reserva_bloque.getHora_medica().setReserva_bloque(null);
			}
			
			if(reserva_bloque.getTipo_hora() != null) {
				reserva_bloque.getTipo_hora().reserva_bloque.remove(reserva_bloque);
			}
			
			return delete(reserva_bloque);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Reserva_bloque reserva_bloque, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(reserva_bloque.getReserva() != null) {
				reserva_bloque.getReserva().reserva_bloque.remove(reserva_bloque);
			}
			
			if(reserva_bloque.getHora_medica() != null) {
				reserva_bloque.getHora_medica().setReserva_bloque(null);
			}
			
			if(reserva_bloque.getTipo_hora() != null) {
				reserva_bloque.getTipo_hora().reserva_bloque.remove(reserva_bloque);
			}
			
			try {
				session.delete(reserva_bloque);
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
	
	public static boolean refresh(orm.Reserva_bloque reserva_bloque) throws PersistentException {
		try {
			orm.SintítuloPersistentManager.instance().getSession().refresh(reserva_bloque);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Reserva_bloque reserva_bloque) throws PersistentException {
		try {
			orm.SintítuloPersistentManager.instance().getSession().evict(reserva_bloque);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva_bloque loadReserva_bloqueByCriteria(Reserva_bloqueCriteria reserva_bloqueCriteria) {
		Reserva_bloque[] reserva_bloques = listReserva_bloqueByCriteria(reserva_bloqueCriteria);
		if(reserva_bloques == null || reserva_bloques.length == 0) {
			return null;
		}
		return reserva_bloques[0];
	}
	
	public static Reserva_bloque[] listReserva_bloqueByCriteria(Reserva_bloqueCriteria reserva_bloqueCriteria) {
		return reserva_bloqueCriteria.listReserva_bloque();
	}
}
