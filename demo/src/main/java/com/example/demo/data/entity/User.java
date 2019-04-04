package com.example.demo.data.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Column(name = "uid") Long uid;
	private @Column(name = "email") String email;
	private @Column(name = "password") String password;
	private @Column(name = "nick") String nick;
	
	@CreationTimestamp
	private @Column(name = "cdate") Timestamp cdate;
	
	@UpdateTimestamp
	private @Column(name = "udate") Timestamp udate;
	

}
