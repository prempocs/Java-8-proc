package com.ps.module;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String firstName;
	private String lastName;

	public Employee() {
		super();
	}

	private String email;
	private String mobNumber;
	private Employee manager;
	private Integer age;
	private List<Employee> team = new ArrayList<>();

	public Employee(int id, String firstName, String lastName, String email, String mobNumber, Employee manager,
			List<Employee> team, Integer age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobNumber = mobNumber;
		this.manager = manager;
		this.team.addAll(team);
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public List<Employee> getTeam() {
		return team;
	}

	public void setTeam(List<Employee> team) {
		this.team = team;
	}

	public boolean isExecutive() {
		return !team.isEmpty();
	}

	public boolean isSenior() {
		return age > 50;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobNumber=" + mobNumber + ", manager=" + manager + "]";
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
