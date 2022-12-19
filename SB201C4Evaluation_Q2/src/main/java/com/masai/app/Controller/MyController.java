package com.masai.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.Module.Account;
import com.masai.app.Module.AccountDTO;
import com.masai.app.service.AccountService;

@RestController
public class MyController {

	
	@Autowired
	private AccountService accountService;
	
	
	@PostMapping("/openAccount")
	public Account  openAccount(@RequestBody Account acc) {
		
	Account account= accountService.openAccount(acc);	
	return 	account;
	
	}
	
    
	@GetMapping("/closeAccount/{accno}")
	private Account CloseAmount(@PathVariable("accno") Integer accno) {
		
		Account account=accountService.closeAccount(accno);		
		return account;
	}
	
	

	@GetMapping("/withdrawAccount/{accno}/{amount}")
	private Account withdrawAmount(@PathVariable("accno") Integer accno,@PathVariable("amount") Integer amount) {
		
		
		Account account=accountService.withdrawAmount(accno, amount);		
		return account;
	}
   	
	@GetMapping("/depositAccount/{accno}/{amount}")
	private Account depositAmount(@PathVariable("accno") Integer accno,@PathVariable("amount") Integer amount) {
		
		
		Account account=accountService.depositAmount(accno, amount);		
		return account;
	}
	
	@PostMapping("/transferAmount")
	public String  transferAmount(@RequestBody AccountDTO accountDTO) {
		
	String s=  accountService.transferAmount(accountDTO);	
	return 	s ;
	
	}

   	
}
