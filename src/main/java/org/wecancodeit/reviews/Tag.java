package org.wecancodeit.reviews;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private long id;

	private String description;

	@ManyToMany(mappedBy = "tags")
	private Collection<Review> reviews;

	public long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	public Tag() {
	}

	public Tag(String description) {
		this.description = description;
	}

}
