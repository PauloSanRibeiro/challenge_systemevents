package br.com.prsribeiro.systemevents.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBACTI")
public class Activity {
	
	private Integer id;
	private String name;
	private String description;
	private Double price;
}
