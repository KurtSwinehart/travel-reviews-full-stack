package org.wecancodeit.reviews;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue

	private long id;
	private String name;
	private String description;

	@OneToMany(mappedBy = "category")
	private Collection<Review> reviews;

	public Category(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Category() {

	}

	public Collection<Review> getReviews() {
		return reviews;
	}

}
