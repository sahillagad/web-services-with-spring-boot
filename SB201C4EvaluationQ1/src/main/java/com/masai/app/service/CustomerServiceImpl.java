package com.masai.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.Dao.CustomerDao;
import com.masai.app.Module.Customer;
import com.masai.app.Module.CustomerDTO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	public CustomerDao dao;
	
	@Override
	public Customer registerCustomer(Customer Customer) {
		// TODO Auto-generated method stub
		return dao.registerCustomer(Customer);
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		return dao.getCustomerById(customerId);
	}

	@Override
	public Customer loginCustomer(String email, String password) {
		// TODO Auto-generated method stub
		return dao.loginCustomer(email, password);
	}

	@Override
	public Customer updateCustomerPassword(String username, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return dao.updateCustomerPassword(username, oldPassword, newPassword);
	}

	@Override
	public List<Customer> getAllCustomerDetails() {
		// TODO Auto-generated method stub
		return dao.getAllCustomerDetails();
	}

	@Override
	public Customer deleteCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		return dao.deleteCustomerById(customerId);
	}

	@Override
	public List<Customer> getCustomerDetailsByAddress(String address) {
		// TODO Auto-generated method stub
		return dao.getCustomerDetailsByAddress(address);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.updateCustomer(customer);
	}

	@Override
	public List<Customer> getCustomersBetweenAge(Integer start_age, Integer end_age) {
		// TODO Auto-generated method stub
		return dao.getCustomersBetweenAge(start_age, end_age) ;
	}

	@Override
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers() {
		// TODO Auto-generated method stub
		return dao.getNameAddressAgeOfAllCustomers();
	}

	
	
}

