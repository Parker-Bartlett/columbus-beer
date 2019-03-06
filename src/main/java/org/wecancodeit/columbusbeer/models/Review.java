package org.wecancodeit.columbusbeer.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Review {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private Beer beer;
	@Lob
	private String review;
	private String title;
	private String date;
	private int rating;
	@OneToMany(mappedBy="review")
	private Collection<Comment> comments;
	
	public Review() {}
	
	public Review(Beer beer, String review, String title, String date, int rating) {
		this.beer = beer;
		this.review = review;
		this.title = title;
		this.date = date;
		this.rating = rating;
	}
	
	public Collection<Comment> getComments() {
		return comments;
	}

	public Beer getBeer() {
		return beer;
	}
	
	public String getReview() {
		return review;
	}
	public String getTitle() {
		return title;
	}
	public String getDate() {
		return date;
	}
	public int getRating() {
		return rating;
	}

	public Long getId() {
		return id;
	}

	


	public void addComment(Comment comment) {
		comments.add(comment);
	}


}