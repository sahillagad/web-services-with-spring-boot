package com.masai.app.Module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer transactionId; 
	private  Integer srcAccno;
	private Integer desAccno;
    private	Integer amount;
	public AccountDTO(Integer srcAccno, Integer desAccno, Integer amount) {
		super();
		this.srcAccno = srcAccno;
		this.desAccno = desAccno;
		this.amount = amount;
	}
	
	
	public AccountDTO(Integer transactionId, Integer srcAccno, Integer desAccno, Integer amount) {
		super();
		this.transactionId = transactionId;
		this.srcAccno = srcAccno;
		this.desAccno = desAccno;
		this.amount = amount;
	}


	public AccountDTO() {
		super();
	}
	public Integer getSrcAccno() {
		return srcAccno;
	}
	public void setSrcAccno(Integer srcAccno) {
		this.srcAccno = srcAccno;
	}
	public Integer getDesAccno() {
		return desAccno;
	}
	public void setDesAccno(Integer desAccno) {
		this.desAccno = desAccno;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public Integer getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}


	@Override
	public String toString() {
		return "AccountDTO [srcAccno=" + srcAccno + ", desAccno=" + desAccno + ", amount=" + amount + "]";
	}
   
   
    
    
}
