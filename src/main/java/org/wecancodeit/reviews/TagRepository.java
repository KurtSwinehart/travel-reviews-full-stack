package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {

	// not sure where I pulled this in from
//	public Tag save(Tag beach) {
//		return null;
//	}

	Tag findByDescription(String tagName); // query your tags to see if they exist

}
