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
	private String image;

	@OneToMany(mappedBy = "category")
	private Collection<Review> reviews;

	public Category(String name, String image) {
		this.name = name;
		this.image = image;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}

	public Category() {

	}

	public Collection<Review> getReviews() {
		return reviews;
	}

}
