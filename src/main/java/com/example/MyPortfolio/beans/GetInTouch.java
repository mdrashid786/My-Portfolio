package com.example.MyPortfolio.beans;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class GetInTouch { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank(message = "This field can't be blank")
	private String UserName;
	//rashid
	@NotBlank(message = "This field can't be blank")
	private String userEmail;
	
	@NotBlank(message = "This field can't be blank")
	private String userComment;

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return UserName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getUserComment() {
		return userComment;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}
	
	

}
