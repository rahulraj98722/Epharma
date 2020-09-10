package com.mvcSpring.beans;

public class Medicine {

	private int medId;
	private String medName;
	private int medPrice;
	private String medicinePurpose;
	private String manfdate;
	private String expdate;
	private String stock;
	
	
public Medicine() {
		
	}
	public Medicine(int medId, String medName, int medPrice, String medicinePurpose, String manfdate, String expdate,
			String stock) {
		super();
		this.medId = medId;
		this.medName = medName;
		this.medPrice = medPrice;
		this.medicinePurpose = medicinePurpose;
		this.manfdate = manfdate;
		this.expdate = expdate;
		this.stock = stock;
		
		
		
	}
	
	
		
	
	public int getMedId() {
		return medId;
	}
	public void setMedId(int medId) {
		this.medId = medId;
	}
	public String getMedName() {
		return medName;
	}
	public void setMedName(String medName) {
		this.medName = medName;
	}
	public int getMedPrice() {
		return medPrice;
	}
	public void setMedPrice(int medPrice) {
		this.medPrice = medPrice;
	}
	public String getMedicinePurpose() {
		return medicinePurpose;
	}
	public void setMedicinePurpose(String medicinePurpose) {
		this.medicinePurpose = medicinePurpose;
	}
	public String getManfdate() {
		return manfdate;
	}
	public void setManfdate(String manfdate) {
		this.manfdate = manfdate;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	
	
	
	
}
	


