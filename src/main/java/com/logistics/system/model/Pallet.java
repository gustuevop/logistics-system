package com.logistics.system.model;


import jakarta.persistence.*;
import lombok.*;

public class Pallet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String ticket;
	
	@Enumerated(EnumType.STRING)
	private Region region;
	
	@Enumerated(EnumType.STRING)
	private PalletStatus status;
}
