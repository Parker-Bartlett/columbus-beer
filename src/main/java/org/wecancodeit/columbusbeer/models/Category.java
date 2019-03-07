package org.wecancodeit.columbusbeer.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	private String beerType;
	@OneToMany(mappedBy="category")
	private Collection<Beer> beers;
	
	public Category() {}
	
	public Category(String beerType) {
		this.beerType = beerType;
	}

	public Collection<Beer> getBeers() {
		return beers;
	}

	public Long getId() {
		return id;
	}

	public String getBeerType() {
		return beerType;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", beerType=" + beerType + "]";
	}
}
