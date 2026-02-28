package com.logistics.system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "logistic_operators")
public class LogisticOperator {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name", nullable = false, length = 120)
	private String name;
	@OneToOne(optional = false)
	@JoinColumn(name = "user_login_id", nullable = false)
	private UserLogin login;
	@Embedded
	private HandHeld hand;
}
