package service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Transaction;

/**
 * Session Bean implementation class TransactionEJB
 */
@Stateless
@LocalBean
public class TransactionEJB {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public TransactionEJB() {
		// TODO Auto-generated constructor stub
	}

	public void addNew(Transaction transactionEntity) {
		System.out.println("======== Add transaction =======");
		transactionEntity.setTransactionCode(getAllTransactionCode());
		em.persist(transactionEntity);
		System.out.println("======== Trasaction Added ======");
	}

	@SuppressWarnings("unchecked")
	public String getAllTransactionCode() {
		System.out.println("==== Get All Trasactions ====");
		List<Transaction> t = em.createQuery("SELECT t FROM transaction_tbl t").getResultList();
		int size = t.size() + 1;
		return String.format("%04d", size);
	}
}
