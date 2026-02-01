package com.logistics.system.model;

import jakarta.persistence.*;

public class Package {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Enumerated(EnumType.STRING)
	private Region region;
	
	@Enumerated(EnumType.STRING)
	private PackageStatus status;
}
