package br.com.prsribeiro.systemevents.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBPART")
public class Participant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	private String email;

	@ManyToMany
	@JoinTable(name = "TBPARTACT", joinColumns = @JoinColumn(name = "TBPARTID"), inverseJoinColumns = @JoinColumn(name = "TBACTIID"))
	// SET garante integridade, unique
	private Set<Activity> activity = new HashSet<>();

	public Participant() {
	}

	public Participant(Integer id, String name, String email) {

		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Activity> getActivity() {
		return activity;
	}

}
