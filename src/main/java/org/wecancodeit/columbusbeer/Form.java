package org.wecancodeit.columbusbeer;

public class Form {
	private String beer;
	private String review;
	
	public Form(String beer, String review) {
		this.beer = beer;
		this.review = review;
	}
	
	public String getBeer() {
		return beer;
	}
	
	public String getReview() {
		return review;
	}
}
