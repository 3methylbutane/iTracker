package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CandidateFeedback {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String score;
	private String comments;
	private String status;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="candidate_id")
	private CandidateDetails candidateDetails;

	public CandidateFeedback(int id, String score, String comments, String status, CandidateDetails candidateDetails) {
		super();
		this.id = id;
		this.score = score;
		this.comments = comments;
		this.status = status;
		this.candidateDetails = candidateDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateDetails candidateDetails) {
		this.candidateDetails = candidateDetails;
	}
	
}
