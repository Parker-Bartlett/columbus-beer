package org.wecancodeit.columbusbeer.models;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
	@Lob
	private String imgUrl;
	
	@ManyToOne
	private Category category;
	
	@OneToMany(mappedBy="beer")
	private Collection<Review> reviews;
	
	@ManyToMany
	private Collection<Tag> tags;
	
	
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
	
	
	public Beer(String beerName, Category category, String brewery, String imgUrl, Tag ...tags) {
		this.beerName = beerName;
		this.category = category;
		this.brewery = brewery;
		this.imgUrl = imgUrl;
		this.tags = Arrays.asList(tags);
		
	}


	public String getImgUrl() {
		return imgUrl;
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
	
	
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Beer [id=" + id + ", beerName=" + beerName + ", brewery=" + brewery + ", beerOverallRating="
				+ beerOverallRating + ", imgUrl=" + imgUrl + ", category=" + category + ", reviews=" + reviews
				+ ", tags=" + tags + "]";
	}
	

	
	public float getBeerOverallRating() {
		float sum = 0;
		for(Review review : reviews) {	
			sum += review.getRating();
		}
		float beerOverallRating = (sum / reviews.size());
		return beerOverallRating;
	}


	public void addTagToTags(Tag tag) {
		tags.add(tag);
	}
	
	

	public Collection<Tag> getTags() {
		return tags;
	}
}
