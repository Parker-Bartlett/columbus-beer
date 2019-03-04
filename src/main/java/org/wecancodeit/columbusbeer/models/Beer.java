package org.wecancodeit.columbusbeer.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Beer {
	
	@Id
	@GeneratedValue
	private Long id;
	private String beerName;
	private String brewery;
	private float beerOverallRating;
	
	@ManyToOne
	private Category category;
	
	@OneToMany(mappedBy="beer")
	private Collection<Review> reviews;
	
	
	
	
	public Long getId() {
		return id;
	}


	public Category getCategory() {
		return category;
	}


	public Collection<Review> getReviews() {
		return reviews;
	}


	public Beer() {}
	
	
	public Beer(String beerName, Category category, String brewery) {
		this.beerName = beerName;
		this.category = category;
		this.brewery = brewery;
	}

	public String getBeerName() {
		return beerName;
	}

	public String getBeerType() {
		String style = category.getBeerType();
		return style;
	}

	public String getBrewery() {
		return brewery;
	}
	
	
	
	

	@Override
	public String toString() {
		String style = category.getBeerType();
		return "Beer [beerName=" + beerName + ", beerType=" + style + ", brewery=" + brewery + "]";
	}
	

	
	public float getBeerOverallRating() {
		float sum = 0;
		for(Review review : reviews) {	
			sum += review.getRating();
		}
		float beerOverallRating = (sum / reviews.size());
		return beerOverallRating;
	}
}
