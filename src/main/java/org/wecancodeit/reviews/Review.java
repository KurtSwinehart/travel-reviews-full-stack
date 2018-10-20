package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue

	private long id;
	private String name;

	@Lob
	private String resortOptions;

	@Lob
	private String content;
	private String image;

	@ManyToOne
	private Category category;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getResortOptions() {
		return resortOptions;
	}

	public String getContent() {
		return content;
	}

	public String getImage() {
		return image;
	}

	public Review(String name, String resortOptions, String content, String image, Category category) {
		this.name = name;
		this.resortOptions = resortOptions;
		this.content = content;
		this.image = image;
		this.category = category;
	}

	public Review() {

	}

	public Category getCategory() {
		return category;
	}

}
