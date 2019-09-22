package entities;

import javax.persistence.*;

@Entity(name = "transaction_tbl")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	public String Name;
	public String SourcePassport;
	public String DestinationPassport;
	public String DestinationBank;
	public String DestationCountry;
	public String AccountNumber;
	public double Amount;

	@GeneratedValue(strategy = GenerationType.AUTO)
	public String TransactionCode;

	
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSourcePassport() {
		return SourcePassport;
	}

	public void setSourcePassport(String sourcePassport) {
		SourcePassport = sourcePassport;
	}

	public String getDestinationPassport() {
		return DestinationPassport;
	}

	public void setDestinationPassport(String destinationPassport) {
		DestinationPassport = destinationPassport;
	}

	public String getDestinationBank() {
		return DestinationBank;
	}

	public void setDestinationBank(String destinationBank) {
		DestinationBank = destinationBank;
	}

	public String getDestationCountry() {
		return DestationCountry;
	}

	public void setDestationCountry(String destationCountry) {
		DestationCountry = destationCountry;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public String getTransactionCode() {
		return TransactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		TransactionCode = transactionCode;
	}

}
