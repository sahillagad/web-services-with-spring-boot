package com.masai.app.service;

import com.masai.app.Module.Account;
import com.masai.app.Module.AccountDTO;

public interface AccountService {

	    

		public Account openAccount(Account acc);
		public Account closeAccount(Integer accno);
		public Account depositAmount(Integer accno, Integer amount);
		public Account withdrawAmount(int accno, Integer amount);
		public String transferAmount(AccountDTO dto);
		
	}
