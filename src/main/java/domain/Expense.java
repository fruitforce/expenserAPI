package domain;

import java.util.Date;


public class Expense {
	
	private long id;
	private double ammount;
	private Date created;
	private String descirption;
	private String category;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getDescirption() {
		return descirption;
	}
	public void setDescirption(String descirption) {
		this.descirption = descirption;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Expense [id=" + id + ", ammount=" + ammount + ", created="
				+ created + ", descirption=" + descirption + ", category="
				+ category + "]";
	}
	
	

}
