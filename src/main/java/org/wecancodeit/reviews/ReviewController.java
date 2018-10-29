package org.wecancodeit.reviews;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviewRepo;

	@Resource
	CategoryRepository categoryRepo;

//	@Resource
//	CommentRepository commentRepo;

	@RequestMapping("/show-reviews")
	public String findAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@RequestMapping("/review")
	public String findOneReview(@RequestParam(value = "id") Long id, Model model) {
		Optional<Review> review = reviewRepo.findById(id);
		model.addAttribute("reviews", review.get());
		return "review";
	}

//	@RequestMapping("/review/add-comment")
//	public String addComment(String title, String description) {
//		Optional<Comment> comment = commentRepo.findById(id);
//		model.addAttribute("reviews", review.get());
//		reviewRepo.save("review");
//		return "review";
//	}

}
