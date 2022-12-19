package com.masai.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.AccountDao.AccountDao;
import com.masai.app.Module.Account;
import com.masai.app.Module.AccountDTO;

@Service
public class AccountServiceImpl implements AccountService{

	
	@Autowired
	private AccountDao dao;
	
	
	@Override
	public Account openAccount(Account acc) {
		 Account account=  dao.openAccount(acc);
		return account;
	}

	@Override
	public Account closeAccount(Integer accno) {
		
	  Account account=	dao.closeAccount(accno);
		return account ;
	}

	@Override
	public Account depositAmount(Integer accno, Integer amount) {
		
		Account account=dao.depositAmount(accno, amount);
		return account;
	}

	@Override
	public Account withdrawAmount(int accno, Integer amount) {
		
		Account account=dao.withdrawAmount(accno, amount);
		return account;

	}

	@Override
	public String transferAmount(AccountDTO dto) {
		String s=dao.transferAmount(dto);
		return s;
	}
	
	

}
