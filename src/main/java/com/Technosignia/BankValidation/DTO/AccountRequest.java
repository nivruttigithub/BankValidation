package com.Technosignia.BankValidation.DTO;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class AccountRequest {
    @NotNull(message = "accholdername shouldn't be null")
    private String accholdername;
    @NotNull(message="acctype not be Null")
    private String acctype;
//    @Pattern(regexp = "^\\d{10}$",message = "invalid bank name entered ")
    private String bankname;
    @Min(1000)
    @Max(1000000)
    private Long accbalance;
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

}

