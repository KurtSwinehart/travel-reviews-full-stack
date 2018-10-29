package org.wecancodeit.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import javax.annotation.Resource;
import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest

public class JPAMappingsTest {

	@Resource
	CategoryRepository categoryRepo;

	@Resource
	ReviewRepository reviewRepo;

	@Resource
	EntityManager entityManager;

	@Test
	public void shouldSaveAndLoadCategory() {
		Category category = categoryRepo.save(new Category("Caribbean", "Caribbean vacation spots"));
		long categoryId = category.getId();

		entityManager.flush();
		entityManager.clear();

		Optional<Category> result = categoryRepo.findById(categoryId);
		Category resultCategory = result.get();

		assertThat(resultCategory.getName(), is("Caribbean"));
	}

	@Test
	public void shouldSaveAndLoadIndividualReview() {
		Review review = reviewRepo.save(new Review("Cancun", "Cancun resort options", "content", "image", null));
		long reviewId = review.getId();

		entityManager.flush();
		entityManager.clear();

		Optional<Review> result = reviewRepo.findById(reviewId);
		Review resultReview = result.get();

		assertThat(resultReview.getName(), is("Cancun"));
	}

	@Test
	public void shouldEstablishRelationshipBetweenCategoryAndReview() {
		Category category = categoryRepo.save(new Category("Caribbean", "Caribbean vacation spots"));
		Review review1 = reviewRepo.save(new Review("Cancun", "Cancun resort options", "content", "image", category));
		Review review2 = reviewRepo.save(new Review("Jamaica", "Jamaica resort options", "content", "image", category));
		long categoryId = category.getId();
		long reviewId1 = review1.getId();
		long reviewId2 = review2.getId();

		entityManager.flush();
		entityManager.clear();

		Optional<Category> categoryOptional = categoryRepo.findById(categoryId);
		Optional<Review> reviewOptional1 = reviewRepo.findById(reviewId1);
		Optional<Review> reviewOptional2 = reviewRepo.findById(reviewId2);
		Category resultCategory = categoryOptional.get();
		Review resultReview1 = reviewOptional1.get();
		Review resultReview2 = reviewOptional2.get();
		assertThat(resultReview1.getCategory().getName(), is("Caribbean"));
		assertThat(resultCategory.getReviews(), containsInAnyOrder(resultReview1, resultReview2));
	}

//	@Test
//	public void shouldBeAbleToCreateTagsWithinReviews() {
//
//	}

	@Test
	public void shouldBeAbleToCommentOnIndividualReview() {

	}

}
