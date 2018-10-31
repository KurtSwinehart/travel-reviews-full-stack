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

	// selected just the 'description' hashCode or equals, not sure if this was
	// correct
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tag other = (Tag) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

	// generated when "contains" was red on TagController
	// @RequestMapping("/add-tag") section
	public boolean contains(Tag existing) {
		return true;
	}

}
