package org.wecancodeit.columbusbeer.models;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue
	private Long id;
	private String tagName;
	@ManyToMany (mappedBy="tags")
	private Collection<Beer> beers;
	
	public Tag() {}
	
	public Tag(String stringOfTags) {
		this.tagName = stringOfTags;		
	}
	
	public Collection<Beer> getBeers() {
		return beers;
	}
	
	public String getTagName() {
		return tagName;
	}

	public Long getId() {
		return id;
	}

	public String getStringOfTags() {
		return tagName;
	}

	@Override
	public String toString() {
		return "Tag [id=" + id + ", stringOfTags=" + tagName + "]";
	}	
}
