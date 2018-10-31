package org.wecancodeit.reviews;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private Tag tag;

	@JsonIgnore
	@ManyToOne
	private Category category;

	@JsonIgnore
	@ManyToMany
	private Collection<Tag> tags;

	@JsonIgnore
	@OneToMany(mappedBy = "review")
	private Collection<Comment> comments;

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

	public Category getCategory() {
		return category;
	}

	// ?? not sure if this part is correct
	public Tag getTags() {
		return tag;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public Review() {

	}

	public Review(String name, String resortOptions, String content, String image, Category category, Tag... tags) {
		this.name = name;
		this.resortOptions = resortOptions;
		this.content = content;
		this.image = image;
		this.category = category;
		this.tags = new HashSet<>(Arrays.asList(tags));
	}

	// allowing the collection to add this tag we created in our form
	public void addTag(Tag newTag) {
		tags.add(newTag);
	}

	// allowing the collection to have a tag removed
	public void removeTag(Tag tagToRemove) {
		tags.remove(tagToRemove);
	}

//	public String getTags() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
