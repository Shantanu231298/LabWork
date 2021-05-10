package com.cg.lab1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author_lab1")
public class Author implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="authorId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long authorId;
	@Column(name="firstName",length = 20)
	private String firstName;
	@Column(name="middleName",length = 20)
	private String middleName;
	@Column(name="lastName",length = 20)
	private String lastName;
	@Column(name="phoneNo",length = 10)
	private String phoneNo;
	public Author(String firstName, String middleName, String lastName, String phoneNo) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	public Author() {
		//Default constructor
	}
	public Long getAuthorId() {
		return authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return String.format("authorId=%s, firstName=%s, middleName=%s, lastName=%s, phoneNo=%s", authorId,
				firstName, middleName, lastName, phoneNo);
	}
	
	
	
}
