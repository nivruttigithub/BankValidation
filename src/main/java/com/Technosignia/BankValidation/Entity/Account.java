package com.Technosignia.BankValidation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Account_TBL")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Account {
	@Id
	@GeneratedValue
	 private int accno;
    private String accholdername;
    private String acctype;
    private String bankname;
    private Long accbalance;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccholdername() {
		return accholdername;
	}
	public void setAccholdername(String accholdername) {
		this.accholdername = accholdername;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public Long getAccbalance() {
		return accbalance;
	}
	public void setAccbalance(Long accbalance) {
		this.accbalance = accbalance;
	}

	public static Account build(int accno, String accholdername, Long accbalance, String acctype, String bankname) {
		Account account=new Account();
		account.setAccno(accno);
		account.setAccholdername(accholdername);
		account.setAcctype(acctype);
		account.setBankname(bankname);
		account.setAccbalance(accbalance);
		return account;
		
	}
    
}