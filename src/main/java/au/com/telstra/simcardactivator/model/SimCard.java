package au.com.telstra.simcardactivator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SimCard {

	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "iccid", unique = true)
	private String iccId;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIccId() {
		return iccId;
	}

	public void setIccid(String iccId) {
		this.iccId = iccId;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	private String customerEmail;
}
