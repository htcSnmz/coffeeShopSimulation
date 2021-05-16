package coffeeShopSimulation.Entities;

import java.util.Date;

import coffeeShopSimulation.Abstract.Entity;

public class Customer implements Entity {
	private int id;
	private String name;
	private String surname;
	private Date birthday;
	private String nationalityId;
	
	public Customer(String name, String surname, Date birthday, String nationalityId) {
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	

}
