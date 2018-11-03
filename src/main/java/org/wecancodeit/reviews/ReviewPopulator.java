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

	@Resource
	private TagRepository tagRepo;

	@Override
	public void run(String... args) throws Exception {

		Category caribbean = new Category("Caribbean", "/images/caribbean1.jpg");
		caribbean = categoryRepo.save(caribbean);

		Category europe = new Category("Europe", "/images/europe1.jpg");
		europe = categoryRepo.save(europe);

		Category nationalParks = new Category("National Parks", "/images/nationalParks1.jpg");
		nationalParks = categoryRepo.save(nationalParks);

		Tag beach = new Tag("beach");
		beach = tagRepo.save(beach);

		Tag scenic = new Tag("scenic");
		scenic = tagRepo.save(scenic);

		Tag dollars = new Tag("U.S. Dollars");
		dollars = tagRepo.save(dollars);

		Tag euros = new Tag("Euros");
		euros = tagRepo.save(euros);

		Tag pesos = new Tag("Mexican Pesos");
		pesos = tagRepo.save(pesos);

		Tag jamaicanDollars = new Tag("Jamaican dollars");
		jamaicanDollars = tagRepo.save(jamaicanDollars);

		Tag quetzal = new Tag("Guatemalan Quetzal");
		quetzal = tagRepo.save(quetzal);

		Tag car = new Tag("car");
		car = tagRepo.save(car);

		Tag boat = new Tag("boat");
		boat = tagRepo.save(boat);

		Tag plane = new Tag("plane");
		plane = tagRepo.save(plane);

		Tag wine = new Tag("wine");
		wine = tagRepo.save(wine);

		Review cancun = new Review("Cancun",
				"<b>LODGING OPTIONS</b> <br /><br /><b>Resort 1:</b> Lorem ipsum dolor amet cloud bread fixie before "
						+ "they sold out live-edge, enamel pin bitters offal literally pour-over vexillologist scenester leggings hashtag."
						+ "  <br /> <br /><b>Resort 2:</b> Fingerstache four dollar toast everyday carry, umami wolf truffaut jean shorts cliche mixtape "
						+ "ethical. Viral shabby chic iPhone freegan enamel pin polaroid. <br /><br /><b>Resort 3:</b> Artisan wolf hoodie fam hot chicken "
						+ "jianbing. Yuccie bitters pop-up marfa paleo bicycle rights knausgaard hammock.",
				"Blog poke slow-carb tilde, subway tile pinterest letterpress occupy offal XOXO williamsburg"
						+ " keytar selfies mixtape crucifix. Semiotics man bun cred deep v meh intelligentsia disrupt "
						+ "taxidermy narwhal small batch salvia ramps. Meditation DIY gentrify woke, tumblr pug blue bottle"
						+ " church-key. Keytar smithen salvia occupy gluten-free, copper mug taxidermy. Ramps next level microdosing "
						+ "pitchfork edison bulb. DIY skateboard microdosing hella pickled pork belly mumblecore coloring book activated charcoal master "
						+ "cleanse pitchfork pinterest affogato. Poke knausgaard lomo wolf messenger bag PBR&B freegan chartreuse occupy gastropub pabst church-key cold-pressed. ",
				"/images/cancun1.jpg", caribbean, beach, boat, plane, dollars, pesos);
		cancun = reviewRepo.save(cancun);

		Review jamaica = new Review("Jamaica",
				"<b>LODGING OPTIONS</b> <br /><br /><b>Resort 1:</b> Vegan man bun gochujang, bicycle rights occupy ramps pour-over seitan "
						+ "try-hard unicorn XOXO. <br /><br /><b>Resort 2:</b> Brooklyn prism iPhone, pickled waistcoat everyday carry ethical dreamcatcher kitsch "
						+ "selfies trust fund 90's portland tumblr pour-over. <br /><br /><b>Resort 3:</b> Shoreditch beard kickstarter tattooed, pour-over aesthetic "
						+ "freegan etsy single-origin coffee master cleanse sartorial ethical celiac brunch.",
				"Lorem ipsum dolor amet yOLO tumblr mlkshk butcher. Viral twee lyft, bicycle rights selfies af hexagon succulents poutine ethical mumblecore "
						+ "synth mlkshk hella taxidermy. Cray organic scenester, copper mug four dollar toast lyft beard fashion axe hexagon twee "
						+ "fanny pack bushwick. Pok pok pitchfork austin sriracha everyday carry, yuccie green juice edison bulb. Poke knausgaard lomo wolf messenger "
						+ "bag PBR&B freegan chartreuse occupy gastropub pabst church-key cold-pressed. Intelligentsia man braid celiac fashion axe forage whatever pok "
						+ "pok trust fund. Humblebrag unicorn locavore, subway tile beard tbh af church-key franzen.",
				"/images/jamaica1.jpg", caribbean, beach, boat, plane, dollars, jamaicanDollars);
		jamaica = reviewRepo.save(jamaica);

		Review guatemala = new Review("Guatemala",
				"<b>LODGING OPTIONS</b> <br /><br /><b>Hotel 1:</b> Lumbersexual wolf kinfolk unicorn blue bottle, street art yr deep v selvage neutra "
						+ "food truck scenester leggings cardigan. <br /><br /><b>Hotel 2:</b> Air plant wayfarers gentrify paleo poke authentic hell of bespoke.  <br />"
						+ "<br /><b>Hotel 3:</b> Biodiesel pitchfork tousled kitsch before they sold out bitters vexillologist kinfolk.",
				"Taxidermy locavore cloud bread synth raclette fashion axe. Paleo enamel pin meh tattooed. "
						+ "Four dollar toast readymade palo santo messenger bag, affogato waistcoat street art before "
						+ "they sold out subway tile venmo flexitarian biodiesel chillwave vape. La croix bitters trust fund, "
						+ "pop-up yuccie keytar cray kogi celiac hashtag locavore. Farm-to-table tofu fam forage cornhole. Artisan keffiyeh flexitarian etsy blue bottle "
						+ "shabby chic. Vexillologist PBR&B meh master cleanse. Hexagon vinyl deep v bicycle rights knausgaard glossier truffaut. Subway tile keffiyeh yuccie, "
						+ "meggings celiac normcore crucifix banh mi coloring book. ",
				"/images/guate1.jpg", caribbean, beach, boat, plane, car, quetzal);
		guatemala = reviewRepo.save(guatemala);

		Review amsterdam = new Review("Amsterdam",
				"<b>LODGING OPTIONS</b> <br /><br /><b>Hotel 1:</b> Microdosing af photo booth cred normcore flannel. Whatever "
						+ "hell of artisan mustache lo-fi. <br /><br /><b>Hotel 2:</b> Enamel pin meggings cloud bread pop-up readymade. Direct trade "
						+ "vegan gentrify glossier. <br /><br /><b>Hostel options:</b> Poke taiyaki try-hard slow-carb craft beer pour-over fixie PBR&B vape "
						+ "readymade etsy williamsburg.",
				"Lorem ipsum dolor amet nostrud dolore ipsum keytar organic. Yr iceland la croix ennui, distillery "
						+ "tattooed succulents neutra direct trade. Mustache bespoke magna cred hella. In banjo organic craft "
						+ "beer ullamco lumbersexual pariatur. Selvage gochujang cardigan sriracha, "
						+ "lorem succulents et. Art party single-origin coffee kitsch pork belly cray fingerstache. Readymade cronut unicorn you probably haven't heard "
						+ "of them, iPhone whatever man braid yuccie adaptogen quinoa schlitz tote bag fam. Master cleanse authentic YOLO dreamcatcher literally "
						+ "intelligentsia pabst photo booth artisan.",
				"/images/amsterdam1.jpg", europe, euros, plane);
		amsterdam = reviewRepo.save(amsterdam);

		Review france = new Review("France",
				"<b>LODGING OPTIONS</b> <br /><br /><b>Hotel 1:</b> Locavore readymade enamel pin brooklyn hell of, offal fanny "
						+ "pack man braid kitsch shabby chic plaid. <br /><br /><b>Hotel 2:</b> Pitchfork tacos semiotics, ramps banjo pour-over "
						+ "tousled bicycle rights four dollar toast iceland keffiyeh kogi chia tumblr hashtag. <br /><br /><b>Hostel options:</b> Shaman "
						+ "af vape, actually plaid tofu waistcoat pop-up readymade.",
				"Try-hard authentic four dollar toast ut cornhole retro dreamcatcher incididunt mollit cliche"
						+ " ramps flexitarian 3 wolf moon consectetur woke. You probably haven't heard of them forage "
						+ "wolf literally man braid small batch. Ut next level succulents vinyl, cronut adaptogen tacos "
						+ "laborum quis eu. Do pinterest mixtape cray yr. Hella vinyl brooklyn you probably haven't heard of them fingerstache dreamcatcher venmo "
						+ "crucifix fanny pack meditation cold-pressed jean shorts. 8-bit pop-up next level gentrify intelligentsia. Banjo cronut pok pok, neutra "
						+ "scenester etsy normcore pug subway tile keytar hoodie unicorn.",
				"/images/france1.jpg", europe, euros, plane, wine);
		france = reviewRepo.save(france);

		Review italy = new Review("Italy",
				"<b>LODGING OPTIONS</b> <br /><br /><b>Hotel 1:</b> Polaroid flexitarian biodiesel distillery chambray. Shoreditch DIY "
						+ "cardigan williamsburg gastropub mixtape hashtag vice blue bottle. <br /><br /><b>Hotel 2:</b> Trust fund blog leggings slow-carb, seitan "
						+ "farm-to-table put a bird on it man bun. Venmo cred crucifix artisan aesthetic PBR&B la croix four dollar toast selfies pitchfork."
						+ "  <br /><br /><b>Hostel options:</b> Ramps lumbersexual man bun 3 wolf moon fixie put a bird on it organic godard yuccie migas sartorial "
						+ "lo-fi. Shoreditch church-key single-origin coffee vinyl, put a bird on it 3 wolf moon ramps raw denim.",
				"Ea man bun "
						+ "veniam, in stumptown next level twee nulla af hexagon swag biodiesel dreamcatcher plaid. Adipisicing "
						+ "cold-pressed thundercats, kitsch DIY schlitz cillum labore single-origin coffee. Pug mixtape blog green "
						+ "juice tattooed nostrud post-ironic nulla tbh. Tousled lyft distillery asymmetrical. Ennui lumbersexual poke schlitz photo booth hammock "
						+ "man braid taiyaki art party. Kinfolk marfa blue bottle lumbersexual, aesthetic small batch butcher tousled photo booth fixie leggings echo "
						+ "park chartreuse. Disrupt williamsburg unicorn schlitz flexitarian fam photo booth ugh VHS shaman coloring book. ",
				"/images/italy1.jpg", europe, euros, plane, beach, wine);
		italy = reviewRepo.save(italy);

		Review grandCanyon = new Review("Grand Canyon",
				"<b>LODGING OPTIONS</b> <br /><br /><b>Hotel 1:</b> Before they sold out pitchfork banjo chia pug tofu "
						+ "stumptown edison bulb distillery knausgaard.  <br /><br /><b>Hotel 2:</b> Taiyaki succulents wayfarers, chicharrones "
						+ "organic vinyl pork belly slow-carb flannel blue bottle disrupt ethical vaporware affogato.  <br /><br /><b>Camping options:</b> Austin "
						+ "pickled you probably haven't heard of them master cleanse disrupt. Kogi pabst austin cliche.",
				"IPhone copper mug dolore "
						+ "ramps. Cardigan tote bag labore, retro butcher do fam typewriter duis occupy chillwave "
						+ "laboris you probably haven't heard of them man bun cloud bread. Cold-pressed shabby chic "
						+ "church-key semiotics. Banh mi hoodie meh church-key four dollar toast. Heirloom dreamcatcher marfa gluten-free salvia franzen pork "
						+ "belly cray helvetica umami photo booth air plant four dollar toast. Salvia pork belly put a bird on it pabst. Cold-pressed chartreuse "
						+ "pug 3 wolf moon, waistcoat jianbing activated charcoal la croix flannel blog stumptown meggings retro hashtag vaporware. ",
				"/images/grandCanyon1.jpg", nationalParks, car, scenic, dollars);
		grandCanyon = reviewRepo.save(grandCanyon);

		Review yellowstone = new Review("Yellowstone",
				"<b>LODGING OPTIONS</b><br /><br /><b>Hotel 1:</b> Cray shaman shabby chic twee, enamel pin four "
						+ "dollar toast trust fund shoreditch etsy succulents wolf fanny pack. <br /><br /><b>Hotel 2:</b> Pug forage copper "
						+ "mug skateboard, kombucha organic kale chips stumptown yr vape locavore crucifix. <br /><br /><b>Camping options:</b> Narwhal "
						+ "letterpress mumblecore, church-key cornhole jianbing hammock celiac aesthetic neutra.",
				"Pour-over 3 wolf moon keffiyeh, "
						+ "edison bulb offal non shaman cred. Mustache dolore gentrify chartreuse, adipisicing snackwave"
						+ " lo-fi franzen. Freegan poutine in mollit laboris officia. Umami shabby chic kitsch cornhole "
						+ "intelligentsia adipisicing tumblr synth vexillologist occaecat. Synth labore YOLO ex, cronut "
						+ "street art pok pok polaroid snackwave. Raclette glossier austin pabst pop-up biodiesel retro brooklyn. Squid VHS pop-up stumptown "
						+ "iPhone mumblecore viral man braid neutra banjo tacos art party poutine organic. Fanny pack tofu organic, biodiesel before they "
						+ "sold out swag gluten-free man bun.",
				"/images/yellowstone1.jpg", nationalParks, car, scenic, dollars);
		yellowstone = reviewRepo.save(yellowstone);

		Review everglades = new Review("Everglades",
				"<b>LODGING OPTIONS</b><br /><br /><b>Hotel 1:</b> Lo-fi microdosing palo santo mumblecore, direct "
						+ "trade woke hot chicken snackwave celiac umami skateboard coloring book sustainable.  <br /><br /><b>Hotel 2:</b> Yr "
						+ "quinoa hexagon, schlitz viral semiotics cred 8-bit mumblecore vexillologist selvage cronut dreamcatcher hashtag "
						+ "adaptogen. <br /><br /><b>Camping options:</b> Copper mug lyft fashion axe shaman actually. Swag pickled keytar heirloom.",
				"In man braid duis in drinking "
						+ "vinegar, craft beer bushwick artisan master cleanse blue bottle dolore. Sustainable hell of ut "
						+ "beard thundercats jianbing. Cloud bread tumeric cillum master cleanse fingerstache. Thundercats "
						+ "90's vexillologist vinyl shoreditch church-key. Church-key cray aesthetic, chia eu humblebrag "
						+ "taxidermy crucifix aliquip hella pug authentic dolor. Tousled godard church-key, offal drinking "
						+ "vinegar readymade forage jean shorts keytar lomo shoreditch raclette occupy chia. Vice pok pok roof party, drinking "
						+ "vinegar gentrify cred tote bag VHS hashtag williamsburg ugh +1 beard. Yr af butcher umami, prism next level cloud bread. ",
				"/images/everglades1.jpg", nationalParks, car, scenic, dollars);
		everglades = reviewRepo.save(everglades);
	}
}
