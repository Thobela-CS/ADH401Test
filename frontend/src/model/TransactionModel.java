package model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Transaction;

@ManagedBean(name = "transaction")
@SessionScoped
public class TransactionModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;
	private String destationCountry;
	private String accountNumber;
	private double amount;

	public Transaction getTransactionEntity() {

		Transaction t = new Transaction();

		t.setName(name);
		t.setSourcePassport(sourcePassport);
		t.setDestinationPassport(destinationPassport);
		t.setDestinationBank(destinationBank);
		t.setDestationCountry(destationCountry);
		t.setAccountNumber(accountNumber);
		t.setAmount(amount);
		return t;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSourcePassport() {
		return sourcePassport;
	}

	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}

	public String getDestinationPassport() {
		return destinationPassport;
	}

	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}

	public String getDestinationBank() {
		return destinationBank;
	}

	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}

	public String getDestationCountry() {
		return destationCountry;
	}

	public void setDestationCountry(String destationCountry) {
		this.destationCountry = destationCountry;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
