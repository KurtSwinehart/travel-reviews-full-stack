package org.wecancodeit.reviews;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {

	@Resource
	private CategoryRepository categoryRepo;

	@Resource
	private ReviewRepository reviewRepo;

	@Override
	public void run(String... args) throws Exception {

		Category caribbean = new Category("Caribbean", "/images/caribbean1.jpg");
		caribbean = categoryRepo.save(caribbean);

		Category europe = new Category("Europe", "/images/europe1.jpg");
		europe = categoryRepo.save(europe);

		Category nationalParks = new Category("National Parks", "/images/nationalParks1.jpg");
		nationalParks = categoryRepo.save(nationalParks);

		Review cancun = new Review("Cancun",
				"Here are some resorts in Cancun. <br /><br />Resort 1. <br />Resort 2. <br />Resort 3.",
				"Blog poke slow-carb tilde, subway tile pinterest letterpress occupy offal XOXO williamsburg"
						+ " keytar selfies mixtape crucifix. Semiotics man bun cred deep v meh intelligentsia disrupt "
						+ "taxidermy narwhal small batch salvia ramps. Meditation DIY gentrify woke, tumblr pug blue bottle"
						+ " church-key. Keytar smithen salvia occupy gluten-free, copper mug taxidermy.",
				"/images/cancun1.jpg", caribbean);
		cancun = reviewRepo.save(cancun);

		Review jamaica = new Review("Jamaica",
				"Here are some resorts in Jamaica. <br /><br />Resort 1. <br />Resort 2. <br />Resort 3.",
				"Lorem ipsum dolor amet "
						+ "yOLO tumblr mlkshk butcher. Viral twee lyft, bicycle rights selfies af hexagon succulents poutine ethical mumblecore "
						+ "synth mlkshk hella taxidermy. Cray organic scenester, copper mug four dollar toast lyft beard fashion axe hexagon twee "
						+ "fanny pack bushwick. Pok pok pitchfork austin sriracha everyday carry, yuccie green juice edison bulb.",
				"/images/jamaica1.jpg", caribbean);
		jamaica = reviewRepo.save(jamaica);

		Review guatemala = new Review("Guatemala",
				"Here are some hotels in Guatemala. <br /><br />Hotel 1. <br />Hotel 2. <br />Hotel 3.",
				"Taxidermy locavore cloud bread synth raclette fashion axe. Paleo enamel pin meh tattooed. "
						+ "Four dollar toast readymade palo santo messenger bag, affogato waistcoat street art before "
						+ "they sold out subway tile venmo flexitarian biodiesel chillwave vape. La croix bitters trust fund, "
						+ "pop-up yuccie keytar cray kogi celiac hashtag locavore.",
				"/images/guate1.jpg", caribbean);
		guatemala = reviewRepo.save(guatemala);

		Review amsterdam = new Review("Amsterdam",
				"Here are some hotels in Amsterdam. <br /><br />Hotel 1. <br />Hotel 2. <br />Hotel 3.",
				"Lorem ipsum dolor amet nostrud dolore ipsum keytar organic. Yr iceland la croix ennui, distillery "
						+ "tattooed succulents neutra direct trade. Mustache bespoke magna cred hella. In banjo organic craft "
						+ "beer ullamco lumbersexual pariatur. Selvage gochujang cardigan sriracha, "
						+ "lorem succulents et.",
				"/images/amsterdam1.jpg", europe);
		amsterdam = reviewRepo.save(amsterdam);

		Review france = new Review("France",
				"Here are some hotels in France. <br /><br />Hotel 1. <br />Hotel 2. <br />Hotel 3.",
				"Try-hard authentic four dollar toast ut cornhole retro dreamcatcher incididunt mollit cliche"
						+ " ramps flexitarian 3 wolf moon consectetur woke. You probably haven't heard of them forage "
						+ "wolf literally man braid small batch. Ut next level succulents vinyl, cronut adaptogen tacos "
						+ "laborum quis eu. Do pinterest mixtape cray yr. ",
				"/images/france1.jpg", europe);
		france = reviewRepo.save(france);

		Review italy = new Review("Italy",
				"Here are some hotels in Italy. <br /><br />Hotel 1. <br />Hotel 2. <br />Hotel 3.",
				"Ea man bun "
						+ "veniam, in stumptown next level twee nulla af hexagon swag biodiesel dreamcatcher plaid. Adipisicing "
						+ "cold-pressed thundercats, kitsch DIY schlitz cillum labore single-origin coffee. Pug mixtape blog green "
						+ "juice tattooed nostrud post-ironic nulla tbh. Tousled lyft distillery asymmetrical.",
				"/images/italy1.jpg", europe);
		italy = reviewRepo.save(italy);

		Review grandCanyon = new Review("Grand Canyon",
				"Here are some hotels near the Grand Canyon. <br /><br />Hotel 1. <br />Hotel 2. <br />Hotel 3.",
				"IPhone copper mug dolore "
						+ "ramps. Cardigan tote bag labore, retro butcher do fam typewriter duis occupy chillwave "
						+ "laboris you probably haven't heard of them man bun cloud bread. Cold-pressed shabby chic "
						+ "church-key semiotics. Banh mi hoodie meh church-key four dollar toast.",
				"/images/grandCanyon1.jpg", nationalParks);
		grandCanyon = reviewRepo.save(grandCanyon);

		Review yellowstone = new Review("Yellowstone",
				"Here are some hotels near Yellowstone. <br /><br />Hotel 1. <br />Hotel 2. <br />Hotel 3.",
				"Pour-over 3 wolf moon keffiyeh, "
						+ "edison bulb offal non shaman cred. Mustache dolore gentrify chartreuse, adipisicing snackwave"
						+ " lo-fi franzen. Freegan poutine in mollit laboris officia. Umami shabby chic kitsch cornhole "
						+ "intelligentsia adipisicing tumblr synth vexillologist occaecat. Synth labore YOLO ex, cronut "
						+ "street art pok pok polaroid snackwave.",
				"/images/yellowstone1.jpg", nationalParks);
		yellowstone = reviewRepo.save(yellowstone);

		Review everglades = new Review("Everglades",
				"Here are some hotels near the Everglades. <br /><br />Hotel 1. <br />Hotel 2. <br />Hotel 3.",
				"In man braid duis in drinking "
						+ "vinegar, craft beer bushwick artisan master cleanse blue bottle dolore. Sustainable hell of ut "
						+ "beard thundercats jianbing. Cloud bread tumeric cillum master cleanse fingerstache. Thundercats "
						+ "90's vexillologist vinyl shoreditch church-key. Church-key cray aesthetic, chia eu humblebrag "
						+ "taxidermy crucifix aliquip hella pug authentic dolor.",
				"/images/everglades1.jpg", nationalParks);
		everglades = reviewRepo.save(everglades);

	}

}
