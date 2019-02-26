package org.wecancodeit.columbusbeer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Review {
	@Id
	@GeneratedValue
	private Long id;
	private String beer;
	@Lob
	private String review;
	private String title;
	private String date;
	private int rating;
	
	public Review() {}
	
	public Review(String beer, String review, String title, String date, int rating) {
		this.beer = beer;
		this.review = review;
		this.title = title;
		this.date = date;
		this.rating = rating;
	}
	
	public String getBeer() {
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
}
