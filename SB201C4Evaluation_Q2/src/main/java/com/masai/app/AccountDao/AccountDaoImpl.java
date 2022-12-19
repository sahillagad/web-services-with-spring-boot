package com.masai.app.AccountDao;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.masai.app.Module.Account;
import com.masai.app.Module.AccountDTO;
import com.masai.app.Utility.EMUTILITY;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Override
	public Account openAccount(Account acc) {
	   Account account=null;
		
		EntityManager em=EMUTILITY.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(acc);
		account=acc;
		
		em.getTransaction().commit();
	
		
		return account;
	}

	@Override
	public Account closeAccount(Integer accno) {
		Account acc=null;
		EntityManager em=EMUTILITY.provideEntityManager();
		Account account= em.find(Account.class,accno);
		if(account!=null) {
			em.getTransaction().begin();
			
			em.remove(account);
			acc=account;
			em.getTransaction().begin();
		}
		
		return acc;
	}

	@Override
	public Account depositAmount(Integer accno, Integer amount) {
    
		Account account=null;
		
		EntityManager em=EMUTILITY.provideEntityManager();
	   account= em.find(Account.class,accno);
		if(account!=null) {
		em.getTransaction().begin();
			account.setBalance((account.getBalance()+amount));
		em.getTransaction().commit();
		}
		return account;
	}

	@Override
	public Account withdrawAmount(int accno, Integer amount) {
		Account account=null;
		
		EntityManager em=EMUTILITY.provideEntityManager();
	   account= em.find(Account.class,accno);
		if(account!=null) {
		
			if(account.getBalance()>=amount) {
		em.getTransaction().begin();
				account.setBalance((account.getBalance()-amount));
				em.getTransaction().commit();;
			}
			
		}
		return account;
	}

	@Override
	public String transferAmount(AccountDTO dto) {
		String result="Amount is not Transfer";
		EntityManager em=EMUTILITY.provideEntityManager();

		
	     Account  srcAccount = em.find(Account.class,dto.getSrcAccno());
	     Account  desAccno = em.find(Account.class,dto.getDesAccno());
	     
	     if(srcAccount!=null && desAccno!=null ) {
	    	 
	    
	    	 
	    	
	    	if(desAccno.getBalance()>=dto.getAmount()) {
	    		em.getTransaction().begin();
	    		
	     
	    	 srcAccount.setBalance((srcAccount.getBalance()+dto.getAmount()));
	         desAccno.setBalance((desAccno.getBalance()-dto.getAmount()));
	    	 em.getTransaction().commit();
	     
	    	 result="Amount transfer Successfully..";
	    	}
	    	else {
	    	   	 result="transfer not  Successfully because low balance...";
	    		
	    	}
	     }
	     
	     
	     
		return result;
	}

}
