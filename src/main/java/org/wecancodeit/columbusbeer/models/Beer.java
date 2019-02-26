package org.wecancodeit.columbusbeer.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beer {
	
	@Id
	@GeneratedValue
	private long id;
	private String beerName;
	private String beerType;
	private String brewery;
	
	public Beer() {}
	
	public Beer(String beerName, String beerType, String brewery) {
		this.beerName = beerName;
		this.beerType = beerType;
		this.brewery = brewery;
	}

	public String getBeerName() {
		return beerName;
	}

	public String getBeerType() {
		return beerType;
	}

	public String getBrewery() {
		return brewery;
	}

	@Override
	public String toString() {
		return "Beer [beerName=" + beerName + ", beerType=" + beerType + ", brewery=" + brewery + "]";
	}
}
