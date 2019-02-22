package org.wecancodeit.columbusbeer;

public class Form {
	private String beer;
	private String review;
	private String title;
	private String date;
	private int rating;
	
	public Form(String beer, String review, String title, String date, int rating) {
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
