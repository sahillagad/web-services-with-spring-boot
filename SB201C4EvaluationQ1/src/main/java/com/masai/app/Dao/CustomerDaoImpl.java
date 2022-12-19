package com.masai.app.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.masai.app.Module.Customer;
import com.masai.app.Module.CustomerDTO;
import com.masai.app.Utility.EMUTILITY;

@Repository
public class CustomerDaoImpl implements CustomerDao{

	@Override
	public Customer registerCustomer(Customer customer) {
       EntityManager em= EMUTILITY.provideEntityManager();
		em.getTransaction().begin();
       
		em.persist(customer);
		
		em.getTransaction().commit();
		return customer;
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		
	       EntityManager em= EMUTILITY.provideEntityManager();
           Customer customer=  em.find(Customer.class, customerId);
	     
           return  customer; 
	}
	

	@Override
	public Customer loginCustomer(String email, String password) {
	 
	       EntityManager em= EMUTILITY.provideEntityManager();
             
	       String jpql="Select c from Customer c where c.email=?1 AND c.password=?2";
	       Query query= em.createQuery(jpql);
		 query.setParameter(1, email);
		 query.setParameter(2, password);
		 
		 Customer customer=(Customer) query.getSingleResult();		   
	       
		 return customer;
	}

	@Override
	public Customer updateCustomerPassword(String username, String oldPassword, String newPassword) {

	       EntityManager em= EMUTILITY.provideEntityManager();
          
	       String jpql="Select c from Customer c where c.email=?1 AND c.password=?2";
	       Query query= em.createQuery(jpql);
		 query.setParameter(1, username);
		 query.setParameter(2, oldPassword);
		 
		 Customer customer=(Customer) query.getSingleResult();		   
	       
		 if(customer!=null) {
			 
			 em.getTransaction().begin();
			 
			 customer.setPassword(newPassword);
			 
			 em.getTransaction().commit();
			 
		 }
		 return customer;
	}

	@Override
	public List<Customer> getAllCustomerDetails() {

	       EntityManager em= EMUTILITY.provideEntityManager();
       
		String jpql="Select c from Coustomer c";
		Query query=em.createQuery(jpql);
		List< Customer> customers=query.getResultList();
		return customers;
		
	}

	@Override
	public Customer deleteCustomerById(Integer customerId) {
		
	       EntityManager em= EMUTILITY.provideEntityManager();
        Customer customer=  em.find(Customer.class, customerId);
	    if(customer!=null) {
	    	
	    	em.getTransaction().begin();
	    	
	    	em.remove(customer);
	    	
	    	em.getTransaction().commit();
	    }
        
        return  customer; 
	}

	@Override
	public List<Customer> getCustomerDetailsByAddress(String address) {

	       EntityManager em= EMUTILITY.provideEntityManager();
    
		String jpql="Select c from Coustomer c where address=?1";
		
		Query query=em.createQuery(jpql);
		query.setParameter(1, address);
		List< Customer> customers=query.getResultList();
		return customers;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
	       EntityManager em= EMUTILITY.provideEntityManager();
     Customer customer1=  em.find(Customer.class, customer.getCustomerId());
	    if(customer1!=null) {
	    	
	    	em.getTransaction().begin();
	    	
	         em.persist(customer);
	    	
	    	em.getTransaction().commit();
	    }
     
     return  customer; 
		
		
		
	}

	@Override
	public List<Customer> getCustomersBetweenAge(Integer start_age, Integer end_age) {
	       EntityManager em= EMUTILITY.provideEntityManager();
	       
	String jpql="Select c from Coustomer c where age>=?1 AND age<=?2";
		
		
	 Query query=em.createQuery(jpql);
	 query.setParameter(1, start_age);
	 query.setParameter(1, end_age);
      List< Customer> customers=query.getResultList();
		return customers;
	}

	@Override
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
            

	     
	
	
	
}
