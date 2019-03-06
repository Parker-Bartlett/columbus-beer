package org.wecancodeit.columbusbeer.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	
	@Id
	@GeneratedValue
	private Long id;
	private String comment;

	@ManyToOne
	private Review review;
	
	public Comment() {}
	
	public Comment(String comment, Review review) {
		this.comment = comment;
		this.review = review;
	}

	public Long getId() {
		return id;
	}

	public String getComment() {
		return comment;
	}

	public Review getReview() {
		return review;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", comment=" + comment + ", review=" + review + "]";
	}
}