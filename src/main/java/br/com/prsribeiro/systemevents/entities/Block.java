package br.com.prsribeiro.systemevents.entities;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBBLOC")
public class Block {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(columnDefinition = "TIME WITHOUT TIME ZONE")
	private Instant start;

	@Column(columnDefinition = "TIME WITHOUT TIME ZONE")
	private Instant fim;

	@ManyToOne
	@JoinColumn(name = "activityid")
	private Activity activity;

	public Block() {
	}


	public Block(Integer id, Instant start, Instant fim, Activity activity) {
		
		this.id = id;
		this.start = start;
		this.fim = fim;
		this.activity = activity;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getStart() {
		return start;
	}

	public void setStart(Instant start) {
		this.start = start;
	}

	public Instant getFim() {
		return fim;
	}

	public void setFim(Instant fim) {
		this.fim = fim;
	}


	public Activity getActivity() {
		return activity;
	}


	public void setActivity(Activity activity) {
		this.activity = activity;
	}

}
