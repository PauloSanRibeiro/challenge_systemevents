package br.com.prsribeiro.systemevents.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBCATE")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String descripton;

	@OneToMany(mappedBy = "category")
	private List<Activity> activitys = new ArrayList<>();

	public Category() {
	}

	public Category(Integer id, String descripton) {

		this.id = id;
		this.descripton = descripton;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripton() {
		return descripton;
	}

	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}

	public List<Activity> getActivitys() {
		return activitys;
	}

}
