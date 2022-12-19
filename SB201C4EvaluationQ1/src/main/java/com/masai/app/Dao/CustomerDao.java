package com.masai.app.Dao;

import java.util.List;

import com.masai.app.Module.Customer;
import com.masai.app.Module.CustomerDTO;

public interface CustomerDao {
	
	public Customer registerCustomer(Customer Customer);
	public Customer getCustomerById(Integer customerId);
	public Customer loginCustomer(String email, String password);
	public Customer updateCustomerPassword(String username, String oldPassword,String newPassword) ;
	public List<Customer> getAllCustomerDetails();
	public Customer deleteCustomerById(Integer customerId);
	public List<Customer> getCustomerDetailsByAddress(String address);
	public Customer updateCustomer(Customer customer);
	public List<Customer> getCustomersBetweenAge(Integer start_age, Integer end_age);
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers();
	

}
