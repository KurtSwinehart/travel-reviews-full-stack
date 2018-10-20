package org.wecancodeit.reviews;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController {

	@Resource
	CategoryRepository categoryRepo;

	@RequestMapping("/show-categories")
	public String findAllCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
	}

	@RequestMapping("/category")
	public String findOneReview(@RequestParam(value = "id") Long id, Model model) {
		Optional<Category> category = categoryRepo.findById(id);
		model.addAttribute("categories", category.get());
		return "category";
	}

}
