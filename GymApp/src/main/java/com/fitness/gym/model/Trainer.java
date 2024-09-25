package com.fitness.gym.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Trainer")
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trainer_seq")
	@SequenceGenerator(name = "trainer_seq", sequenceName = "trainer_seq", allocationSize = 1)
	@Column(name="id",nullable = false,unique = true)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private short age;
	
	@Column(name = "salary")
	private short salary;
	
	@Column(name = "date_Of_joining")
	private Date dateOfJoining;
	
	@Column(name = "experience")
	private short experience;
	
	@Column(name = "country")
	private String country;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public short getSalary() {
		return salary;
	}
	public void setSalary(short salary) {
		this.salary = salary;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public short getExperience() {
		return experience;
	}
	public void setExperience(short experience) {
		this.experience = experience;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		
		this.country = country;
	}
	

}
