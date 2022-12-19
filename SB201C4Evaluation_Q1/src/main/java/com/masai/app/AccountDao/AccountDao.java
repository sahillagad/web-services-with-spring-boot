package com.masai.app.AccountDao;

import com.masai.app.Module.Account;
import com.masai.app.Module.AccountDTO;

public interface AccountDao {
	public Account openAccount(Account acc);
	public Account closeAccount(Integer accno);
	public Account depositAmount(Integer accno, Integer amount);
	public Account withdrawAmount(int accno, Integer amount);
	public String transferAmount(AccountDTO dto);
	
}
